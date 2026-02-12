import java.util.Scanner;

public class FactorialRecurtion {

    // Function to take input
    public static int getInput(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;   // Base case
        }
        return n * factorial(n - 1);  // Recursive call
    }

    // Function to display result
    public static void displayResult(int n, long result) {
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int number = getInput(sc);

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculation
            long fact = factorial(number);

            // Output
            displayResult(number, fact);
        }

        sc.close();
    }
}
