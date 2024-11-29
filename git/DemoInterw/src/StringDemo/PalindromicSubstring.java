package StringDemo;

import java.util.Scanner;

class PalindromicSubstring {

        public static String PalindromicSubstring(String str) {
            int n = str.length();
            String longestPalindrome = "";

            // Check each substring
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    String substring = str.substring(i, j + 1);
                    if (isPalindrome(substring) && substring.length() > longestPalindrome.length()) {
                        longestPalindrome = substring;
                    }
                }
            }

            // Return the longest palindrome found or "none"
            return longestPalindrome.length() > 2 ? longestPalindrome : "none";
        }

        // Helper function to check if a string is a palindrome
        private static boolean isPalindrome(String s) {
            int left = 0, right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        public static void main(String[] args) {
            // Keep this function call here
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            String result = PalindromicSubstring(input);

            System.out.println("Longest palindromic substring: " + result);

            // Final output based on the given requirement
            if (!result.equals("none")) {
                System.out.println("Final Output: " + result + "X0mX85X4d");
            } else {
                System.out.println("Final Output: noXeeX10X28X74X");
            }

            scanner.close();
        }
    }


