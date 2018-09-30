import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int sum = 0;
        for(int i=0;i<q;i++)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();  
            int n = scan.nextInt();
            for(int p = 0; p < n; p++ )
            {
                sum = sum + (int)(Math.pow(2,p)*b);
                System.out.print(a+sum + " ");
            }
            sum = 0;
            System.out.println(" ");
        }
    }
}
