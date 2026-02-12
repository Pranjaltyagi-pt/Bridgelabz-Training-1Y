import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmeticExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take date input from user
        System.out.print("Enter a date (yyyy-mm-dd): ");
        String inputDate = sc.nextLine();

        // Convert String to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        // Subtract 3 weeks
        updatedDate = updatedDate.minusWeeks(3);

        // Display results
        System.out.println("Original Date : " + date);
        System.out.println("Final Date after calculations : " + updatedDate);

        sc.close();
    }
}
