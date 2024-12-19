package Assignment;

import java.util.Scanner;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string (for NullPointerException test):");

        String str = scanner.nextLine();

        try {
            // Accessing method length() on a potentially null object
            if (str == null || str.isEmpty()) {
                throw new NullPointerException("The string is null or empty.");
            }
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            // Handling NullPointerException
            System.out.println("NullPointerException: " + e.getMessage());
        } finally {
            scanner.close(); // Close scanner to prevent resource leaks
        }
    }
}
