import java.util.Scanner;

public class FibonacciGenerator {

    // Function to generate and print Fibonacci sequence
    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence:");

        if (n <= 0) {
            System.out.println("Invalid number of terms.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        // Calling function
        printFibonacci(terms);

        sc.close();
    }
}
