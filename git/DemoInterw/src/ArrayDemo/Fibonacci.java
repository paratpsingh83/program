package ArrayDemo;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci of " + n + ": " + fibonacci(n)); // Output: 8
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");   //0 1 1 2 3 5
        }
    }
}
