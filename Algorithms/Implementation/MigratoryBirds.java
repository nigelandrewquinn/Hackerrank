import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int array[] = new int[6];
        for(int i = 0; i < n; i++){
            int temp = ar[i];
            array[temp]++;
            //System.out.println(temp);
        }
        int greatest = 0;
        int ans = 0;
        for(int i = 5; i > 0; i--){
            if(array[i]>=greatest){
                greatest = array[i];
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
