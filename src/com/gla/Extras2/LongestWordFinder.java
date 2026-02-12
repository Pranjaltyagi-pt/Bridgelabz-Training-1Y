import java.util.Scanner;

public class LongestWordFinder {

    // Function to find the longest word
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Find longest word
        String longestWord = findLongestWord(sentence);

        // Output
        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + longestWord.length());

        sc.close();
    }
}
