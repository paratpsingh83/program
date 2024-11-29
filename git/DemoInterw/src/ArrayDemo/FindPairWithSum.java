package ArrayDemo;

public class FindPairWithSum {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 8, 7, 12};
        int targetSum = 15;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Indices [" + i + ", " + j + "] values: " + arr[i] + " + " + arr[j] + " = " + targetSum);
                }
            }
        }
    }
}