package StreamDemo;

import java.util.*;
import java.util.stream.*;

public class SecondMaxOccurrence {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "kiwi", "kiwi");

        List<Map.Entry<String, Long>> sortedEntries = items.stream()
            .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
            .entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toList());

        String secondMaxElement = (sortedEntries.size() > 1) ? sortedEntries.get(1).getKey() : null;

        System.out.println("Element with second max occurrence: " + secondMaxElement);
    }
}
