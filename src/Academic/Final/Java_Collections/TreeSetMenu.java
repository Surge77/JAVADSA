package Academic.Final.Java_Collections;

import java.util.TreeSet;
import java.util.Scanner;

/**
 * Write a menu-driven Java program to make use of TreeSet to do following
 * operations.
 * 1. Add item
 * 2. Remove item
 * 3. Display
 * 4. Exit
 *
 * TreeSet is a class in the Java Collections Framework that implements the Set interface.
 * It is part of the java.util package and extends the AbstractSet class.
 * Unlike HashSet, which stores elements in an unordered manner, TreeSet stores elements in sorted order,
 * following the natural ordering or a custom comparator provided during its creation.
 *
 * Use TreeSet when you need:
 * Sorted elements in natural or custom order.
 * Efficient range queries (e.g., subsets).
 * Methods like first, last, ceiling, and floor.
 */

public class TreeSetMenu {
    public static void main(String[] args) {
        // Create a TreeSet to store items
        TreeSet<String> itemSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the TreeSet Manager!");
        System.out.println("Choose an operation:");
        System.out.println("1. Add item");
        System.out.println("2. Remove item");
        System.out.println("3. Display items");
        System.out.println("4. Exit");

        // Loop until the user decides to exit
        while (true) {
            System.out.print("Enter your choice (1-4): ");
            command = scanner.nextLine();

            switch (command) {
                case "1": // Add item
                    System.out.print("Enter item to add: ");
                    String itemToAdd = scanner.nextLine();
                    if (itemSet.add(itemToAdd)) {
                        System.out.println("Item added: " + itemToAdd);
                    } else {
                        System.out.println("Item already exists: " + itemToAdd);
                    }
                    break;

                case "2": // Remove item
                    System.out.print("Enter item to remove: ");
                    String itemToRemove = scanner.nextLine();
                    if (itemSet.remove(itemToRemove)) {
                        System.out.println("Item removed: " + itemToRemove);
                    } else {
                        System.out.println("Item not found: " + itemToRemove);
                    }
                    break;

                case "3": // Display items
                    System.out.println("Current items in the TreeSet: " + itemSet);
                    break;

                case "4": // Exit
                    System.out.println("Exiting the TreeSet Manager. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        }
    }
}