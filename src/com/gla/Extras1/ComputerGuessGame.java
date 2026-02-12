import java.util.Scanner;
import java.util.Random;

public class ComputerGuessGame {

    // Function to generate a guess between low and high
    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    // Function to get user feedback
    public static char getFeedback(Scanner sc) {
        System.out.print("Enter feedback (H = High, L = Low, C = Correct): ");
        return sc.next().toUpperCase().charAt(0);
    }

    // Function to update range based on feedback
    public static int[] updateRange(int guess, int low, int high, char feedback) {
        if (feedback == 'H') {
            high = guess - 1;
        } else if (feedback == 'L') {
            low = guess + 1;
        }
        return new int[]{low, high};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        int guess;
        char feedback;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Computer will try to guess it!");

        while (true) {
            guess = generateGuess(low, high);
            System.out.println("Computer's guess: " + guess);

            feedback = getFeedback(sc);

            if (feedback == 'C') {
                System.out.println("Yay! Computer guessed your number correctly.");
                break;
            }

            int[] range = updateRange(guess, low, high, feedback);
            low = range[0];
            high = range[1];

            if (low > high) {
                System.out.println("Invalid feedback! Please restart the game.");
                break;
            }
        }

        sc.close();
    }
}
