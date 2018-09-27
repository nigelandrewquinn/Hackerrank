import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int countingValleys(int n, String s) {
        // Complete this function
        int count = 0;
        int leveld = 0;
         int levelu = 0;
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i)=='U')
                levelu++;
            else
                leveld++;
            if(leveld==levelu&&s.charAt(i)=='U')
                count++;
                
        }
        return count;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
