package StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstLatterCapital {
    public static void main(String[] args) {
        List<String> lst= Arrays.asList("bob","ram","jay","naman");
        List<String> newdata = lst.stream().map(l -> l.substring(0, 1).toUpperCase() + l.substring(1).toLowerCase()).collect(Collectors.toList());
        System.out.println(newdata);

    }
}
