import java.util.Scanner;

public class VowelConsonentCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        // Convert to lowercase for easy comparison
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is a letter
            if (ch >= 'a' && ch <= 'z') {
                // Check vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Output result
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        sc.close();
    }
}
