package bbbb;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "i am working";  // Example input
        String output = reverseWords(input);  // Call the method to reverse words
        System.out.println(output);  // Output the reversed words
    }

    // Method to reverse the letters of each word in the sentence
    public static String reverseWords(String input) {
        // Split the sentence into words
        String[] words = input.split(" ");
        
        // StringBuilder to store the result
        StringBuilder reversedSentence = new StringBuilder();
        
        // Loop through each word in the input
        for (String word : words) {
            // Reverse each word and append to the result
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedSentence.append(reversedWord).append(" ");  // Add space after each reversed word
        }
        
        // Remove the trailing space and return the result
        return reversedSentence.toString().trim();
    }
}
