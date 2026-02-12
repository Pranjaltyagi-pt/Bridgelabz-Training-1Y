import java.util.Scanner;

public class RemoveCharacter {

    // Function to remove a specific character
    public static String removeChar(String str, char ch) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            // Add character only if it is not equal to ch
            if (str.charAt(i) != ch) {
                result = result + str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Input character to remove
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        // Remove character
        String output = removeChar(input, ch);

        // Output
        System.out.println("Modified String: " + output);

        sc.close();
    }
}
