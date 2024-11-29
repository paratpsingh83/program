package bbbb;

import java.util.*;

public class LongestSubarraySumLessThanK {
    public static void main(String[] args) {
        // Example 1
        //
        int[] arr1 = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        int k1 = 8;
        System.out.println("Length of longest subarray: " + longestSubarrayWithSumLessThanK(arr1, k1));
        
        // Example 2
        int[] arr2 = {10, 2, 5, 7, 1, 9};
        int k2 = 15;
        System.out.println("Length of longest subarray: " + longestSubarrayWithSumLessThanK(arr2, k2));
    }

    public static int longestSubarrayWithSumLessThanK(int[] arr, int k) {
        int start = 0, maxLength = 0, currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end]; // Add current element to the window

            // Shrink the window if the sum exceeds k
            while (currentSum > k && start <= end) {
                currentSum -= arr[start]; // Remove element at start of the window
                start++; // Move the start pointer to the right
            }

            // Update maxLength if the current window is valid
            if (currentSum <= k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }

        return maxLength; // Return the length of the longest subarray
    }
}
