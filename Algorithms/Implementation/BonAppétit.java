import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void bonAppetit(int n, int k, int b, int[] ar) {
        // first find the total she should have paid
        int actual = 0;
        for(int i = 0; i < ar.length; i++){
            if(i == k)
                continue;
            else{
                actual += ar[i];
            }
        }
        actual = actual/2;
        if(actual == b)
            System.out.println("Bon Appetit");
        else
            System.out.println(b-actual);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        bonAppetit(n, k, b, ar);
        //System.out.println(result);
    }
}
