package bbbb;

import java.util.*;

public class MinContainers {
    public static int minContainers(String input) {
        // List to store the end elements of each container
        List<Integer> containers = new ArrayList<>();
        
        // Loop through each character in the input string
        for (char c : input.toCharArray()) {
            int num = c - '0';  // Convert character to integer
            
            // Find the container where we can insert the current digit
            int pos = binarySearch(containers, num);
            
            // If pos is equal to the number of containers, we need a new container
            if (pos == containers.size()) {
                containers.add(num);
            } else {
                containers.set(pos, num); // Update the container's value
            }
        }
        
        // The size of containers list is the minimum number of containers required
        return containers.size();
    }
    
    // Binary search function to find the correct position
    private static int binarySearch(List<Integer> containers, int num) {
        int left = 0, right = containers.size() - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (containers.get(mid) < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;
    }
    
    public static void main(String[] args) {
        // Test case input
        String input = "1245367";
        System.out.println("Minimum containers required: " + minContainers(input));
    }
}
