package Number;

public class TriangleStarPattern {
    public static void main(String[] args) {
        int n = 9; // Number of rows for the triangle pattern

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Print space
            }

            // Inner loop for printing stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // Print star
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
