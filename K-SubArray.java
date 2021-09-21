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
     * Complete the 'kSub' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY nums
     */

    public static long kSub(int k, List<Integer> nums) {
    // Write your code here
        long numOfSubArrays = 0;
        
        for(int i=0; i<nums.size(); i++){
            
            Integer sum = 0;
            for(int j=i; j<nums.size(); j++){
                sum += nums.get(j);
                
                if(sum%k == 0)
                    numOfSubArrays++;
            }
        }
        
        return numOfSubArrays;        
    }

}

public class Solution {
