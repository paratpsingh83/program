package bbbb;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Example array with duplicates
        int[] arrayWithDuplicates = {1, 2, 3, 2, 4, 5, 1};
        
        // Remove duplicates
        int[] uniqueArray = removeDuplicates(arrayWithDuplicates);
        
        // Print the unique array
        System.out.println(java.util.Arrays.toString(uniqueArray)); // Output: [1, 2, 3, 4, 5]
    }

    // Method to remove duplicates from a primitive int array
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        
        // Add each element to the HashSet (duplicates will be ignored)
        for (int num : array) {
            uniqueSet.add(num);
        }
        
        // Convert Set back to primitive int array
        int[] result = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            result[i++] = num;
        }
        
        return result;
    }
}
