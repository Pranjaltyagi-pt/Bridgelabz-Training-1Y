import java.util.Scanner;

public class PrimeChecker {

    // Function to check prime number
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calling prime function
        if (isPrime(number)) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is NOT a Prime number.");
        }

        sc.close();
    }
}
