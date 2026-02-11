import java.util.Scanner;

public class SplitTextDemo {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitText(String text) {
        int len = findLength(text);

        // Count words (spaces + 1)
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        // Last word
        words[index] = text.substring(start, len);

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking full text input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // User-defined split
        String[] userWords = splitText(text);

        // Built-in split
        String[] builtInWords = text.split(" ");

        // Compare results
        boolean result = compareArrays(userWords, builtInWords);

        // Display user-defined result
        System.out.println("\nWords using user-defined method:");
        for (String word : userWords) {
            System.out.println(word);
        }

        // Display built-in result
        System.out.println("\nWords using split() method:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        // Display comparison result
        if (result) {
            System.out.println("\nBoth results are the same.");
        } else {
            System.out.println("\nResults are different.");
        }

        sc.close();
    }
}
