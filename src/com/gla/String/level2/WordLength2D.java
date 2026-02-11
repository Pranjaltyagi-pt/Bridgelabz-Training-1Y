import java.util.Scanner;

public class WordLength2D {

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

        // Count words
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

    // Method to create 2D array of word and its length
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];  // Word
            int len = findLength(words[i]);
            result[i][1] = String.valueOf(len);  // Length as String
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Split words
        String[] words = splitText(text);

        // Get 2D array
        String[][] wordData = getWordLengths(words);

        // Display in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < wordData.length; i++) {
            String word = wordData[i][0];
            int length = Integer.parseInt(wordData[i][1]); // Convert back to int
            System.out.println(word + "\t" + length);
        }

        sc.close();
    }
}
