package StreamDemo;

import java.util.Arrays;
import java.util.List;

public class SumGreaterThanTen {

    public static void main(String[] args) {

        // Initialize the list
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 6, 7, 7, 7, 7, 7, 6, 6,19,11);

        // Calculate the sum of numbers greater than 10
        int sum = list.stream()
                .filter(num -> num > 10)  // Filter numbers greater than 10
                .mapToInt(Integer::intValue)  // Convert to IntStream
                .sum();  // Calculate the sum
        // Print the result
        System.out.println("Sum of numbers greater than 10: " + sum);

    }

}
