package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByLengthUsingComparator {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("interview");
        list.add("a");
        list.add("prashant");
        Collections.sort(list, Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}



