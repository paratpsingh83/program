package StringDemo;

public class CheckCircularRotation {

    public static boolean areCircularRotation(String str1, String str2) {
        // Check if lengths are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself
        String concatenated = str1 + str1;

        // Check if str2 is a substring of the concatenated string
        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "ABACD";
        //String str2="ABACD";
        String str2 = "CDABA";
        System.out.println(areCircularRotation(str1, str2)); // Output: true
    }
}

