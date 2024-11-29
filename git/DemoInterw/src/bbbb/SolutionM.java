package bbbb;

import java.util.*;
import java.util.stream.Collectors;

public class SolutionM {

    public static int EscapeWays(int N, List<List<Integer>> A) {
        // Directions for moving up, down, left, right
        int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        boolean[][] visited = new boolean[N][N]; // Track visited cells
        return dfs(A, 0, 0, N, visited, directions); // Start DFS from (0, 0)
    }

    private static int dfs(List<List<Integer>> A, int x, int y, int N, boolean[][] visited, int[][] directions) {
        // If out of bounds or hitting an obstacle, return 0
        if (x < 0 || x >= N || y < 0 || y >= N || A.get(x).get(y) == 1 || visited[x][y]) {
            return 0;
        }

        // If we've reached the bottom-right corner, return 1 (found a path)
        if (x == N - 1 && y == N - 1) {
            return 1;
        }

        // Mark this cell as visited
        visited[x][y] = true;
        int paths = 0;

        // Explore all four possible directions
        for (int[] dir : directions) {
            int newX = x + dir[0];
            int newY = y + dir[1];
            paths += dfs(A, newX, newY, N, visited, directions); // Recur for the next cell
        }

        // Backtrack: unmark this cell
        visited[x][y] = false;
        return paths; // Return the total number of paths found
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine().trim());

        List<List<Integer>> A = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            A.add(Arrays.asList(scan.nextLine().trim().split(""))
                    .stream().map(Integer::parseInt).collect(Collectors.toList()));
        }

        int result = EscapeWays(N, A);
        System.out.println(result);
        scan.close();
    }
}

