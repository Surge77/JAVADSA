package Hashmaps.Problems;
import Hashmaps.HashmapImplementation;

import java.util.*;

//Given a input string, Find out and print the character with maximum frequency
//For ex: "aabcddcbbbff" -> output -> b
//We use hashmap to store the key as character and freq as value.
//We iterate through the string and keep update the character frequency.
//Then after that we iterate over the hashmap and pick the key with maximum value

public class MaxFreqChar {

    public static void main(String[] args) {
        // Testing the maxFreqChar method with a sample string
        System.out.println(maxFreqChar("aabcddebbbbf"));
    }

    private static char maxFreqChar(String str) {
        // Creating a HashMap to store characters and their respective frequencies
        HashMap<Character, Integer> map = new HashMap<>();

        // Loop through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character

            // Check if the character is already in the HashMap
            if (map.containsKey(ch)) {
                int oldFreq = map.get(ch); // Retrieve the old frequency
                int newFreq = oldFreq + 1; // Increase the frequency by 1
                map.put(ch, newFreq); // Update the frequency in the map
            } else {
                map.put(ch, 1); // Insert the character with an initial frequency of 1
            }
        }

        // Print the map to see character frequencies (for debugging)
        System.out.println(map);

        // Create a list of all unique characters from the map's keySet that is stores the key from the hashmap
        ArrayList<Character> list = new ArrayList<>(map.keySet());

        // Initialize variables to track the character with maximum frequency
        char maxChar = ' '; // Holds the character with the highest frequency
        int maxFreq = 0;    // Holds the highest frequency encountered

        // Loop through each character in the list to find the max frequency character
        //The map.get() is used to fetch the freq of each char from map hashmap
        for (char ch : list) {
            // If the current character's frequency is greater than maxFreq, update maxFreq and maxChar
            if (map.get(ch) > maxFreq) {
                maxFreq = map.get(ch);
                maxChar = ch;
            }
        }

        // Return the character with the highest frequency
        return maxChar;
    }
}