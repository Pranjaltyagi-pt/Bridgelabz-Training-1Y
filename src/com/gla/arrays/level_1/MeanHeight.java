import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // b. Create double array of size 11
        double[] heights = new double[11];
        double sum = 0;

        // Take input values
        System.out.println("Enter the height of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum = sum + heights[i];   // c. Find sum of all elements
        }

        // d. Calculate mean
        double mean = sum / heights.length;

        // Print mean height
        System.out.println("Mean height of the football team is: " + mean);

        sc.close();
    }
}
