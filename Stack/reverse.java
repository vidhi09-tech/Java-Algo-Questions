package Stack;

import java.util.Stack;

/**
 * reverse
 */

public class reverse {

    public static String reverseStr(String str) {
        char[] reverseString = new char[str.length()];
        // Declare a stack of type character
        Stack<Character> stack = new Stack<Character>();

        // Traverse the string and push the character one by one onto the stack
        for (int i = 0; i < str.length(); i++) {
            // Push character into the stack
            stack.push(str.charAt(i));
        }

        // Now pop the items from the stack until it becomes empty
        int i = 0;
        while (!stack.isEmpty()) {
            // Pop all the characters until its empty and store the charcters int the array
            reverseString[i++] = stack.pop();
        }
        return new String(reverseString);
    }

    public static void main(String[] args) {
        String str1 = "Hey how are you?";
        // Output : ?uoy era woh yeH
        System.out.println(reverseStr(str1));
    }
}