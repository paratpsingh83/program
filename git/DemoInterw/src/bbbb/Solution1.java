package bbbb;

import java.util.Scanner;

public class Solution1 {

    public static int solve(String feedbacks) {
        // Split the feedbacks based on the delimiter (semicolon in this case)
        String[] feedbackArray = feedbacks.split(";");

        // Initialize the score
        int score = 0;

        // Iterate through the feedbacks
        for (String feedback : feedbackArray) {
            feedback = feedback.trim(); // Remove any leading/trailing whitespace
            switch (feedback) {
                case "positive":
                    score += 1;
                    break;
                case "negative":
                    score -= 1;
                    break;
                case "neutral":
                    // No change in score
                    break;
                default:
                    // Handle unexpected input if necessary
                    break;
            }
        }

        // Return the final score
        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter feedbacks separated by semicolons (e.g., positive; neutral; negative):");
        String feedbacks = scanner.nextLine(); // Read the input line

        int result = solve(feedbacks);
        System.out.println("Net feedback score: " + result); // Output the net feedback score

        scanner.close();
    }
}
