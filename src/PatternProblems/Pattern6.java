package PatternProblems;

import java.util.Scanner;
public class Pattern6 {

    public static void main(String[] args) {

//    Printing the following pattern

//   If input = 4 it should print the following pattern
//        *******
//        *** ***  |
//        **   **  | ==> from the second row itself we start to follow the pattern of stars => spaces =>  stars
//        *     *  |

//If input = 3 should print the following pattern
//        *****
//        ** **
//        *   *

//Observations from the above patterns:
// trows = n i.e total rows in pattern is equal to the input number
// we need to print first stars ==> the spaces ==> then again stars
// stars-- ==> spaces+2 ==> stars--
//The generalized formula for the first row in both the patterns is (2n - 1)
// In questions like this there will always be one outlier row which we need to print separately in this case it was row 1


        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt(); //taking input from the user

        //frow ==> front row which is a outlier row
        //frow can generalized as 2*n-1
        for (int frow = 1; frow<= 2*n-1; frow++){

            System.out.print("*");
        }
        System.out.println(" ");

        //The remaining process remains same for this pattern
        //Now this is the initialization for second row
        int trows = n-1;
        int spaces = 1;
        int stars = n - 1;

        for (int rows = 1; rows<= trows ; rows++){

            //work for the current row

            //stars
            for (int cst= 1; cst<=stars; cst++){ //cst => count of stars
                System.out.print("*");
            }
            //spaces
            for (int csp= 1; csp<=spaces; csp++){ //csp => count of spaces
                System.out.print(" ");
            }
            //stars
            for (int cst= 1; cst<=stars; cst++) { //cst => count of stars
                System.out.print("*");

            }
            //prep for next row
            System.out.println();
            stars--;
            spaces +=2;


        }





    }
}
