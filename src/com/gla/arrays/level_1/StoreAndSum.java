import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {

        // Array to store values
        double[] numbers = new double[10];

        // Variable to store total
        double total = 0.0;

        // Index variable
        int index = 0;

        Scanner sc = new Scanner(System.in);

        // Infinite while loop
        while (true) {

            System.out.print("Enter a number: ");
            double value = sc.nextDouble();

            // Break if value is 0 or negative
            if (value <= 0) {
                break;
            }

            // Break if array is full
            if (index == 10) {
                break;
            }

            // Store value in array and increment index
            numbers[index] = value;
            index++;
        }

        // Loop to calculate total
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display stored numbers
        System.out.println("Stored numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Display total
        System.out.println("Total = " + total);

        sc.close();
    }
}
