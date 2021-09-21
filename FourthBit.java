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
     * Complete the 'fourthBit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER number as parameter.
     */

    public static int fourthBit(int number) {
    // Write your code here
    
        List<Integer> binary = new ArrayList<>();
        
        for(int i = number  ; i >0 ; i = i/2){
            binary.add(i%2);
        }
        
        Collections.reverse(binary);
        return binary.get(binary.size() - 4);
    }

}
public class Solution {
