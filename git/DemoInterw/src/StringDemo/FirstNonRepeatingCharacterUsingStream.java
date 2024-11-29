package StringDemo;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterUsingStream {
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatingCharacter(input);// for calling mathod

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeatingCharacter(String str) {
        // Create a frequency map using Stream API
        Map<Character, Long> charCountMap = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Find the first non-repeating character
        Optional<Character> firstNonRepeating = str.chars()
            .mapToObj(c -> (char) c)
            .filter(c -> charCountMap.get(c) == 1)
            .findFirst();

        // Return the character or null character if not found
        return firstNonRepeating.orElse('\0');
    }
}
