package StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialCharacterInsertion {

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("java", "money");

        List<String> specialchar = inputList.stream()
                .map(str -> str.substring(0, str.length() - 1) + "&" + str.charAt(str.length() - 2))
                .collect(Collectors.toList());
        System.out.println(specialchar);
    }

}