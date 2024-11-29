package StringDemo;

public class VowelConsonantCounterUsingBuffer {
    public static void main(String[] args) {
        String s = "abchdsnkosnusnqemamamnzy";
        countVowelsAndConsonants(s);
    }

    public static void countVowelsAndConsonants(String str) {
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                vowels.append(c);
                vowelCount++;
            } else if (Character.isLetter(c)) { // Check if it's a consonant
                consonants.append(c);
                consonantCount++;
            }
        }

        System.out.println("Vowels: " + vowels.toString());
        System.out.println("Consonants: " + consonants.toString());
        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
