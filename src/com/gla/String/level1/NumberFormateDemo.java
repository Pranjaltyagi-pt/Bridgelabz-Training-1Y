package com.gla.String.level1;

import java.util.Scanner;

public class NumberFormateDemo {

    // Method to generate the exception
    public static void generateException(String text) {
        // Trying to convert non-numeric text to integer
        int num = Integer.parseInt(text);
        System.out.println("Number: " + num);
    }

    // Method to handle the exception
    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number: " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Input is not a valid number.");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input as String
        System.out.print("Enter a number: ");
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
