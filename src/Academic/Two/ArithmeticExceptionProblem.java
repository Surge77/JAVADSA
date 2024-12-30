package Academic.Two;
import java.util.Scanner;

/**
 * Write a Java program that takes two numbers as input from the user
 * and performs division. Implement exception handling to catch and
 * handle an ArithmeticException if the user attempts to divide by
 * zero.
 */
public class ArithmeticExceptionProblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numerator, denominator, result;

        try {
            // Get numerator input
            System.out.print("Enter the numerator: ");
            numerator = scanner.nextDouble();

            // Get denominator input
            System.out.print("Enter the denominator: ");
            denominator = scanner.nextDouble();

            // Check if denominator is zero and perform division
            if (denominator == 0) {
                throw new ArithmeticException("Error: Cannot divide by zero.");
            }

            result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());  // Handle division by zero
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");  // Handle invalid input
        } finally {
            scanner.close();  // Always close the scanner
        }
    }
}
