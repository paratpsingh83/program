package ArrayDemo;

public class StringCompression {
    public static void main(String[] args) {
        String a = "aabcccccaaa";
        System.out.println(compressString(a));
    }

    private static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(str.charAt(str.length() - 1)).append(count); // Append last character and count

        return compressed.toString();
    }
}
