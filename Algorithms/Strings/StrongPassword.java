import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int count = 0;
        Pattern patternSpecial = Pattern.compile("(\\W)");
        Matcher matcherSpecial = patternSpecial.matcher(password);
        if(!password.matches(".*[0-9].*"))
            count++;
        if(!password.matches(".*[a-z].*"))
            count++;
        if(!password.matches(".*[A-Z].*"))
            count++;
        if (!matcherSpecial.find())
            count++;
        if(password.length()+count <6)
            count += 6-(password.length()+count);  
        return count;                                                                                         
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
