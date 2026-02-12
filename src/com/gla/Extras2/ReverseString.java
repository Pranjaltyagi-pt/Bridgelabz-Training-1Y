import java.util.Scanner;

public class ReverseString {

    // Function to reverse the string
    public static String reverse(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Reverse using function
        String result = reverse(input);

        // Output
        System.out.println("Reversed string: " + result);

        sc.close();
    }
}
