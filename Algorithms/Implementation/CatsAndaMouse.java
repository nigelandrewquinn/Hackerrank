import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String catAndMouse(int x, int y, int z) {
        // Complete this function
        int CatA = z-x;
        int CatB = z-y;
        if(Math.abs(CatA)>Math.abs(CatB))
            return "Cat B";
        if(Math.abs(CatB)>Math.abs(CatA))
            return "Cat A";
        return "Mouse C";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            System.out.println(catAndMouse(x, y, z));
        }
        in.close();
    }
}
