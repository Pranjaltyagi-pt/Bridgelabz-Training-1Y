import java.util.Scanner;

public class MultiplicationTable6to9{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define integer array to store results (for 6 to 9 → 4 values)
        int[] multiplicationResult = new int[4];

        // b. Using for loop to calculate table from 6 to 9
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // c. Display the result
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

        sc.close();
    }
}
