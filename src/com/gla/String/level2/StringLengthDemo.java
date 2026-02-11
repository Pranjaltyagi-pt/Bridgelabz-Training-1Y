import java.util.Scanner;

public class StringLengthDemo {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;

        try {
            // Infinite loop
            while (true) {
                text.charAt(count); // Access character
                count++;            // Increase count
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index goes beyond length
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined length
        int userLength = findLength(text);

        // Built-in length
        int builtInLength = text.length();

        // Display results
        System.out.println("Length using user-defined method: " + userLength);
        System.out.println("Length using built-in length(): " + builtInLength);

        // Compare results
        if (userLength == builtInLength) {
            System.out.println("Both lengths are the same.");
        } else {
            System.out.println("Lengths are different.");
        }

        sc.close();
    }
}
