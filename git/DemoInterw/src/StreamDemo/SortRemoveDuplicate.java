package StreamDemo;

import java.util.Arrays;

public class SortRemoveDuplicate {
    public static void main(String[] args) {


        int[] nums = {3, 4, 5, 1, 4, 2, 3, 5, 6, 6, 5, 1, 1, 3, 5, 6, 2};
        Arrays.stream(nums).distinct().sorted().forEach(p-> System.out.print(p));

//        int[] array = Arrays.stream(nums).distinct().sorted().toArray();
//        for (int a:array){
//            System.out.print(a);
//        }

    }

}