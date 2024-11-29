package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfOddNumb {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        int sum = list.stream().filter(a -> a % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
