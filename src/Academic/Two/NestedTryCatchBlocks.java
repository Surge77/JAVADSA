package Academic.Two;
import java.util.*;

/**
 * Create a Java program that uses nested try-catch blocks to handle
 * multiple exceptions within a single method. For example, handle a
 * NumberFormatException for invalid input conversion and an
 * ArithmeticException for division by zero within the same method.
 */

public class NestedTryCatchBlocks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Outer try block for NumberFormatException
            System.out.print("Enter the first number (numerator): ");
            String numInput1 = scanner.nextLine();
            int numerator = Integer.parseInt(numInput1);  // Potential NumberFormatException

            System.out.print("Enter the second number (denominator): ");
            String numInput2 = scanner.nextLine();
            int denominator = Integer.parseInt(numInput2);  // Potential NumberFormatException

            try {
                // Inner try block for ArithmeticException (division by zero)
                int result = numerator / denominator;  // Potential ArithmeticException
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                // Handle division by zero
                System.out.println("Error: Division by zero is not allowed.");
            }

        } catch (NumberFormatException e) {
            // Handle invalid number format
            System.out.println("NumberFormatException: Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();  // Ensure the scanner is closed
        }
    }
}

