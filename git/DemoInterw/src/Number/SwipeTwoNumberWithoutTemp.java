package Number;

public class SwipeTwoNumberWithoutTemp {
    public static void main(String[] args) {
        int a=6;
        int b=5;
        a=a+b;       //a=11,b=5
        b=a-b;       //a=11,b=6
        a=a-b;       //a=5,b=6

        System.out.println(a);
        System.out.println(b);
    }
}
