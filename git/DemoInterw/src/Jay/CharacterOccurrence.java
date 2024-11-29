package Jay;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrence {
    public static void main(String[] args) {
        // Input string
        String input = "Hello World";
        
        // Remove spaces and count occurrences using Streams
        Map<Character, Long> occurrenceMap = input.chars()   // Convert to IntStream of char codes
            .mapToObj(c -> (char) c)  // Convert to Stream<Character>
            .filter(c -> c != ' ')     // Optional: Remove spaces (if needed)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));  // Group and count
        
        // Print the occurrences
        occurrenceMap.forEach((key, value) -> System.out.println(key + " - " + value));

    }
}
