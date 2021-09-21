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
     * Complete the 'missingWords' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     */

    public static List<String> missingWords(String s, String t) {
    // Write your code here
        List<String> parentStringTokenize = new ArrayList<>(Arrays.asList(s.split(" ")));
        List<String> substringTokenize = Arrays.asList(t.split(" "));
        
        for(String subString : substringTokenize){
            parentStringTokenize.remove(parentStringTokenize.indexOf(subString));
        }
        
        return parentStringTokenize;
    }

}
public class Solution {
