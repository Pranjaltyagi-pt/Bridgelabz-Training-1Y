package com.gla.String.level1;

import java.util.Scanner;

public class UpperCaseComparison {

    // Method to convert text to uppercase using ASCII logic
    public static String convertToUpper(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is lowercase (a to z)
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);   // Convert to uppercase using ASCII
            }

            result = result + ch;
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // User-defined uppercase conversion
        String userUpper = convertToUpper(text);

        // Built-in method
        String builtInUpper = text.toUpperCase();

        // Compare both results
        boolean result = compareStrings(userUpper, builtInUpper);

        // Display results
        System.out.println("Uppercase using user-defined method: " + userUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);

        if (result) {
            System.out.println("Both results are the same.");
        } else {
            System.out.println("Results are different.");
        }

        sc.close();
    }
}
