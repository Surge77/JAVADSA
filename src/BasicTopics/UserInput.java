package BasicTopics;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        //Java provides different ways to get input from the user
        //Scanner class

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt(); // Reads an integer
        System.out.println("You entered: " + num);
        input.nextLine(); // Consumes the leftover newline

        System.out.print("Enter a string: ");
        String str = input.nextLine(); // Reads an entire line
        System.out.println("You entered: " + str);

        System.out.print("Enter another string: ");
        String str2 = input.next(); // Reads a word (up to the next space)
        System.out.println("You entered: " + str2);



        input.close(); //It is recommended to close the scanner object once the input has been taken

    }
}
