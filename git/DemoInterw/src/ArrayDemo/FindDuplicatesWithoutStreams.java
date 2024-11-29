package ArrayDemo;

import java.util.*;

public class FindDuplicatesWithoutStreams {
    public static void main(String[] args) {
        String str = "programming";

        // Create a HashMap to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the string and populate the map with character counts
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find and print duplicates (characters with a count greater than 1)
        System.out.println("Duplicates with counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {  // If character appears more than once
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
