package ArrayDemo;

public class ShiftArray {
    public static int[] shiftRight(int N, int[] A) {
        if (N == 0) {
            return new int[0]; // Return an empty array if N is 0
        }
        // Create a new array B
        int[] B = new int[N];

        // Wrap around the last element
        B[0] = A[N - 1];

        // Shift the elements to the right
        for (int i = 1; i < N; i++) {
            B[i] = A[i - 1];
        }

        return B;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int N = A.length;

        int[] B = shiftRight(N, A);

        // Print the new array
        for (int num : B) {
            System.out.print(num + " ");
        }
    }
}
