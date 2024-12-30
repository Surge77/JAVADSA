package Academic.Final.Exception_Handling;
import java.util.*;

/***
 * Create a class TryMathCube.java which defines a method “cube”. This method should take an integer value as an argument and return the cube of that number as a result.
 * Add the main method and invoke the cube method by passing the command line argument as the parameter.
 * a) Pass “One” as a command-line argument and handle the Exception thrown by the main() method.
 * b) Wrap the call to the cube() inside try-catch block and handle the NumberFormatException which is thrown when an invalid integer value is provided in the command-line argument.
 *
 * This program is meant to be run on terminal
 * Compile the program: javac TryMathCube.java
 * Run the program with valid integer argument : java TryMathCube.java 3
 * Output : The cube of 3 is: 27
 */

public class TryMathCube {

    // Method to calculate the cube of an integer
    public static int cube(int number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        // Check if an argument is provided
        if (args.length == 0) {
            System.out.println("Please provide an integer as a command-line argument.");
            return;
        }

        try {
            // Attempt to parse the command-line argument as an integer
            int number = Integer.parseInt(args[0]);
            // Call the cube method and display the result
            int result = cube(number);
            System.out.println("The cube of " + number + " is: " + result);
        } catch (NumberFormatException e) {
            // Handle the case where the argument is not a valid integer
            System.out.println("Invalid input: '" + args[0] + "' is not a valid integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the case where no command-line argument is provided
            System.out.println("No command-line argument provided.");
        }
    }
}