package StringDemo;

import java.util.HashMap;

public class GoodPairs {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 1, 2}; // Example array
        System.out.println("Number of good pairs: " + countGoodPairs(arr));  // Output: 3
    }
    // Function to count the number of good pairs
    public static int countGoodPairs(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int goodPairs = 0;

        // Count the frequency of each element
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        // For each unique element, calculate the number of good pairs
        for (int count : freqMap.values()) {
            if (count > 1) {
                goodPairs += count * (count - 1) / 2;  // Combination formula: C(f, 2)
            }
        }
        return goodPairs;
    }
}
