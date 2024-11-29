package bbbb;

import java.util.Scanner;

public class Solution3 {

    public static String phoneNumber(String s) {
        // Use a StringBuilder to collect numeric characters
        StringBuilder digits = new StringBuilder();

        // Iterate through the input string
        for (char c : s.toCharArray()) {
            // Check if the character is a digit
            if (Character.isDigit(c)) {
                digits.append(c); // Append the digit to the StringBuilder
            }
        }

        // Get the length of the digits collected
        int len = digits.length();
        // Extract the last 10 digits
        if (len >= 10) {
            return digits.substring(len - 10); // Return the last 10 digits
        }

        // If for some reason there are not enough digits (though guaranteed), return an empty string
        return "";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input string
        String S = scan.nextLine();

        // Get the extracted phone number
        String result = phoneNumber(S);

        // Print the result
        System.out.println(result);

        scan.close();
    }
}

