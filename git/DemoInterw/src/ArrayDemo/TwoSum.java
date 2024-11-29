package ArrayDemo;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = findTwoSum(arr, target);
        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
    public static int[] findTwoSum(int[] arr, int target) {
        // Iterate through all pairs of elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    // Return the indices if a pair is found
                    return new int[] { i, j };
                }
            }
        }
        // If no solution is found, return an empty array or an indication of failure
        return new int[] {}; // or throw an exception depending on requirements
    }
}
