package bbbb;

public class ReorderArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0};

        int countZero = 0;

        // Count the number of 0's in the array
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                countZero++;
            }
        }

        // Fill the array with 0's and 1's
        for (int i = 0; i < arr1.length; i++) {
            if (i < countZero) {
                arr1[i] = 0;  // Set first `countZero` elements to 0
            } else {
                arr1[i] = 1;  // Set the remaining elements to 1
            }
        }
        // Output the modified array
        System.out.print("Modified array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
