package Problems;

import java.util.Scanner;

/**
 * => Develop a program to manage student scores for a class of students. The
      program should be able to perform the following operations:
     * 1. Input Scores: Allow the user to input scores for a predetermined number of
     * students.
     * 2. Display Scores: Print all the scores entered.
     * 3. Calculate Average: Calculate and display the average score.
     * 4. Find Highest and Lowest Scores: Determine and display the highest and
     * lowest scores from the input.
     * 5. Search for a Score: Allow the user to search for a specific score and display
     * whether it is present in the list.
 */

public class StudentScore_Manager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int numberOfStudents = 10;
        int[] scores = new int[numberOfStudents];

        // Input Scores
        System.out.println("Input the scores for 10 students:");
        for (int i = 0; i < numberOfStudents; i++) {
            while (true) {
                System.out.print("Enter score for student " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    scores[i] = scanner.nextInt();
                    if (scores[i] >= 0 && scores[i] <= 100) {
                        break;
                    } else {
                        System.out.println("Invalid input. Score must be between 0 and 100.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // Clear invalid input
                }
            }
        }

        // Display Scores
        System.out.print("Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        // Calculate Average
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = (double) sum / numberOfStudents;
        System.out.printf("Average Score: %.2f%n", average);

        // Find Highest and Lowest Scores
        int highest = scores[0];
        int lowest = scores[0];
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        // Search for a Score
        System.out.print("Enter a score to search: ");
        int targetScore = scanner.nextInt();
        boolean found = false;
        for (int score : scores) {
            if (score == targetScore) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Score " + targetScore + " is present in the list.");
        } else {
            System.out.println("Score " + targetScore + " is not present in the list.");
        }

        scanner.close();
    }
}
