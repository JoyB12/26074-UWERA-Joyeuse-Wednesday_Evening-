package Assignment;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompting the user to enter a number for the test
        System.out.println("Enter a negative number (for IllegalArgumentException test):");
        int age = scanner.nextInt();

        try {
            // Checking for an invalid age value
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }
            System.out.println("Age is valid.");
        } catch (IllegalArgumentException e) {
            // Handling IllegalArgumentException
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
