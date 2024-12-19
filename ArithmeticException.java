package Assignment;
import java.util.Scanner;

    public class ArithmeticException extends Throwable {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to divide by zero (for ArithmeticException test):");
            int num = scanner.nextInt();

            try {
                // Dividing by zero will cause ArithmeticException
                int result = num / 0;
                System.out.println("Result: " + result);
            } catch (java.lang.ArithmeticException e) {
                // Handling ArithmeticException when dividing by zero
                System.out.println("ArithmeticException: Cannot divide by zero.");
            }
        }
    }

