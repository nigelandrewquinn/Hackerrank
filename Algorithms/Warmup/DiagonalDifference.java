import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a) {
        
        int x = 0, xc = 0, xs = 0;
        int y = a.length-1, yc = 0, ys = 0;
        for(int c=0; c<a[0].length; c++) {
            for(int r=0; r<a.length; r++) {
                if(r == x && c == xc){
                    xs += a[c][r];
                    x++; xc++;
                }
                if(r == y && c == yc){
                    ys += a[c][r];

                    y--; yc++;
                }
            }
        }
        return Math.abs(xs - ys);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bw.write(String.valueOf(result));
        bw.newLine();
        bw.close();
    }
}
