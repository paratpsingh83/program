package StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOddIndex {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        int sum = IntStream.range(0, numbers.size())
                           .filter(i -> i % 2 != 0) // filter odd indices
                           .map(numbers::get)       // get elements at those indices
                           .sum();                  // sum them up

        System.out.println("Sum of elements at odd indices: " + sum);
    }
}
