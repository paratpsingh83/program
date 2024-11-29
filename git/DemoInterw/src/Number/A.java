package Number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        List<Integer> lst =Arrays.asList(3, 4, 5, 1, 4, 2, 3, 5, 6, 6, 5, 1, 1, 3, 5, 6, 2);
        List<Integer> collect = lst.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}
