package bbbb;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicatesAndSort {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,4,3,5,7,8,89,9,9,0};
        int[] array = Arrays.stream(arr).distinct().sorted().toArray();
        for(int a:array) {
            System.out.print(" "+a);
        }
    }
//    public static void main(String[] args) {
//        int[] array = {4, 2, 3, 4, 1, 2, 5, 1};
//
//        // Remove duplicates and sort using Streams
//        int[] result = IntStream.of(array)
//                .distinct() // Remove duplicates
//                .sorted()   // Sort the array
//                .toArray(); // Convert back to array
//        // Print the sorted array
//        System.out.println(Arrays.toString(result));
//    }
}

