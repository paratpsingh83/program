package Jay;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        // Example input
        int[] arr = {-4, -1, 0, 3, 10};
        
        // Get the sorted squares array
        int[] result = sortedSquares(arr);
        
        // Print the result
        System.out.println(Arrays.toString(result));
    }
    
    public static int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        
        int left = 0;
        int right = n - 1;
        
        // Fill the result array from the back to the front
        for (int i = n - 1; i >= 0; i--) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            
            // Compare squares and place the larger one in the result array
            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++;  // Move left pointer to the right
            } else {
                result[i] = rightSquare;
                right--;  // Move right pointer to the left
            }
        }
        
        return result;
    }
}
