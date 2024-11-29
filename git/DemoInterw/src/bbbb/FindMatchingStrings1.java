package bbbb;

import java.util.HashSet;
import java.util.Set;

public class FindMatchingStrings1 {

    public static void main(String[] args) {
        // Example arrays of strings
        String[] array1 = {"apple", "banana", "cherry", "date"};
        String[] array2 = {"cherry", "date", "elderberry", "fig"};

        // Find matching elements
        Set<String> matchingElements = findMatchingElements(array1, array2);

        // Print the matching elements
        System.out.println("Matching elements: " + matchingElements);
    }

    // Method to find matching elements
    public static Set<String> findMatchingElements(String[] array1, String[] array2) {
        Set<String> set = new HashSet<>();
        Set<String> result = new HashSet<>();

        // Add elements of the first array to the HashSet
        for (String str : array1) {
            set.add(str);
        }

        // Check for matching elements in the second array
        for (String str : array2) {
            if (set.contains(str)) {
                result.add(str);  // Add matching string to the result
            }
        }

        return result;
    }
}
