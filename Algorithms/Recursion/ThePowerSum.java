import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(), pow = scan.nextInt();
        scan.close();
        System.out.println(thePowerSum(num, pow, 0));
    }

    static int thePowerSum(int num, int pow, int i) 
    {
        num = num - (int) Math.pow(i, pow);
        if (num == 0) return 1;
        if (num > 0) 
        {
            int sum = 0;
            for (int j = i + 1; Math.pow(j, pow) <= num; j++)
            {
                sum += thePowerSum(num, pow, j);
            }
            return sum;
        } 
        else 
            return 0;
    }
}
