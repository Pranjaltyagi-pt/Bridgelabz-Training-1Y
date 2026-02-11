import java.util.Scanner;

public class UniqueCharacters {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    // Method to find unique characters using charAt()
    public static char[] getUniqueChars(String text) {
        int len = findLength(text);

        // Temporary array to store unique characters
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isDuplicate = false;

            // Check with previous characters
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == current) {
                    isDuplicate = true;
                    break;
                }
            }

            // If unique, store in temp array
            if (!isDuplicate) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create final array of exact size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input text
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Get unique characters
        char[] uniqueChars = getUniqueChars(text);

        // Display result
        System.out.println("Unique characters are:");
        for (int i = 0; i < uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }

        sc.close();
    }
}
