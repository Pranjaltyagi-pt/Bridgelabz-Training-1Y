package com.gla.String.level1;

import java.util.Scanner;

public class IlligalArgumentDemo {

    // Method to generate the exception
    public static void generateException(String text) {
        // Start index greater than end index
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method to handle the exception
    public static void handleException(String text) {
        try {
            // Invalid substring arguments
            System.out.println("Substring: " + text.substring(5, 2));
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            System.out.println("Start index cannot be greater than end index.");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // 1. Generate Exception
        System.out.println("\nGenerating Exception:");
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred in generateException()");
        }

        // 2. Handle Exception properly
        System.out.println("\nHandling Exception:");
        handleException(text);

        sc.close();
    }
}
