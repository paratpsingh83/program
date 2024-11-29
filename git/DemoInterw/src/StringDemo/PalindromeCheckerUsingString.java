package StringDemo;

public class PalindromeCheckerUsingString {
    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        // Get the length of the string
        int length = str.length();
        
        // Loop through the first half of the string
        for (int i = 0; i < length / 2; i++) {
            // Compare the character at position i with the character at the mirrored position from the end
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                // If characters do not match, it is not a palindrome
                return false;
            }
        }
        
        // If all characters match, it is a palindrome
        return true;
    }

    public static void main(String[] args) {
        // Example input string
        String input = "madam";
        
        // Check if the input string is a palindrome and print the result
        System.out.println("Is Palindrome: " + isPalindrome(input)); // Output: true
    }
}
