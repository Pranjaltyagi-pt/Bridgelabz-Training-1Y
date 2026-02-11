import java.util.Scanner;

public class CharacterTypeDemo {

    // Method to check character type
    public static String checkCharType(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        // Check if letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to create 2D array of character and its type
    public static String[][] analyzeText(String text) {
        int len = text.length();
        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);          // Character
            result[i][1] = checkCharType(ch);           // Type
        }

        return result;
    }

    // Method to display 2D array in tabular form
    public static void displayTable(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Analyze text
        String[][] result = analyzeText(text);

        // Display result
        displayTable(result);

        sc.close();
    }
}
