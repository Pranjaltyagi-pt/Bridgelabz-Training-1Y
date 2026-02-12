import java.util.Scanner;

public class SubstringOccurrences {

    // Function to count occurrences
    public static int countOccurrences(String text, String sub) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length(); // Move forward
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input main string
        System.out.print("Enter the main string: ");
        String text = sc.nextLine();

        // Input substring
        System.out.print("Enter the substring to search: ");
        String sub = sc.nextLine();

        // Count occurrences
        int result = countOccurrences(text, sub);

        // Output
        System.out.println("Substring occurs " + result + " time(s).");

        sc.close();
    }
}
