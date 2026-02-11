import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency and return 2D array
    public static String[][] getFrequency(String text) {

        // Step 1: Frequency array for ASCII (256 characters)
        int[] freq = new int[256];

        // Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 2: Count unique characters (to size the 2D array)
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                uniqueCount++;
                freq[ch] = -freq[ch]; // Mark as counted
            }
        }

        // Step 3: Create result array
        String[][] result = new String[uniqueCount][2];

        int index = 0;

        // Restore frequencies and store data
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] < 0) { // means not yet stored
                int count = -freq[ch];
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(count);
                freq[ch] = 0; // mark as stored
                index++;
            }
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

        // Input string
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Get frequency
        String[][] result = getFrequency(text);

        // Display result
        display(result);

        sc.close();
    }
}
