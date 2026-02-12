import java.util.Scanner;

public class MOstFrequentCharacter {

    // Function to find most frequent character
    public static char findMostFrequent(String str) {
        int[] freq = new int[256]; // ASCII frequency array

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int max = 0;
        char mostFrequent = ' ';

        // Find character with highest frequency
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max && str.charAt(i) != ' ') {
                max = freq[str.charAt(i)];
                mostFrequent = str.charAt(i);
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find most frequent character
        char result = findMostFrequent(input);

        // Output
        System.out.println("Most Frequent Character: '" + result + "'");

        sc.close();
    }
}
