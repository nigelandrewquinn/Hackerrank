import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isBalanced(String s) {
        Stack stack = new Stack(s.length());
        for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} 
            else {
				if (stack.isEmpty()) {
					return "NO";
				}
				char top = stack.pop();
				if (!((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{'))) {
					return "NO";
				}
			}
		}
		if(stack.isEmpty())
            return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
class Stack {
	
	int maxSize; 
	char[] stackArray;
	int top; 

	public Stack(int s) {
		maxSize = s; 
		stackArray = new char[maxSize]; 
		top = -1; 
	}
	
	public void push(char j){
		stackArray[++top] = j; 
	}

	public char pop() {
		return stackArray[top--]; 
	}

	public char peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize-1);
	}
}
