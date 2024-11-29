package bbbb;

import java.util.stream.LongStream;

public class FactorialUsingStream {
    public static void main(String[] args) {
        int number = 5;  // Example number

        // Factorial using Stream API
        long factorial = LongStream.rangeClosed(1, number)  // Generates a stream of numbers from 1 to 'number'
                                   .reduce(1, (a, b) -> a * b);  // Multiplies all elements in the stream

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
