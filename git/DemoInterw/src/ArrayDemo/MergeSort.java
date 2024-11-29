package ArrayDemo;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));  // Print sorted array
    }
    static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);          // Sort left half
            mergeSort(array, mid + 1, right);     // Sort right half
            merge(array, left, mid, right);       // Merge both halves
        }
    }
    static void merge(int[] array, int left, int mid, int right) {
        int[] temp = Arrays.copyOfRange(array, left, right + 1);
        int i = left, j = mid + 1, k = left;

        for (; k <= right; k++) {
            if (i <= mid && (j > right || array[i] <= array[j])) array[k] = array[i++];
            else array[k] = array[j++];
        }
    }
}
