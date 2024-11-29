package bbbb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrays {
    public static void main(String[] args) {
        // Test cases
        int[] num1 = {1, 2, 3};
        int[] num2 = {2, 5, 6};
        int[] result1 = mergeArrays(num1, num2);
        System.out.println(Arrays.toString(result1)); // Output: [1, 2, 2, 3, 5, 6]

        int[] num3 = {1};
        int[] num4 = {};
        int[] result2 = mergeArrays(num3, num4);
        System.out.println(Arrays.toString(result2)); // Output: [1]
    }

    public static int[] mergeArrays(int[] num1, int[] num2) {
        List<Integer> mergedList = new ArrayList<>();
        
        // Add elements from the first array
        for (int n : num1) {
            mergedList.add(n);
        }

        // Add elements from the second array
        for (int n : num2) {
            mergedList.add(n);
        }

        // Convert the list back to an array
        return mergedList.stream().mapToInt(i -> i).toArray();
    }
}
