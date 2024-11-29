package ArrayDemo;

import java.util.HashSet;

public class LongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring(s));  // Output: 3
    }
    public static int lengthOfLongestSubstring(String s) {
        // Set to store unique characters in the current window
        HashSet<Character> set = new HashSet<>();
        
        // Pointers for the sliding window
        int left = 0;
        int maxLength = 0;
        
        // Iterate over the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            // If the character at 'right' is already in the set, move 'left' pointer
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left)); // Remove the character at 'left' from the set
                left++; // Shrink the window from the left
            }
            // Add the current character to the set
            set.add(s.charAt(right));
            
            // Update the maximum length of the window
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
