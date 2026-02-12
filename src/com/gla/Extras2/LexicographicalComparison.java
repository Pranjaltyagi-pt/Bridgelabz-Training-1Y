import java.util.Scanner;

public class LexicographicalComparison {

    // Function to compare two strings
    public static int compareStrings(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int minLength = Math.min(len1, len2);

        // Compare character by character
        for (int i = 0; i < minLength; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if (ch1 != ch2) {
                return ch1 - ch2; // ASCII difference
            }
        }

        // If all characters are same, shorter string is smaller
        return len1 - len2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Compare
        int result = compareStrings(str1, str2);

        // Output
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        }
        else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.");
        }
        else {
            System.out.println("Both strings are equal.");
        }

        sc.close();
    }
}
