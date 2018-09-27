import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b, int n) {
        // Complete this function
        int count = 0;
       // Arrays.sort(b);
        
        for(int i = a[n-1]; i<=b[0];i++){
            int counta = 0;
            for(int j = 0; j < a.length; j++){
                if(i%a[j]==0)
                    counta++;
            }
            int countb=0;
            if(counta==a.length){
                for(int j = 0; j < b.length; j++){
                    if(b[j]%i==0)
                        countb++;
                }
                if(countb==b.length)
                    count++;
            }
        }
        return count;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b,n);
        System.out.println(total);
        in.close();
    }
}
