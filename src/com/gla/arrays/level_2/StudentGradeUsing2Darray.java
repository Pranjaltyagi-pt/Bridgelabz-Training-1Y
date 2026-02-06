import java.util.Scanner;

public class StudentGradeUsing2Darray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // b. 2D array to store marks: [student][subject]
        // 0 = Physics, 1 = Chemistry, 2 = Maths
        int[][] marks = new int[n][3];

        double[] percentage = new double[n];
        char[] grade = new char[n];

        // c. Take input for marks with validation
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks! Enter positive values only.");
                i--; // decrement index
            }
        }

        // d. Calculate percentage and grade using 2D array
        for (int i = 0; i < n; i++) {

            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 75) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 40) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        // e. Display result
        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Phy\tChem\tMath\tPercentage\tGrade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t%.2f\t\t%c\n",
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentage[i],
                    grade[i]);
        }

        sc.close();
    }
}
