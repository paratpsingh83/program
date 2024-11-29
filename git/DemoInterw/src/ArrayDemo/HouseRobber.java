package ArrayDemo;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};  // Example 1
        int[] nums2 = {2, 7, 9, 3, 1};  // Example 2
        System.out.println("Max money that can be robbed (Example 1): " + rob(nums1));  // Output: 4
        System.out.println("Max money that can be robbed (Example 2): " + rob(nums2));  // Output: 12
    }
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;  // No houses to rob
        }
        if (nums.length == 1) {
            return nums[0];  // Only one house, rob it
        }
        int prev2 = nums[0];  // dp[i-2], money robbed if we rob the first house
        int prev1 = Math.max(nums[0], nums[1]);  // dp[i-1], money robbed if we rob the second house
        for (int i = 2; i < nums.length; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}
