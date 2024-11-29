package StringDemo;

public class VowelConsonantCounterUsingString {
    public static void main(String[] args) {
        String s = "abchdsnkosnusnqemamamnzy";
        countVowelsAndConsonants(s);
    }

    public static void countVowelsAndConsonants(String str) {
        String vowels = "";        // Initialize an empty string for vowels
        String consonants = "";    // Initialize an empty string for consonants
        int vowelCount = 0;        // Counter for vowels
        int consonantCount = 0;     // Counter for consonants

        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                vowels += c;          // Concatenate vowel to the vowels string
                vowelCount++;         // Increment the vowel count
            } else if (Character.isLetter(c)) { // Check if it's a consonant
                consonants += c;      // Concatenate consonant to the consonants string
                consonantCount++;      // Increment the consonant count
            }
        }

        System.out.println("Vowels: " + vowels);           // Print vowels
        System.out.println("Consonants: " + consonants);   // Print consonants
        System.out.println("Vowel Count: " + vowelCount);   // Print vowel count
        System.out.println("Consonant Count: " + consonantCount); // Print consonant count
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;  // Check if character is a vowel
    }
}