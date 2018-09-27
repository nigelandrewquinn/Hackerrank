import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        for(int i=0; i < 5; i++)
        {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        long big = 0;
        long small = 0;
        for ( int i = 1; i < 5; i++)
        {
            big = big + array[i];
        }
        for ( int i = 0; i < 4; i++)
        {
            small = small + array[i];
        }
        System.out.print(small + " " + big);
    }
}
