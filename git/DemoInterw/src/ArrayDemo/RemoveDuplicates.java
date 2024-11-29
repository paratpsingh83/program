package ArrayDemo;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Sample array with duplicates
        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 4};
        // Call the method to remove duplicates
        int[] result = removeDuplicates(array);
        // Print the array without duplicates
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
    public static int[] removeDuplicates(int[] array) {
        // Calculate the size of the result array (maximum size can be the same as original array)
        int n = array.length;
        // If the array has only one element, no duplicates
        if (n == 0 || n == 1) {
            return array;
        }
        // Create an array to store unique elements (maximum size is the original array size)
        int[] result = new int[n];
        int index = 0;  // Index for result array
        // Loop through each element in the original array
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            // Check if the element already exists in the result array
            for (int j = 0; j < index; j++) {
                if (array[i] == result[j]) {
                    isDuplicate = true;  // Set flag if it's a duplicate
                    break;  // No need to check further, break out of inner loop
                }
            }
            // If it's not a duplicate, add it to the result array
            if (!isDuplicate) {
                result[index++] = array[i];
            }
        }
        // Create a new array with the exact size of unique elements
        return Arrays.copyOf(result, index);
    }
}
