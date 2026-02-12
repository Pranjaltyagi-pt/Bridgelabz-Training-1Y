import java.util.Scanner;

public class GcdLcmCalculator {

    // Function to take input
    public static int getInput(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    // Function to calculate GCD using Euclidean Algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM
    public static int findLCM(int a, int b) {
        int gcd = findGCD(a, b);
        return (a * b) / gcd;
    }

    // Function to display result
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int num1 = getInput(sc, "Enter first number: ");
        int num2 = getInput(sc, "Enter second number: ");

        // Calculation
        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        // Output
        displayResult(num1, num2, gcd, lcm);

        sc.close();
    }
}
