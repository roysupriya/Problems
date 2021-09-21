import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'itemsSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY items as parameter.
     */

    public static List<Integer> itemsSort(List<Integer> items) {
    // Write your code here
    
        List<Integer> sortedItems = new ArrayList<>();
        SortedMap<Integer, Integer> itemCount= new TreeMap<>();
        SortedMap<Integer, SortedMap<Integer, Integer>> quantSort =  new TreeMap<>();
        
        for(Integer item : items){
            if(itemCount.get(item) == null){
                itemCount.put(item, 1);
            } else {
                itemCount.put(item, itemCount.get(item) + 1);
            }
        }
        
        //Add only 1 time occuring items
        for(Map.Entry<Integer, Integer> entry : itemCount.entrySet()){
            if((Integer)entry.getValue() == 1){
                sortedItems.add((Integer)entry.getKey());
            }
        }
        
        //For remaining item construct a nested sorted map for the keys as value and occurance as key
        for(Map.Entry<Integer, Integer> entry : itemCount.entrySet()){ 
            if((Integer)entry.getValue() != 1){     
                if(quantSort.get((Integer)entry.getValue()) == null){
                    SortedMap<Integer, Integer> keyMap = new TreeMap<>();
                    keyMap.put((Integer)entry.getKey(), 1);
                    quantSort.put((Integer)entry.getValue(), keyMap);
                    
                } else {
                    SortedMap<Integer, Integer> keyMap = quantSort.get((Integer)entry.getValue());
                    keyMap.put((Integer)entry.getKey(), 1);
                    quantSort.put((Integer)entry.getValue(), keyMap);
                }
            }
        }
        
        //Get the results from the map
        for(Map.Entry<Integer, SortedMap<Integer,Integer>> entry : quantSort.entrySet()){            
                SortedMap<Integer, Integer> keyMap = (SortedMap<Integer, Integer>)entry.getValue();
                for(Map.Entry<Integer,Integer> keyEntry :  keyMap.entrySet()){
                    for(int i = (Integer)entry.getKey() ; i>0 ; i--){ 
                        sortedItems.add((Integer)keyEntry.getKey());
                    }
                }
            
        }
        
        return sortedItems;
    }

}
public class Solution {
