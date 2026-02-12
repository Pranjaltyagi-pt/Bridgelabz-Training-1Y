import java.util.Scanner;

public class ReplaceWord {

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter new word: ");
        String newWord = sc.next();

        // Calling method
        String result = replaceWord(sentence, oldWord, newWord);

        // Output
        System.out.println("Updated sentence: " + result);

        sc.close();
    }
}
