package bbbb;


import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class CountOccurrencesInArray {
    public static void main(String[] args) {
        // Example array of numbers
        int[] numbers = {1, 2, 3, 1, 4, 2, 1, 5, 3};
        // Count occurrences of each element using groupingBy and counting
        Map<Integer, Long> occurrences = Arrays.stream(numbers)  // Convert int[] to IntStream
                .boxed()  // Convert IntStream to Stream<Integer>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // Print the occurrences map
        occurrences.forEach((num, count) -> System.out.println(num + " : " + count));
        
        // Count occurrences of a specific element (e.g., 1)
        long oneCount = occurrences.getOrDefault(1, 0L);
        System.out.println("Occurrences of 1: " + oneCount);

    }
}
