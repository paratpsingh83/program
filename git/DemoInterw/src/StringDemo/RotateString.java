package StringDemo;

public class RotateString {
    public static void main(String[] args) {
        String s = "ABCDE";
        int n = 3;                // Number of positions to rotate
        String rotated = s.substring(s.length() - n) + s.substring(0, s.length() - n);
        System.out.println(rotated);
    }
}
