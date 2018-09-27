import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int array[] = new int [x];
        for ( int i = 0; i < x; i++)
        {
            array[i] = scan.nextInt();
        }
        double plus = 0;
        double minus = 0;
        double zero = 0;
        for(int i = 0; i < array.length; i++)
        {
            if (array[i]>0)
            {
                plus++;
            }
            if (array[i]<0)
            {
                minus++;
            }
            if (array[i]==0)
            {
                zero++;
            }
        }
        double ans1 = plus/x;
        double ans2 = minus/x;
        double ans3 = zero/x;
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}
