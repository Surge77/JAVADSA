package Queue.Problems;
import java.util.*;

/***
 * create a hashmap to check the uniqueness of the element i.e create a hashmap with character and its frequency
 *  *
 *  * we maintain a queue
 *  *
 *  * at the head of the queue maintain and keep the char which is first and non-repeating so we can fetch it in O(1)
 *  *
 *  * if the head id repeating pop it off
 *  *
 *  * In queue we only keep unique elements at the head and following all the elements are the candidates to become the next unique element
 *  * After every repeating character  occurs we update the frequency in Hashmap
 *
 */


public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        String input = "avaccc"; // Example input
        findFirstNonRepeatingCharacter(input);
    }

    private static void findFirstNonRepeatingCharacter(String stream) {
        // HashMap to track the frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();
        // Queue to track the order of non-repeating candidates
        Queue<Character> queue = new LinkedList<>();

        StringBuilder output = new StringBuilder(); // To store the output

        // Iterate through each character in the input stream
        for (char c : stream.toCharArray()) {
            // Increment the character count in the HashMap
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);

            // Add character to queue if seen for the first time (i.e., frequency is 1)
            if (charCount.get(c) == 1) {
                queue.add(c);
            }

            // If the character at the head of the queue is now repeating, pop it
            while (!queue.isEmpty() && charCount.get(queue.peek()) > 1) {
                queue.poll();
            }

            // Append the first non-repeating character from the queue
            if (queue.isEmpty()) {
                output.append("-1"); // No non-repeating character, append -1
            } else {
                output.append(queue.peek()); // First non-repeating character
            }
        }

        // Print the result
        System.out.println("Output: " + output.toString());
    }
}

