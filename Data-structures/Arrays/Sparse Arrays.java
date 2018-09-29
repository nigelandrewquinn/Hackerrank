import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        String array[] = new String[n];
        for(int i = 0; i < n; i++){
            array[i] = scan.next();
        }
        int q = Integer.parseInt(scan.next());
        String query;
        for(int i = 0; i < q; i++){
            query=scan.next();
            int count = 0;
            for(int j = 0; j < array.length; j++){
                if(query.equals(array[j])){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
