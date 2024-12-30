package Academic.Final.Array_String_operations;
import java.util.*;

/***
 * Write a java program to create object of StringBuffer class and apply
 * following methods of StringBuffer class. Display result after every method.
 * capacity(), append(String str), charAt(int index), deleteCharAt(int index)
 * indexOf(String str),insert(int offset, String str),length(),replace(int start,
 * int end,String str), reverse()
 */

public class StringBuffer_operations {

    public static void main(String[] args) {

        // Create a StringBuffer object with an initial string
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Display initial content
        System.out.println("Initial StringBuffer: " + stringBuffer);

        // 1. capacity()
        //The capacity is the amount of storage available for newly inserted characters, beyond which an allocation will occur.
        System.out.println("Capacity: " + stringBuffer.capacity());

        // 2. append(String str)
        stringBuffer.append(" World");
        System.out.println("After append: " + stringBuffer);

        // 3. charAt(int index)
        char charAtIndex = stringBuffer.charAt(6); // 'W'
        System.out.println("Character at index 6: " + charAtIndex);

        // 4. deleteCharAt(int index)
        stringBuffer.deleteCharAt(5); // Removes the space before 'W'
        System.out.println("After deleting character at index 5: " + stringBuffer);

        // 5. indexOf(String str)
        int indexOfWorld = stringBuffer.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);

        // 6. insert(int offset, String str)
        stringBuffer.insert(5, " Beautiful");
        System.out.println("After inserting ' Beautiful' at index 5: " + stringBuffer);

        // 7. length()
        System.out.println("Length of StringBuffer: " + stringBuffer.length());

        // 8. replace(int start, int end, String str)
        stringBuffer.replace(6, 16, "Amazing");
        System.out.println("After replacing from index 6 to 16 with 'Amazing': " + stringBuffer);

        // 9. reverse()
        stringBuffer.reverse();
        System.out.println("After reversing: " + stringBuffer);
    }
}
