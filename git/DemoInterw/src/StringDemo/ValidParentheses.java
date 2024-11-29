package StringDemo;

import java.util.Stack; // Importing the Stack class for stack operations

public class ValidParentheses {

    // Method to check if the given string of parentheses is valid
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); // Create a stack to store opening brackets

        // Loop through each character in the input string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If it's a closing bracket, first check if the stack is empty
                if (stack.isEmpty()) return false; // Invalid if there are no opening brackets to match

                // Pop the top element from the stack
                char top = stack.pop();
                // Check if the popped opening bracket matches the current closing bracket
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false; // Return false if there is a mismatch
                }
            }
        }
        // Return true if all opening brackets were matched and the stack is empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{}[]()"; // Test string containing various brackets
        System.out.println(isValid(s)); // Print the result of the validity check
    }
}
