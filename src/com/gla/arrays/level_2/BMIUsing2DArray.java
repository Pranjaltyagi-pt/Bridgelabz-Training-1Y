import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // b. 2D array: [person][0=height, 1=weight, 2=BMI]
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // c. Take input for height and weight with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter height (in meters): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter weight (in kg): ");
            personData[i][1] = sc.nextDouble();

            // Validation for negative values
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input! Enter positive values only.");
                i--; // repeat input for same person
            }
        }

        // d. Calculate BMI and weight status
        for (int i = 0; i < number; i++) {

            double height = personData[i][0];
            double weight = personData[i][1];

            personData[i][2] = weight / (height * height); // BMI

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // e. Display results
        System.out.println("\n===== BMI REPORT =====");
        System.out.println("Height(m)\tWeight(kg)\tBMI\t\tStatus");

        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    weightStatus[i]);
        }

        sc.close();
    }
}
