package StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "kiwi", "grape");
        List<String> sortedWords = words.stream()
                                         .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                                         .collect(Collectors.toList());
        System.out.println(sortedWords); // Output: [kiwi, grape, apple, banana]
    }
}
