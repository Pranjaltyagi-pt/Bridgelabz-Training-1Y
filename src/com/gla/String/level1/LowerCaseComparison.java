package com.gla.String.level1;

import java.util.Scanner;

public class LowerCaseComparison {

    // Method to convert text to lowercase using ASCII logic
    public static String convertToLower(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is uppercase (A to Z)
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);   // Convert to lowercase using ASCII
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

        // User-defined lowercase conversion
        String userLower = convertToLower(text);

        // Built-in method
        String builtInLower = text.toLowerCase();

        // Compare both results
        boolean result = compareStrings(userLower, builtInLower);

        // Display results
        System.out.println("Lowercase using user-defined method: " + userLower);
        System.out.println("Lowercase using toLowerCase(): " + builtInLower);

        if (result) {
            System.out.println("Both results are the same.");
        } else {
            System.out.println("Results are different.");
        }

        sc.close();
    }
}
