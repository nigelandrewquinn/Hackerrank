import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        int count=0;
        StringTokenizer tokenizer = new StringTokenizer(s, " !,?.\\_'@");
        int ans1 = tokenizer.countTokens();
        System.out.println(ans1);
        while(tokenizer.hasMoreElements()) 
        {
            System.out.println(tokenizer.nextToken());
        }

        
        scan.close();
       
    }
}
