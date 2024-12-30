package PatternProblems;

import java.util.Scanner;
public class Pattern5 {

    public static void main(String[] args) {

//    Printing the following pattern
//   If n = 7 or any odd number can be taken
//         *
//        ***
//       *****
//      *******
//       *****
//        ***
//         *

//Always make a grid to analyze the pattern this is very imp that is why i keep repeating
//Observations in above pattern
// trows = n i.e total rows is equal to the input given
// We need to first print spaces ==> then stars
// First half of the pattern :
//===>  spaces can be generalized by formula n/2 and always one star in first row number of spaces keep decreasing by 1 and stars keep increasing by 2
// Second half of the pattern:
//===> after the half the spaces keep increasing by 1 and the stars keep decreasing by 2

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt(); //taking input from the user

        int trows = n;

        //initializations for the first row
        int stars = 1;
        int spaces = n/2;

        for (int rows = 1; rows<=trows; rows++){

            //work for the current row

            //spaces
            for (int csp= 1; csp<=spaces; csp++){ //csp ==> count of spaces
                System.out.print(" ");
            }

            //stars
            for (int cst = 1; cst<=stars; cst++){ // cst ==> count of stars
                System.out.print("*");
            }

            //prep for next row
            System.out.println(); // next line print after one complete row is printed
            if (rows <= trows/2){
                spaces--; //condition for first half of the pattern
                stars+= 2;
            }else{
                spaces++;  //condition for second half of the pattern
                stars-= 2;
            }
        }




    }
}
