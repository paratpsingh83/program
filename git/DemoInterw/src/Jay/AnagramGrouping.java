package Jay;

import java.util.*;

public class AnagramGrouping {
    public static void main(String[] args) {
        // Input list of strings
        List<String> input = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        
        // Call the method to group anagrams
        List<List<String>> result = groupAnagrams(input);
        
        // Print the result
        System.out.println(result);
    }
    
    public static List<List<String>> groupAnagrams(List<String> strs) {
        // HashMap to store groups of anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        // Loop through each word in the input list
        for (String str : strs) {
            // Convert the string to a char array, sort it and convert it back to string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            // If the sorted string is already a key, add the current word to its list
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        
        // Return all the grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }
}
