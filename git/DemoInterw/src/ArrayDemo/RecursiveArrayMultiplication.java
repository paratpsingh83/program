package ArrayDemo;

public class RecursiveArrayMultiplication {

    public static int[] multiplyArrays(int[] array1, int[] array2) {
        // Check if the arrays have the same length
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Arrays must have the same length.");
        }

        int[] result = new int[array1.length]; // Array to store the result

        // Multiply corresponding elements
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] * array2[i];
        }

        return result; // Return the resulting array
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        int[] product = multiplyArrays(array1, array2);

        // Print the result
        System.out.print("Product of the two arrays: ");
        for (int value : product) {
            System.out.print(value + " "); // Output: 5 12 21 32
        }
    }
}
