import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int count = 0;
        /* Enter your code here. Print output to STDOUT. */
        for ( int i = 0; i< A.length()-1; i++)
        {
            if ( A.charAt(i)==A.charAt(A.length()-i-1))
            {
                count++;
            }
        }
        if (count==A.length()-1)
        {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("No");
        }
        
    }
}
