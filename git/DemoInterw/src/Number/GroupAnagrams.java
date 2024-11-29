package Number;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store the anagram groups
        Map<String, List<String>> map = new HashMap<>();

        // Iterate through each string in the input array
        for (String str : strs) {
            // Convert the string to a char array, sort it, and then convert it back to a string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // If the sorted string is already a key in the map, add the original string to its list
            // Otherwise, create a new list and add the string to it
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }

        // Return the values of the map, which are the grouped anagrams
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        // Input list of strings
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Group anagrams
        List<List<String>> result = groupAnagrams(input);

        // Output the result
        System.out.println(result);
    }
}
