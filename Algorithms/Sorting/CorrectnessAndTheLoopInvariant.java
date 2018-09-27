import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSort(int[] A){
        for(int outer = 1; outer < A.length; outer++){
            int temp = A[outer];
            int inner = outer;
            while(inner > 0 && A[inner-1] >= temp){
                A[inner] = A[inner-1];
                inner--;
            }
            A[inner] = temp;
        }

        printArray(A);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
}
