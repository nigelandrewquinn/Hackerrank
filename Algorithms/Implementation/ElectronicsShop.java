import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        // Complete this function
        int key = 0;
        int usb = 0;
        int temp = 0;
        
        for(int i = 0; i < keyboards.length; i++){
            for(int j = 0; j < drives.length; j++){
                temp = keyboards[i] + drives[j];
                if(temp > key && temp <= s)
                    key = temp;
                temp=0;
            }
        }
        
        for(int i = 0; i < drives.length; i++){
            for(int j = 0; j < keyboards.length; j++){
                temp = drives[i] + keyboards[j];
                if(temp > s)
                    break;
                if(temp > usb && temp <= s)
                    usb = temp;
                temp=0;
            }
        }
        if(usb>key && usb > 0)
            return usb;
        else if(key>usb && key > 0)
            return key;
        return -1;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
