package StringDemo;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "paratpsingh";
        findDuplicates(input);
    }

    public static void findDuplicates(String str) {
        // Convert string to character array
        char[] charArray = str.toCharArray();
        boolean[] counted = new boolean[charArray.length];      // To keep track of counted characters

                                                                // Loop through each character
        for (int i = 0; i < charArray.length; i++) {
            if (!counted[i]) {                                     // If this character hasn't been counted
                int count = 1;                                     // Start counting occurrences
                                                                    // Compare with the rest of the characters
                for (int j = i + 1; j < charArray.length; j++) {
                    if (charArray[i] == charArray[j]) {
                        count++;
                        counted[j] = true;                           // Mark as counted
                    }
                }
                if (count > 1) {
                    System.out.println(charArray[i] + ": " + count + " times");
                }
            }
        }
    }
}

