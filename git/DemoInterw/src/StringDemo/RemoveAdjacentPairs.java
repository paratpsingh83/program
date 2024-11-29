package StringDemo;
import java.util.Stack;

public class RemoveAdjacentPairs {
    public static void main(String[] args) {
        String input = "abBAcCeAE";
        String output = removeAdjacentPairs(input);
        System.out.println(output);  // Output: eAE
    }

    public static String removeAdjacentPairs(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && Character.toLowerCase(stack.peek()) == Character.toLowerCase(c) && stack.peek() != c) {
                stack.pop(); // Remove the top element as it forms a pair with current character
            } else {
                stack.push(c); // Add the current character to the stack
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString(); // Reverse to get the correct order
    }
}

