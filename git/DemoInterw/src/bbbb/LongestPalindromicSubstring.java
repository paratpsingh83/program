package bbbb;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String input = "babadaaadadaaaaddaddad";
        String longestPalindrome = longestPalindrome(input);//calling
        System.out.println("Longest Palindromic Substring: " + longestPalindrome);
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes
            String oddPalindrome = expandAroundCenter(s, i, i);
            // Check for even-length palindromes
            String evenPalindrome = expandAroundCenter(s, i, i + 1);

            // Update longest palindrome if needed
            longest = Stream.of(longest, oddPalindrome, evenPalindrome)
                            .max((a, b) -> Integer.compare(a.length(), b.length()))
                            .orElse(longest);
        }
        return longest;
    }

    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right); // Return the palindrome substring
    }
}
