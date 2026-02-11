import java.util.Scanner;

public class ShortestLongestWord {

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
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            int len = findLength(words[i]);
            data[i][1] = String.valueOf(len);
        }

        return data;
    }

    // Method to find shortest and longest word indexes
    public static int[] findMinMax(String[][] data) {
        int minIndex = 0;
        int maxIndex = 0;

        int minLength = Integer.parseInt(data[0][1]);
        int maxLength = minLength;

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);

            if (len < minLength) {
                minLength = len;
                minIndex = i;
            }

            if (len > maxLength) {
                maxLength = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input text
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Step 1: Split text
        String[] words = splitText(text);

        // Step 2: Create 2D array (word + length)
        String[][] wordData = getWordLengths(words);

        // Step 3: Find shortest and longest
        int[] result = findMinMax(wordData);

        int minIndex = result[0];
        int maxIndex = result[1];

        // Display all words with lengths
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (int i = 0; i < wordData.length; i++) {
            System.out.println(wordData[i][0] + "\t" + wordData[i][1]);
        }

        // Display shortest and longest words
        System.out.println("\nShortest Word: " + wordData[minIndex][0] +
                " (Length: " + wordData[minIndex][1] + ")");
        System.out.println("Longest Word: " + wordData[maxIndex][0] +
                " (Length: " + wordData[maxIndex][1] + ")");

        sc.close();
    }
}
