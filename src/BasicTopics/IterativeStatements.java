package BasicTopics;

import java.util.Scanner;
public class IterativeStatements {

    public static void main(String[] args) {

        //You have to print numbers from 1-10
        //Loops are called iterative statements to repeat a particular block of code

        //In java there are three types of loops
        //--for loop => is used to run a block of code for a certain number of times
        //while loop => used when number of iterations is unknown
        //do while loop => executed once before the test case is checked

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a number: ");
//        int user_inp = input.nextInt();
//        for (int i=1 ; i<=user_inp ; i++){
//
//            System.out.println(i);
//        }
        //printing numbes from 15 to 25

        int n = 15;

        for (int i = 15 ; i <= n ; i++){

            System.out.println(i);
        }
    }
}
