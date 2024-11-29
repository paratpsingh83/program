package CollectionDemo;

import java.util.*;

public class Solution1 {
    public static int[] solve(int n, int[] A) {
        int[] result = new int[n];
        boolean[] seen = new boolean[n + 1];
        int mex = 0;
        for (int i = 0; i < n; i++) {
            seen[A[i]] = true;
            while (mex <= n && seen[mex]) {
                mex++;
            }
            result[i] = mex;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int[] result = solve(n, A);
        for (int res : result) {
            System.out.print(res + " ");
        }
        sc.close();
    }
}
