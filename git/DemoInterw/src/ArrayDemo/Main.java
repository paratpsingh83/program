package ArrayDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Create the ArrayList with some duplicate values
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(11);
        arrayList.add(33);
        arrayList.add(11);
        arrayList.add(1);
        arrayList.add(13);
        arrayList.add(12);
        //Find the duplicate elements using Stream API
        List<Integer> duplicates = arrayList.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))  // Group by element and count occurrences
                .entrySet().stream()  // Convert the map to a stream
                .filter(entry -> entry.getValue() > 1)  // Filter for duplicates (count > 1)
                .map(Map.Entry::getKey)  // Extract the key (element)
                .collect(Collectors.toList());  // Collect the result as a list
        // Print the duplicate elements
        System.out.println("Duplicate elements: " + duplicates);
    }
}
