import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormattingExample {
    public static void main(String[] args) {

        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Create formatters
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Format the date
        String date1 = currentDate.format(format1);
        String date2 = currentDate.format(format2);
        String date3 = currentDate.format(format3);

        // Display results
        System.out.println("Format 1 (dd/MM/yyyy) : " + date1);
        System.out.println("Format 2 (yyyy-MM-dd) : " + date2);
        System.out.println("Format 3 (EEE, MMM dd, yyyy) : " + date3);
    }
}
