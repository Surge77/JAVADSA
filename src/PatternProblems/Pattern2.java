package PatternProblems;

import java.util.Scanner;
public class Pattern2 {

    public static void main(String[] args) {

//   Printing the following pattern
//   If n = 5
//    -------------
//   |      *       |
//   |     ***      |
//   |    *****     |
//   |   *******    |
//   |  *********   |
//    --------------
//      Always draw a grid around the pattern so that you can observe the rows and columns for obtaining some kind of relation
//      trows = n i.e the total number of rows is equal to the input i.e n
//      we first need to print spaces first then the stars
//      +2 stars in every row wrt previous row

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt(); //taking input from the user

        int trows = n;

        //initializations for the first row
        int spaces = n - 1; // We are generalizing the formula for the initialization of spaces as well as stars
        int stars = 1; //the initial set of stars for the first row is always 1


        for (int rows = 1; rows <= trows ; rows++){

            //Work for current row

            //spaces
            for (int csp = 1; csp <= spaces; csp++){
                System.out.print(" ");
            }
            //stars
            for (int cst = 1; cst <= stars; cst++){
                System.out.print("*"); // By using print it will print like this ***** without a new line
            }
            //preparing for next row
            System.out.println();
            spaces--; //through observation of pattern we can see the spaces decrease with the row number increasing
            stars+=2; // And also the stars are increased by two with each row
        }








    }
}
