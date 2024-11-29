package bbbb;

import java.util.Stack;

public class BracketValidator {

    // Function to check if the input string has valid brackets
    public static boolean isValid(String input) {
        // Create a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();
        // Traverse the input string character by character
        for (char ch : input.toCharArray()) {
            // If the character is an opening bracket, push it to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If the character is a closing bracket, check for validity
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If the stack is empty, it means there's no opening bracket for the closing one
                if (stack.isEmpty()) {
                    return false;
                }
                // Pop the top of the stack and check if it matches the closing bracket
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // If the stack is empty, all brackets are matched; otherwise, some are unbalanced
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        // Test input
        String input = "({[()]})";
        // Check if the input has valid brackets
        if (isValid(input)) {
            System.out.println("The string has balanced brackets.");
        } else {
            System.out.println("The string has unbalanced brackets.");
        }
    }
}
