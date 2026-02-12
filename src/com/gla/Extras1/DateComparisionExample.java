import java.time.LocalDate;
import java.util.Scanner;

public class DateComparisionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take first date input
        System.out.print("Enter first date (yyyy-mm-dd): ");
        String input1 = sc.nextLine();

        // Take second date input
        System.out.print("Enter second date (yyyy-mm-dd): ");
        String input2 = sc.nextLine();

        // Convert String to LocalDate
        LocalDate date1 = LocalDate.parse(input1);
        LocalDate date2 = LocalDate.parse(input2);

        // Compare dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE the second date.");
        }
        else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER the second date.");
        }
        else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the SAME.");
        }

        sc.close();
    }
}
