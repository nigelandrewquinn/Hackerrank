import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void solve(int[] grades){
        for(int i = 0; i < grades.length; i++){
            if(grades[i]<38){
                System.out.println(grades[i]);
            }
            else{
                int temp = ((grades[i] / 5) + 1) * 5;
                if(temp-grades[i]<=2)
                    System.out.println(temp);
                else
                    System.out.println(grades[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        solve(grades);

    }
}
