package CollectionDemo;

public class ReverseWordsWithoutBuiltInFunctions {

    public static void main(String[] args) {
        String input = "i am working";  // Example input
        String output = reverseWords(input);  // Call the method to reverse words
        System.out.println(output);  // Output the reversed words
    }
    // Method to reverse the letters of each word in the sentence without using in-built functions
    public static String reverseWords(String input) {
        // Result string to store the final output
        String result = "";
        // Temporary variable to store the current word
        String word = "";
        // Traverse through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // If the current character is a space, it indicates the end of a word
            if (currentChar == ' ') {
                // Reverse the current word and append it to the result
                result += reverseWord(word) + " ";
                // Reset the word for the next word
                word = "";
            } else {
                // If it's not a space, add the character to the current word
                word += currentChar;
            }
        }
        // Don't forget to reverse and add the last word (since there is no space after it)
        if (!word.isEmpty()) {
            result += reverseWord(word);
        }
        return result;
    }
    // Method to reverse a single word
    public static String reverseWord(String word) {
        String reversed = "";
        // Traverse the word in reverse order and construct the reversed word
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }
}
