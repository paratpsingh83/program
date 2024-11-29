package CollectionDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class ArrayRankTransform {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> valueToRank = new HashMap<>();  // Map to store value-to-rank mapping
        int[] sortedUniqueNumbers = Arrays.stream(arr).distinct().sorted().toArray();  // Remove duplicates and sort

        // Assign ranks to sorted unique elements
        for (int i = 0; i < sortedUniqueNumbers.length; i++) {
            valueToRank.put(sortedUniqueNumbers[i], i + 1);
        }

        // Replace each element in the original array with its rank
        for (int i = 0; i < arr.length; i++) {
            arr[i] = valueToRank.get(arr[i]);
        }

        return arr;  // Return the updated array
    }

    public static void main(String[] args) {
        ArrayRankTransform solution = new ArrayRankTransform();

        // Example array
        int[] arr = {40, 10, 20, 30};

        // Get the ranked transformed array
        int[] rankedArray = solution.arrayRankTransform(arr);

        // Print the results
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Ranked transformed array: " + Arrays.toString(rankedArray));
    }
}
