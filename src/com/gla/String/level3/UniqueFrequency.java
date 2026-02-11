import java.util.Scanner;

public class UniqueFrequency {

    // Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {
        int len = text.length();
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isDuplicate = false;

            // Check if already stored
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == ch) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, store it
            if (!isDuplicate) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        // Create final array of exact size
        char[] unique = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    // Method to find frequency using unique characters
    public static String[][] getFrequency(String text) {

        // Step 1: Frequency array for ASCII
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Step 2: Get unique characters
        char[] unique = uniqueCharacters(text);

        // Step 3: Create 2D array
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            char ch = unique[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }

        return result;
    }

    // Method to display result
    public static void display(String[][] data) {
        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Get frequency using unique characters
        String[][] result = getFrequency(text);

        // Display
        display(result);

        sc.close();
    }
}
