package Assignment;
import java.util.Scanner;

public class ClassCastTest { // Renamed the class to avoid conflict
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to cast to String (for ClassCastException test):");
        int number = scanner.nextInt();

        try {
            // Attempting to cast an Integer to a String will cause ClassCastException
            String str = (String) (Object) number;
        } catch (ClassCastException e) {
            // Handling ClassCastException
            System.out.println("ClassCastException: Cannot cast Integer to String.");
        }
    }
}
