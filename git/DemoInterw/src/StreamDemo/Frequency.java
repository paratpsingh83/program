package StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {

        List<String> wordsList = Arrays.asList("hello", "bye", "ciao", "bye", "ciao");

        Map<String, Long> wordCount = wordsList.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(wordCount);
    }
}
