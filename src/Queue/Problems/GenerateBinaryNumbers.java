package Queue.Problems;
import java.util.*;

/***
 * Problem : Given a number N write a program that generated and prints all the binary numbers
 * with decimal values from 1 -> N.
 *
 * Eg : n = 2;
 * Output : 1, 10 -> 1 is binary for 1 and 10 is binary for 2
 *
 * Eg : n = 5
 * output : 1, 10, 11, 100, 101
 *          1   2   3   4   5
 *
 * One simple approach is to run a loop from 1 to N and create a decimal to binary method,what this method will do is convert decimal to binary value
 *
 * In order to do something better we need to use Queues.
 * We need a queue of strings
 * In every iteration we will dequeue a element from the front in queue as we know queue is a a FIFO data structure
 * We add from the last and remove from the front
 *
 *
 */

public class GenerateBinaryNumbers {

    public static void main(String[] args) {

        int n = 20;

        generateBinary(n);

    }

    private static void generateBinary(int n) {


        //LinkedList is used to implement the queue interface.
        Queue<String> q = new LinkedList<>();

        //The add() method inserts the element at the end of queue
        //The remove() method retrieves and removes the head of the queue
        q.add("1"); // Start with the string "1"

        while(n-- > 0){

            String s1 = q.remove(); // Remove the first string (e.g., "1")
            System.out.println(s1); // Print the string (prints "1")

            // Generate new binary numbers as strings
            q.add(s1 + "0"); // "1" + "0" = "10"
            q.add(s1 + "1"); // "1" + "1" = "11"

        }
    }
}
