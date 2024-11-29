package CollectionDemo;

public class BracketValidator {
    // Function to check if the input string has valid brackets
    public static boolean isValid(String input) {
        int round = 0;  // To track '(' and ')'
        int curly = 0;  // To track '{' and '}'
        int square = 0; // To track '[' and ']'
        // Traverse the input string character by character
        for (char ch : input.toCharArray()) {
            // If the character is an opening bracket, increment the corresponding counter
            if (ch == '(') {
                round++;
            } else if (ch == '{') {
                curly++;
            } else if (ch == '[') {
                square++;
            }
            // If the character is a closing bracket, check if it matches the most recent opening bracket
            else if (ch == ')') {
                if (round == 0) {
                    return false; // If no matching opening bracket, it's unbalanced
                }
                round--;
            } else if (ch == '}') {
                if (curly == 0) {
                    return false; // If no matching opening bracket, it's unbalanced
                }
                curly--;
            } else if (ch == ']') {
                if (square == 0) {
                    return false; // If no matching opening bracket, it's unbalanced
                }
                square--;
            }
        }
        // After processing all characters, all counters must be zero to ensure balanced brackets
        return round == 0 && curly == 0 && square == 0;
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
