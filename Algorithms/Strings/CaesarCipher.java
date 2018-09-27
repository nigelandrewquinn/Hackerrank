import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void caesarCipher(String s, int k) {
        String a = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        String b = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
        
            if(c>='A'&&c<='Z') {
                int pos = (int) c-'A';
                System.out.print(b.charAt(pos+k));   
            }
            else if(c>='a'&&c<='z') {
                int pos = (int) c-'a';
                System.out.print(a.charAt(pos+k));   
            }  
            else
                System.out.print(c);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt()%26;
        caesarCipher(s, k);
        in.close();
    }
}
