import java.util.Scanner;

public class PalindromeCheacker {

    // Function to check palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Convert to lowercase for case-insensitive check
        str = str.toLowerCase();

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Check palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}
