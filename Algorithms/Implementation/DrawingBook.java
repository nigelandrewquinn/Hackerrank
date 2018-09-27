import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        int countF = 0;
        if(p==1)
            countF=0;
        else{
            for(int i = 0; i <= n; i++){
            i++;
            if(i>=p)
                break;
            countF++;
            }
        }
        
        int countB = 0;
        
        
        if(p%2==0){
            for(int i = n; i > p; i--){
                i--;
                if(i<=p)
                    break;
                countB++;
            }
        }
        else{
            for(int i = n+1; i > p; i--){
                i--;
                if(i<=p)
                    break;
                countB++;
            }
        } 
        
            if(countF < countB)
                return countF;
            return countB;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        //if(n==6 && p==5)
        int result = solve(n, p);
        System.out.println(result);
    }
}
