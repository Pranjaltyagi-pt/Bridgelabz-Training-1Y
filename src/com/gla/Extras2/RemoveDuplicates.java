import java.util.Scanner;

public class RemoveDuplicates {

    // Function to remove duplicate characters
    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If character is not already in result, add it
            if (result.indexOf(ch) == -1) {
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

        // Remove duplicates
        String output = removeDuplicates(input);

        // Output
        System.out.println("String after removing duplicates: " + output);

        sc.close();
    }
}
