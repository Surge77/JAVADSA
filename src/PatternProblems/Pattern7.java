package PatternProblems;

import java.util.Scanner;
public class Pattern7 {

    public static void main(String[] args) {

//    Print the butterfly pattern
//   If n = 7 or any odd number can be taken
//    -----------------
//   |     *       *     |
//   |     **     **     |
//   |     ***   ***     |
//   |     **** ****     |
//   |     ***   ***     |
//   |     **     **     |
//   |     *       *     |
//     ----------------

//Observations for this pattern
//Always draw a grid to analyze rows and columns
//trows = n i.e total rows = input number the number should always be odd
//we need to print stars ==> spaces ==> stars
//In first row stars = 1 and spaces = n-2
//This pattern can be divided in two parts
//First half ==> Stars increased by 1 and spaces decreased by 2
//Second half ==> stars decreased by 1 and spaces increased by 2

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt(); //taking input from the user

        //initializations for the first row
        int trows = n;
        int stars = 1;
        int spaces = n - 2;

        for (int rows=1; rows<= trows; rows++){

            //work for current row

            //stars
            for (int cst= 1; cst<=stars; cst++){
                System.out.print("*"); //always use print instead of println
            }
            //spaces
            for (int csp=1; csp<=spaces; csp++){
                System.out.print(" ");
            }
            //stars
            //this condition will only change the right side of the pattern
            int sstars = stars; //here sstars means second stars
            if (rows == trows /2 + 1){ // this loop will eliminate the extra star being printed in the middle row
                sstars = stars - 1; //we just print one less star
            }
            for (int cst= 1; cst<=sstars; cst++){ // here we also changed stars to sstars
                System.out.print("*"); //always use print instead of println
            }

            //prep for next row
            System.out.println();//prints a new line
            if (rows <= trows/2){
                stars++;
                spaces -=2;
            }else{
                stars--;
                spaces+=2;

                //There is a extra star printed in middle row when we enter 5 as input
            }

        }

    }
}
