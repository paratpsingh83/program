package ArrayDemo;
import java.util.Arrays;
public class MissingNumber {
        public static int missingNumber(int[] nums) {
        int n = nums.length; // The length of the input array
        // Calculate the expected sum of numbers from 0 to n
        int Tsum = (n * (n + 1)) / 2;
        // Calculate the actual sum of the numbers in the array
        int actualSum = Arrays.stream(nums).sum();
        // The missing number is the difference between the expected sum and actual sum
        return Tsum - actualSum;
        }

        public static void main(String[] args) {

        // Test case
        int[] nums = {3, 0, 1}; // The missing number is 2
        int missing = missingNumber(nums);
        System.out.println("The missing number is: " + missing); // Output: 2

        // Another test case
        int[] nums2 = {0, 1}; // The missing number is 2
        missing = missingNumber(nums2);
        System.out.println("The missing number is: " + missing); // Output: 2

        // Another test case
        int[] nums3 = {9,6,4,2,3,5,7,1}; // The missing number is 8
        missing = missingNumber(nums3);
        System.out.println("The missing number is: " + missing); // Output: 8
    }
}
