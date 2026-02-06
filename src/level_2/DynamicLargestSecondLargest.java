import java.util.Scanner;

public class DynamicLargestSecondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // b. Initial array size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // c. Index variable
        int index = 0;

        // d. Loop until number becomes 0
        while (number != 0) {

            // a (modified f). Increase array size if index == maxDigit
            if (index == maxDigit) {

                maxDigit = maxDigit + 10;   // increase size by 10
                int[] temp = new int[maxDigit];

                // b. Copy old array into temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // c. Assign temp array to digits
                digits = temp;
            }

            // e. Store digit in array
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // g. Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // h. Find largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // i. Display result
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        sc.close();
    }
}
