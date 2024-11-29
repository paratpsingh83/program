package StringDemo;

public class MaxArea {
    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum area: " + maxArea(heights)); // Output: 49
    }
    public static int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int maxArea = 0;
        // Loop until the two pointers meet
        while (left < right) {
            // Calculate the current area
            int minHeight = Math.min(heights[left], heights[right]);
            int width = right - left;
            int currentArea = minHeight * width;

            // Update the maximum area if the current area is greater
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer corresponding to the shorter stick
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
