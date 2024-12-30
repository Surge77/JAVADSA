package PatternProblems;

import java.util.Scanner;
public class Pattern1 {

    public static void main(String[] args) {

//        Printing the following pattern
//        If n = 4
//        *
//        **
//        ***
//        ****

        //How to visualize these type of problems
        // Always try to draw a grid for every pattern with row and columns
        //Now to analyze the pattern we need to make some generalizing observations in the pattern
        //If the input = 4 then the rows are also equal to 4
        // First row ==> 1 star
        // Second row ==> 2 star
        // We can say that for every row , no of stars = row number

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt(); //taking input from the user

        //Always give generalizing variable names
        int trows = n; //trows means total rows and is equal to the input given by user

        for (int rows = 1; rows <= trows ; rows++){ //loop for printing the rows

            //work for current row
            for (int cst = 1 ; cst<= rows; cst++ ){ //here cst means count of stars
                System.out.print("*"); //here we used print instead of println so that it doesnt print the new line while printing the row
                //this loop will run until a whole row is printed according to the pattern where stars = row number

            }
            //prepare for next row
            System.out.println(); //space after printing a complete one row
        }



    }
}
