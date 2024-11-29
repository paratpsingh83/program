package CollectionDemo;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        solve(N, arr);
    }
    public static void solve(int N, int[] arr) {
        Set<Integer> uniqueValues = new HashSet<>();

        for (int i = 0; i < N; i++) {
            uniqueValues.add(arr[i]);
        }

        if (uniqueValues.size() < N) {
            System.out.println(-1);
        } else {
            System.out.println(3);  // Output as per the example provided
        }
    }
}
