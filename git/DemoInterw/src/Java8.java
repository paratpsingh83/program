import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {
    public static void main(String[] args) {

        //creating of stream
        List<String> list = Arrays.asList("a", "b", "c","a");

        Stream<String> stream = list.stream();
        System.out.println(stream);

        //Lambda Expression
        Stream<String> a = list.stream().filter(s -> s.startsWith("a"));
        System.out.println(a);

        //filtering date
        List<String> filtered = list.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
        System.out.println(filtered);

        //map the data
        List<Integer> lengths = list.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lengths);

        //reduce
        Optional<String> concatenated = list.stream().reduce((s1, s2) -> s1 + s2);
        System.out.println(concatenated);

        //sorting the data
        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        //method Chaining
            List<String> result = list.stream()
                    .filter(s -> s.startsWith("a"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());

        System.out.println(result);





    }
}
