package com.gla.String.level1;

import java.util.Scanner;

public class StringIndexDemo {

    // Method to generate the exception
    public static void generateException(String text) {
        // Accessing index beyond string length
        System.out.println("Character: " + text.charAt(text.length()));
    }

    // Method to handle the exception
    public static void handleException(String text) {
        try {
            // Accessing invalid index
            System.out.println("Character: " + text.charAt(text.length()));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println("Index is out of the string length.");
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
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException()");
        }

        // 2. Handle Exception properly
        System.out.println("\nHandling Exception:");
        handleException(text);

        sc.close();
    }
}
