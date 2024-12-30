package Academic.Final.Exception_Handling;
import java.util.*;

/**
 *
 */

public class ArithmeticOperation {

    // Method to perform division
    public static int divide(int numerator, int denominator) {
        return numerator / denominator; // This may throw ArithmeticException
    }

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 0;

        try {
            // Invoking the divide method
            int result = divide(num1, num2);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handling division by zero
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}