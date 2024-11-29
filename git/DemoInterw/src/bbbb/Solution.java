package bbbb;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static int EscapeWays(int N, List<List<Integer>> A) {
        // Create a DP table initialized to 0
        int[][] dp = new int[N][N];

        // If the starting point is valid (0)
        if (A.get(0).get(0) == 0) {
            dp[0][0] = 1; // There's one way to reach the start
        }

        // Fill the DP table
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // If the cell is an obstacle, skip it
                if (A.get(i).get(j) == 1) {
                    dp[i][j] = 0;
                } else {
                    // Add paths from the cell above
                    if (i > 0) {
                        dp[i][j] += dp[i - 1][j];
                    }
                    // Add paths from the cell to the left
                    if (j > 0) {
                        dp[i][j] += dp[i][j - 1];
                    }
                }
            }
        }

        // Return the number of unique paths to reach the bottom-right corner
        return dp[N - 1][N - 1];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine().trim());

        List<List<Integer>> A = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            A.add(
                    Arrays.asList(scan.nextLine().trim().split(" "))
                            .stream().map(Integer::parseInt)
                            .collect(Collectors.toList())
            );
        }

        // Ensure that the grid has the expected dimensions
        if (A.size() != N || A.stream().anyMatch(row -> row.size() != N)) {
            System.out.println("Input grid dimensions do not match the expected size.");
            return;
        }

        int result = EscapeWays(N, A);
        System.out.println(result);
        scan.close();
    }
}
