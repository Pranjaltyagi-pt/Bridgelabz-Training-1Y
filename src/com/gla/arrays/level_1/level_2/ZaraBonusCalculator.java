import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arrays to store data
        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables for totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input loop
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            service[i] = sc.nextDouble();

            // Validation
            if (salary[i] <= 0 || service[i] < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // decrement index
                continue;
            }
        }

        // Calculation loop
        for (int i = 0; i < 10; i++) {

            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\n===== ZARA BONUS REPORT =====");
        System.out.println("Total Old Salary  : " + totalOldSalary);
        System.out.println("Total Bonus Paid  : " + totalBonus);
        System.out.println("Total New Salary  : " + totalNewSalary);

        sc.close();
    }
}
