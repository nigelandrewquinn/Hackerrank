import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        int n = scan.nextInt();
        int count = 0;
        int array [] = new int [n];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < array.length; i++)
        {
            if ( array[i]==v)
            {
                count=i;
            }
        }
        System.out.println(count);
    }
}
