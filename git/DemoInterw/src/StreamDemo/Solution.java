package StreamDemo;

import java.util.*;

public class Solution {

    public static int findMaxRequests(int N, int[] A, int[] L, int[] R) {
        TreeMap<Integer, Integer> events = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            events.put(L[i], events.getOrDefault(L[i], 0) + A[i]);
            events.put(R[i] + 1, events.getOrDefault(R[i] + 1, 0) - A[i]);
        }
        int currentRequests = 0;
        int maxRequests = 0;
        for (Map.Entry<Integer, Integer> entry : events.entrySet()) {
            currentRequests += entry.getValue();
            maxRequests = Math.max(maxRequests, currentRequests);
        }
        
        return maxRequests;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        // Arrays to hold the number of requests per second, start and end times
        int[] A = new int[N];
        int[] L = new int[N];
        int[] R = new int[N];
        
        // Read the number of requests per second for each client
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        // Read the start times for each client
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }
        
        // Read the end times for each client
        for (int i = 0; i < N; i++) {
            R[i] = sc.nextInt();
        }

        // Call the findMaxRequests function to compute the result
        int result = findMaxRequests(N, A, L, R);
        
        // Output the result
        System.out.println(result);
        
        sc.close();
    }
}
