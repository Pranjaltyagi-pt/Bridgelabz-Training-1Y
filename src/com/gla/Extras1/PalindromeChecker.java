import java.util.Scanner;

public class PalindromeChecker {

    // Function to take input
    public static String getInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Function to check palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Function to display result
    public static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println("\"" + str + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + str + "\" is NOT a Palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String input = getInput(sc);

        // Check palindrome
        boolean result = isPalindrome(input);

        // Display result
        displayResult(input, result);

        sc.close();
    }
}
