import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int array []= new int[x];
        for ( int i = 0; i < x; i++)
        {
            array[i] = scan.nextInt();
        }
            for ( int i = x-1; i >=0; i--)
            {
                System.out.print(array[i] + " ");
            }
    }
}
