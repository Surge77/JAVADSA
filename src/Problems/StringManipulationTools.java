package Problems;

import java.util.Scanner;

//Write a Java program for creating a text manipulation tool that demonstrates
//the use of String, String Buffer, and StringBuilder in Java.

/**
 * 1. String Operations:
     * o Concatenate multiple strings.
     * o Find the length of a string.
     * o Extract a substring.
     * o Convert the string to uppercase and lowercase.
     * o Replace a character in the string.

 * 2. String Buffer Operations:
     * o Append multiple strings.
     * o Insert a string at a specified position.
     * o Reverse the string.
     * o Replace a substring with another string.
     * o Delete a substring.

 * 3. StringBuilder Operations:
     * o Append multiple strings.
     * o Insert a string at a specified position.
     * o Reverse the string.
     * o Replace a substring with another string.
     * o Delete a substring.
 */

public class StringManipulationTools {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // String Operations
        System.out.println("String Operations:");
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Concatenate multiple strings
        System.out.print("Enter a string to concatenate: ");
        String strToConcat = scanner.nextLine();
        String concatenatedString = str.concat(strToConcat);
        System.out.println("Concatenated String: " + concatenatedString);

        // Find the length of a string
        System.out.println("Length of the string: " + str.length());

        // Extract a substring
        System.out.print("Enter start index for substring: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index for substring: ");
        int endIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String substring = str.substring(startIndex, endIndex);
        System.out.println("Substring: " + substring);

        // Convert the string to uppercase and lowercase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // Replace a character in the string
        System.out.print("Enter the character to replace: ");
        char oldChar = scanner.next().charAt(0);
        System.out.print("Enter the replacement character: ");
        char newChar = scanner.next().charAt(0);
        scanner.nextLine(); // Consume newline
        String replacedString = str.replace(oldChar, newChar);
        System.out.println("Replaced String: " + replacedString);

        // StringBuffer Operations
        System.out.println("\nStringBuffer Operations:");
        System.out.print("Enter a string: ");
        StringBuffer stringBuffer = new StringBuffer(scanner.nextLine());

        // Append multiple strings
        System.out.print("Enter a string to append: ");
        stringBuffer.append(scanner.nextLine());
        System.out.println("Appended StringBuffer: " + stringBuffer);

        // Insert a string at a specified position
        System.out.print("Enter a string to insert: ");
        String strToInsert = scanner.nextLine();
        System.out.print("Enter position to insert the string: ");
        int insertPosition = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        stringBuffer.insert(insertPosition, strToInsert);
        System.out.println("StringBuffer after insertion: " + stringBuffer);

        // Reverse the string
        stringBuffer.reverse();
        System.out.println("Reversed StringBuffer: " + stringBuffer);
        stringBuffer.reverse(); // Reverse back to original

        // Replace a substring with another string
        System.out.print("Enter start index for replace: ");
        int replaceStartIndex = scanner.nextInt();
        System.out.print("Enter end index for replace: ");
        int replaceEndIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter string to replace with: ");
        String replaceStr = scanner.nextLine();
        stringBuffer.replace(replaceStartIndex, replaceEndIndex, replaceStr);
        System.out.println("StringBuffer after replace: " + stringBuffer);

        // Delete a substring
        System.out.print("Enter start index for delete: ");
        int deleteStartIndex = scanner.nextInt();
        System.out.print("Enter end index for delete: ");
        int deleteEndIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        stringBuffer.delete(deleteStartIndex, deleteEndIndex);
        System.out.println("StringBuffer after delete: " + stringBuffer);

        // StringBuilder Operations
        System.out.println("\nStringBuilder Operations:");
        System.out.print("Enter a string: ");
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());

        // Append multiple strings
        System.out.print("Enter a string to append: ");
        stringBuilder.append(scanner.nextLine());
        System.out.println("Appended StringBuilder: " + stringBuilder);

        // Insert a string at a specified position
        System.out.print("Enter a string to insert: ");
        strToInsert = scanner.nextLine();
        System.out.print("Enter position to insert the string: ");
        insertPosition = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        stringBuilder.insert(insertPosition, strToInsert);
        System.out.println("StringBuilder after insertion: " + stringBuilder);

        // Reverse the string
        stringBuilder.reverse();
        System.out.println("Reversed StringBuilder: " + stringBuilder);
        stringBuilder.reverse(); // Reverse back to original

        // Replace a substring with another string
        System.out.print("Enter start index for replace: ");
        replaceStartIndex = scanner.nextInt();
        System.out.print("Enter end index for replace: ");
        replaceEndIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter string to replace with: ");
        replaceStr = scanner.nextLine();
        stringBuilder.replace(replaceStartIndex, replaceEndIndex, replaceStr);
        System.out.println("StringBuilder after replace: " + stringBuilder);

        // Delete a substring
        System.out.print("Enter start index for delete: ");
        deleteStartIndex = scanner.nextInt();
        System.out.print("Enter end index for delete: ");
        deleteEndIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        stringBuilder.delete(deleteStartIndex, deleteEndIndex);
        System.out.println("StringBuilder after delete: " + stringBuilder);

        scanner.close();

    }
}
