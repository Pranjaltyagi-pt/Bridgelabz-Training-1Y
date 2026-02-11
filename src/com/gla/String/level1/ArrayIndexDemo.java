package com.gla.String.level1;

import java.util.Scanner;

public class ArrayIndexDemo {

    // Method to generate the exception
    public static void generateException(String[] names) {
        // Accessing index beyond array length
        System.out.println("Name: " + names[names.length]);
    }

    // Method to handle the exception
    public static void handleException(String[] names) {
        try {
            // Invalid index access
            System.out.println("Name: " + names[names.length]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Index is out of array range.");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size from user
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];

        // Taking names input
        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // 1. Generate Exception
        System.out.println("\nGenerating Exception:");
        try {
            generateException(names);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred in generateException()");
        }

        // 2. Handle Exception properly
        System.out.println("\nHandling Exception:");
        handleException(names);

        sc.close();
    }
}

