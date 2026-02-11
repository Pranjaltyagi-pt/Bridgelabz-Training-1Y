import java.util.Scanner;

public class TrimUsingCharAt {

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Remove leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Remove trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        // User-defined trim
        int[] indexes = findTrimIndexes(text);
        String userTrimmed = "";

        if (indexes[0] <= indexes[1]) {
            userTrimmed = createSubstring(text, indexes[0], indexes[1]);
        }

        // Built-in trim
        String builtInTrimmed = text.trim();

        // Compare results
        boolean result = compareStrings(userTrimmed, builtInTrimmed);

        // Display results
        System.out.println("Trimmed using user-defined method: \"" + userTrimmed + "\"");
        System.out.println("Trimmed using trim(): \"" + builtInTrimmed + "\"");

        if (result) {
            System.out.println("Both results are the same.");
        } else {
            System.out.println("Results are different.");
        }

        sc.close();
    }
}
