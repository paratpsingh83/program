package bbbb;

public class FindMaxInArray {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {3, 5, 7, 2, 8, 4, 1, 9, 6};

        // Call the method to find the maximum number
        int max = findMax(numbers);

        // Print the result
        System.out.println("The maximum number in the array is: " + max);
    }
    // Method to find the maximum number in the array
    public static int findMax(int[] array) {
        // Edge case: If array is empty, return Integer.MIN_VALUE (or throw an exception)
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        // Initialize the maximum value with the first element
        int max = array[0];

        // Iterate through the array to find the maximum value
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
