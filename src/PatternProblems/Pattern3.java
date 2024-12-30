package PatternProblems;

import java.util.Scanner;
public class Pattern3 {

    public static void main(String[] args) {

//    Printing the following pattern
//   If n = 7 or any odd number can be taken
//    -------------
//   |     *       |
//   |     **      |
//   |     ***     |
//   |     ****    |
//   |     ***     |
//   |     **      |
//   |     *       |
//    -------------

// First draw a grid for analyzing columns and rows
//Here the input will always be a odd number as even number pattern wont make any sense
// Generalized observations from the pattern
// 1. trows n i.e total number of rows = input n
// 2. Here we just have to print stars in each row
// 3. first row = 1 star
// 4. second row = 2 star which is plus one from previous and so on... till halfway
// 5. After halfway the stars get reduced each by -1 as so on... till we print the last single star

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt(); //Here keep this value always odd or it wont work

        int trows = n;

        //initialization for the first row
        int stars = 1;

        for (int rows = 1; rows <=trows; rows++){

            //Work for current row
            for (int cst=1; cst<=stars; cst++){ //cst means count of stars
                System.out.print("*");
            }
            //prepare for next row
            System.out.println(); //this will print new line after printing one row
            if (rows <= trows / 2){ //this condition will check our 5th observation written above i.e when should add one or subtract one
                stars++;
            }else{
                stars--;
            }

        }



    }
}
