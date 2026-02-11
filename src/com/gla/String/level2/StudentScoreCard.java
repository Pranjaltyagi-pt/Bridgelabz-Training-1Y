import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit PCM marks
    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3]; // Physics, Chemistry, Maths

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 90) + 10; // 10–99
            }
        }

        return marks;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] marks) {
        int n = marks.length;
        double[][] result = new double[n][3]; // Total, Average, Percentage

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = average;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    // Method to calculate grade
    public static String[][] calculateGrade(double[][] result) {
        int n = result.length;
        String[][] grade = new String[n][1];

        for (int i = 0; i < n; i++) {
            double per = result[i][2];

            if (per >= 90) grade[i][0] = "A+";
            else if (per >= 75) grade[i][0] = "A";
            else if (per >= 60) grade[i][0] = "B";
            else if (per >= 50) grade[i][0] = "C";
            else if (per >= 40) grade[i][0] = "D";
            else grade[i][0] = "Fail";
        }

        return grade;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] marks, double[][] result, String[][] grade) {
        System.out.println("\nStudent Scorecard");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    (int)result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grade[i][0]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 1: Generate marks
        int[][] marks = generateMarks(n);

        // Step 2: Calculate total, average, percentage
        double[][] result = calculateResults(marks);

        // Step 3: Calculate grade
        String[][] grade = calculateGrade(result);

        // Step 4: Display scorecard
        displayScoreCard(marks, result, grade);

        sc.close();
    }
}
