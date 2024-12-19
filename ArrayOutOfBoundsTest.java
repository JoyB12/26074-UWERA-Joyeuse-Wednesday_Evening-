package Assignment;
import java.util.Scanner;

public class ArrayOutOfBoundsTest { // Renamed the class to avoid conflict
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an index to access in an array (for ArrayIndexOutOfBoundsException test):");
        int index = scanner.nextInt();

        try {
            // Accessing an invalid index will cause ArrayIndexOutOfBoundsException
            System.out.println("The Number is " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the case when index is out of bounds
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index.");
        }
    }
}
