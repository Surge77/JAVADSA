package BasicTopics;

import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Reverse the sentence using StringBuffer
        StringBuffer stringBuffer = new StringBuffer(sentence);
        String reversedWithBuffer = stringBuffer.reverse().toString();
        System.out.println("Reversed sentence using StringBuffer: " + reversedWithBuffer);

        // Reverse the sentence using StringBuilder
        StringBuilder stringBuilder = new StringBuilder(sentence);
        String reversedWithBuilder = stringBuilder.reverse().toString();
        System.out.println("Reversed sentence using StringBuilder: " + reversedWithBuilder);

        // Close the scanner
        scanner.close();
    }
}
