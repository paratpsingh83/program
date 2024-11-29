package ArrayDemo;

import java.util.stream.IntStream;

public class Demo2 {
    public static void main(String[] args) {
        String s1="fasdjgkjdgfdghgsgsgsgsgsggfhs";
        String s2="gs";
        long count = IntStream.range(0, s1.length() - s2.length() + 1).mapToObj(i -> s1.substring(i, i + s2.length())).filter(sub -> sub.equals(s2)).count();
        System.out.println(count);

    }
}

// join qury
//SELECT custumer.custumer_name  orders.order_id  FROM Custumer  JOIN oredr ON custumre.custumer_id=order.custumer_id
