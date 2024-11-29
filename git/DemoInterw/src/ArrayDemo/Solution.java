package ArrayDemo;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    public static void closestNumbers(List<Integer> numbers) {
        // Sort the list to make it easier to find the minimum absolute difference
        Collections.sort(numbers);

        // Initialize the minimum difference with a large value
        int minDifference = Integer.MAX_VALUE;
        
        // List to hold the pairs with the minimum difference
        List<String> resultPairs = new ArrayList<>();
        
        // Loop through the sorted numbers to find the minimum difference
        for (int i = 1; i < numbers.size(); i++) {
            // Calculate the absolute difference between consecutive elements
            int diff = numbers.get(i) - numbers.get(i - 1);
            
            // Update the minimum difference if a smaller one is found
            if (diff < minDifference) {
                minDifference = diff;
                resultPairs.clear();  // Clear previous pairs since we found a smaller difference
                resultPairs.add(numbers.get(i - 1) + " " + numbers.get(i)); // Add new pair
            } 
            // If the current difference is equal to the minimum difference, add the pair
            else if (diff == minDifference) {
                resultPairs.add(numbers.get(i - 1) + " " + numbers.get(i));
            }
        }
        
        // Print all pairs with the minimum difference
        for (String pair : resultPairs) {
            System.out.println(pair);
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the number of elements in the array
        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());
        
        // Read the numbers into a list
        List<Integer> numbers = Arrays.stream(bufferedReader.readLine().split(" "))
                                      .map(Integer::parseInt)
                                      .collect(Collectors.toList());
        
        // Call the function to find and print the closest pairs
        Result.closestNumbers(numbers);
        
        bufferedReader.close();
    }
}
