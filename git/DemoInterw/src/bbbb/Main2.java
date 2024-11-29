package bbbb;

import java.util.*;

class Solution4 {
    // Directions for 4-directional movement (up, down, left, right)
    public static final int[] DIRECTIONS = {-1, 0, 1, 0, 0, -1, 0, 1};
    public int solution(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return -1;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int healthyCount = 0; // To track the number of healthy systems

        // Step 1: Initialize the queue with all virus-infected cells and count healthy systems
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    healthyCount++;
                }
            }
        }

        // If there are no healthy systems, no time is needed.
        if (healthyCount == 0) {
            return 0;
        }

        // Step 2: Perform BFS (Breadth-First Search)
        int minutes = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean infectedThisMinute = false;
            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int row = cell[0];
                int col = cell[1];
                // Try to infect all 4 possible neighboring cells
                for (int d = 0; d < 4; d++) {
                    int newRow = row + DIRECTIONS[d * 2];
                    int newCol = col + DIRECTIONS[d * 2 + 1];

                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols
                            && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2; // Mark as infected
                        queue.offer(new int[]{newRow, newCol});
                        healthyCount--; // Decrease the count of healthy systems
                        infectedThisMinute = true;
                    }
                }
            }
            if (infectedThisMinute) {
                minutes++; // Increment time if any infection happened this minute
            }
        }

        // Step 3: If there are still healthy systems left, return -1
        return healthyCount == 0 ? minutes : -1;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);

        // Example input format
        // You can change the format based on your needs (e.g., user input or file input)
        System.out.println("Enter grid dimensions (rows cols):");
        int rows = myobj.nextInt();
        int cols = myobj.nextInt();
        int[][] grid = new int[rows][cols];
        System.out.println("Enter the grid values (2 for virus, 1 for healthy, 0 for empty):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = myobj.nextInt();
            }
        }
        // Call the solution method and print the result
        int ans = new Solution4().solution(grid);
        System.out.println(ans);  // Output the result
    }
}
