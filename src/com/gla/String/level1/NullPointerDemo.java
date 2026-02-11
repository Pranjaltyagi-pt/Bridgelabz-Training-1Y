package com.gla.String.level1;

public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;   // Variable initialized to null

        // Calling String method on null object
        System.out.println("Length of string: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;

        try {
            // This will throw exception
            System.out.println("Length of string: " + text.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("Cannot call method on a null object.");
        }
    }

    public static void main(String[] args) {

        // 1. Generate Exception (Program will crash if not handled)
        System.out.println("Generating NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException()");
        }

        System.out.println();

        // 2. Handle Exception properly
        System.out.println("Handling NullPointerException:");
        handleException();
    }
}
