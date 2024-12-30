package Academic.Two;
import java.util.*;

/**
 *Create a Java program that initializes an array with 5 elements.
 * Write a method to access and print an element based on a user-
 * provided index. Handle the ArrayIndexOutOfBoundsException
 * when the user enters an index outside the valid range.
 */

public class ArrayOutOfBounds {

    public static void main(String[] args) {

        // Initialize an array with 5 elements
        int[] array = {10, 20, 30, 40, 50};

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter an index
            System.out.print("Enter an index to access (0-4): ");
            int index = scanner.nextInt();

            // Call method to access and print the array element
            printElementAtIndex(array, index);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please enter a valid index between 0 and 4.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter an integer value.");
        } finally {
            scanner.close(); // Ensure the scanner is closed
        }
    }

    // Method to print the element at the given index
    public static void printElementAtIndex(int[] array, int index) {
        System.out.println("Element at index " + index + ": " + array[index]);
    }
}


