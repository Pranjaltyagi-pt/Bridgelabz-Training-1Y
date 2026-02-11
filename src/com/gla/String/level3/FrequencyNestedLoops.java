import java.util.Scanner;

public class FrequencyNestedLoops {

    // Method to find character frequency using nested loops
    public static String[] getFrequency(String text) {

        // Convert string to character array
        char[] chars = text.toCharArray();
        int len = chars.length;

        int[] freq = new int[len];

        // Step 1: Calculate frequency using nested loops
        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') {
                continue; // Skip already counted characters
            }

            freq[i] = 1;

            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate
                }
            }
        }

        // Step 2: Count unique characters
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Step 3: Store result in 1D String array
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

        return result;
    }

    // Method to display result
    public static void display(String[] data) {
        System.out.println("\nCharacter Frequency:");
        System.out.println("----------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Get frequency
        String[] result = getFrequency(text);

        // Display
        display(result);

        sc.close();
    }
}
