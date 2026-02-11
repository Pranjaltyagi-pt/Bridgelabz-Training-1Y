import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Compare characters from start and end (Iterative)
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method to reverse string using charAt()
    public static char[] reverseText(String text) {
        int len = text.length();
        char[] reverse = new char[len];

        for (int i = 0; i < len; i++) {
            reverse[i] = text.charAt(len - 1 - i);
        }

        return reverse;
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseText(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Logic 1
        boolean result1 = isPalindromeIterative(text);

        // Logic 2
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);

        // Logic 3
        boolean result3 = isPalindromeArray(text);

        // Display results
        System.out.println("\nPalindrome Check Results:");
        System.out.println("Using Iterative Method: " + result1);
        System.out.println("Using Recursive Method: " + result2);
        System.out.println("Using Array Method: " + result3);

        sc.close();
    }
}
