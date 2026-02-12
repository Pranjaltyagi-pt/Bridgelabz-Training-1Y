import java.util.Scanner;

public class ToggleCase {

    // Function to toggle case
    public static String toggleCase(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If uppercase, convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32);
            }
            // If lowercase, convert to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32);
            }
            // Keep other characters same
            else {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Toggle case
        String output = toggleCase(input);

        // Output
        System.out.println("After toggling case: " + output);

        sc.close();
    }
}
