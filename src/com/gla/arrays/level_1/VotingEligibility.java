import java.util.Scanner;

public class VotingEligibility {

    // Method to take ages of n students and return array
    public static int[] getAges(int n) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[n];

        System.out.println("Enter ages of " + n + " students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    // Method to check voting eligibility and return 2D array
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age); // Store age

            // Validate age
            if (age < 0) {
                result[i][1] = "Cannot Vote";
            }
            else if (age >= 18) {
                result[i][1] = "Can Vote";
            }
            else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    // Method to display result in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\nAge\tEligibility");
        System.out.println("-----------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Number of students

        // Step 1: Get ages
        int[] ages = getAges(n);

        // Step 2: Check eligibility
        String[][] result = checkEligibility(ages);

        // Step 3: Display result
        displayTable(result);
    }
}
