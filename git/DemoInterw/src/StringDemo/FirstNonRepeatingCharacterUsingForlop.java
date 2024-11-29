package StringDemo;

public class FirstNonRepeatingCharacterUsingForlop {
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatingCharacter(input);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeatingCharacter(String str) {
        int[] charCount = new int[256]; // Array to store character counts

        // Count each character's occurrences
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        // Find the first non-repeating character
        for (char c : str.toCharArray()) {
            if (charCount[c] == 1) {
                return c; // Return the first non-repeating character
            }
        }

        return '\0'; // Return null character if none found
    }
}
