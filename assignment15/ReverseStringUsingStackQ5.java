package in.ineuron.assignment15;

import java.util.*;

class Answer {
    public String reverseString(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        // Pop characters from the stack to construct the reversed string
        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

        return reversedStr.toString();
    }
}

public class ReverseStringUsingStackQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello, World!";

        Answer solution = new Answer();
        String reversedStr = solution.reverseString(str);

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);

	}

}
