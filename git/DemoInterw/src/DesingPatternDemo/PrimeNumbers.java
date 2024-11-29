package DesingPatternDemo;

public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;  // To count the number of prime numbers found
        int num = 2;    // The number to check for primality
        while (count < 10) {
            if (isPrime(num)) {
                System.out.println(num);  // Print the prime number
                count++;  // Increment the count of primes found
            }
            num++;  // Check the next number
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  // 1 and numbers less than 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {  // Only check up to sqrt(num)
            if (num % i == 0) {  // If divisible, it's not prime
                return false;
            }
        }
        return true;  // If no divisors found, it is prime
    }
}
