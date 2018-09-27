import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void countingSort(int[] arr) {
        int output[] = new int[100];
        for(int i = 0; i < arr.length; i++)
            output[arr[i]]++;
        for(int i = 0; i < output.length; i++){
            if(output[i]>0)
                for(int j = 0; j < output[i]; j++)
                    System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        countingSort(arr);
        in.close();
    }
}
