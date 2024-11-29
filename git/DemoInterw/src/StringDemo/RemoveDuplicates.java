package StringDemo;

import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";                 // ye String hai
        String result = removeDuplicates(input);      //method call kiyaa
        System.out.println(result);
    }

    public static String removeDuplicates(String str) {
        return str.chars()
                .distinct()
                .mapToObj(c -> (char) c)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
