package Academic.Two;
import java.util.*;

/**
 * Develop a program to validate the age of a person. If the age is less
 * than 18, throw a custom exception called AgeValidationException.
 * Handle the exception to display an appropriate message indicating
 * the age is not valid for voting.
 */

class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}

public class CustomException {

    public static void main(String[] args) {

        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter their age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Validate the age
            validateAgeForVoting(age);

            // If age is valid, print a success message
            System.out.println("You are eligible to vote.");

        } catch (AgeValidationException e) {
            // Handle custom exception for invalid age
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Handle other types of exceptions like invalid input
            System.out.println("Error: Please enter a valid integer for age.");
        } finally {
            scanner.close();  // Close the scanner resource
        }
    }

    // Method to validate the age
    public static void validateAgeForVoting(int age) throws AgeValidationException {
        if (age < 18) {
            // Throw custom exception if age is less than 18
            throw new AgeValidationException("Age not valid for voting. You must be 18 or older to vote.");
        }
    }


    }

