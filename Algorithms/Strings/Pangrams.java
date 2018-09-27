import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static String pangrams(String s) {
        int ar[] = new int[26];
        System.out.println("lol");
        for(int i = 0; i < s.length(); i++){
            int temp = (int) s.charAt(i)-'a';
            ar[temp]++;
            System.out.println(temp);
        }
        for(int i = 0; i < ar.length; i++)
            if(ar[i] == 0)
                return "not pangram";
        return "pangram";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine().toLowerCase().replaceAll(" ", "");

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
