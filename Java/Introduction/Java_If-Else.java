    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution 
    {

        public static void main(String[] args) 
        {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            
            if(n%2==1)
            {
              System.out.print("Weird");
            }
   
            else if (n%2==0)
            {
                if( 1 < n && n < 6)
                {
                    ans = "Not Weird";
                }
                else if ( 5 < n && n < 21)
                {
                    ans = "Weird";
                }
                else if (n > 20)
                {
                    ans = "Not Weird";
                }
                   
               //Complete the code
                //If  is even and in the inclusive range of  to , print Not Weird
                //If  is even and in the inclusive range of  to , print Weird
                //If  is even and greater than , print Not Weird 
    
            System.out.println(ans);
            
        }
    }
    }
