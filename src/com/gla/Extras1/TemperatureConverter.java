import java.util.Scanner;

public class TemperatureConverter {

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to display menu
    public static void showMenu() {
        System.out.println("\nTemperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        showMenu();
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double c = sc.nextDouble();
            double f = celsiusToFahrenheit(c);
            System.out.println("Temperature in Fahrenheit: " + f);
        }
        else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = sc.nextDouble();
            double c = fahrenheitToCelsius(f);
            System.out.println("Temperature in Celsius: " + c);
        }
        else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
