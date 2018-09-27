import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        String s1 = s.substring(0,2);
        String s2 = s.substring(2,8);
        String s3 = "0";
        int x = Integer.parseInt(s1);
        // first 2 numbers are s1
        if (s.charAt(8) =='P')
        {
            if (x < 12)
            {
                x = x+12;
                s1 = "" + x;
            }
            else if(x == 12)
            {
                s1= "12";
            }
        }
        if ( s.charAt(8)=='A')
        {
            if ( x == 12)
            {
                s1 = "00";
            }
            else if ( x < 10)
            {
                s1 = "" + x;
                s1 = s3+s1;
            }
            else
            {
                s1 = "" + x;
            }
        }
        String result = s1 + s2;
        return result;
        
        
        
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
