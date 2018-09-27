import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        int space = 0;
        for (int i = 1; i < n+1; i++)
        {
            count++;
            space = n-count;
            
            for( int q = 0; q < space; q++)
            {
             System.out.print(" ");   
            }
            for(int z = 0; z <n-space;z++)
            {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
