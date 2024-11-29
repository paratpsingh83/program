package CollectionDemo;

import java.util.*;

public class AnagramGrouping {
    public static void main(String[] args) {
        // Input list of strings
        List<String> input = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        //Call the method to group anagrams
        List<List<String>> result = groupAnagrams(input);
        // Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(List<String> strs) {
        // List to store the grouped anagrams
        List<List<String>> groupedAnagrams = new ArrayList<>();
        // Loop through each word in the input list
        for (String str : strs) {
            // Create a frequency array for each word
            int[] freq = new int[26];  // 26 letters in the alphabet
            // Update the frequency array for the current word
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                freq[c - 'a']++;
            }
            //Check if a word with the same frequency array already exists
            boolean foundGroup = false;
            for (List<String> group : groupedAnagrams) {
                if (isSameGroup(group.get(0), str)) {
                    // If found, add the word to the corresponding group
                    group.add(str);
                    foundGroup = true;
                    break;
                }
            }
            //If no group was found, create a new group
            if (!foundGroup) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(str);
                groupedAnagrams.add(newGroup);
            }
        }

        // Return all grouped anagrams
        return groupedAnagrams;
    }

    // Helper method to check if two words are anagrams (by comparing their frequency arrays)
    public static boolean isSameGroup(String word1, String word2) {
        // Create a frequency array for both words
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Fill frequency arrays for both words
        for (int i = 0; i < word1.length(); i++) {
            freq1[word1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            freq2[word2.charAt(i) - 'a']++;
        }

        // Compare both frequency arrays
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }
}
