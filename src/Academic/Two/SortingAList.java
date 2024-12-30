package Academic.Two;
import java.util.*;

/**
 * Create a Java program that adds a series of String values to a List.
 * Use the Collections.sort() method to sort the list in alphabetical
 * order. Then, sort it in reverse order using
 * Collections.reverseOrder().
 */

public class SortingAList {

    public static void main(String[] args) {

        // Create a List to store String values
        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding a series of String values to the list
        System.out.println("Enter 5 strings to add to the list:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            String input = scanner.nextLine();
            stringList.add(input);
        }

        // Display the original list
        System.out.println("Original list: " + stringList);

        // Sort the list in alphabetical order (natural order)
        Collections.sort(stringList);
        System.out.println("List sorted in alphabetical order: " + stringList);

        // Sort the list in reverse alphabetical order
        Collections.sort(stringList, Collections.reverseOrder());
        System.out.println("List sorted in reverse alphabetical order: " + stringList);

        scanner.close();
    }
}



