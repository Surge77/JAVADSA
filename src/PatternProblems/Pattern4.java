package PatternProblems;

import java.util.Scanner;
public class Pattern4 {

    public static void main(String[] args) {

//    Printing the following pattern
//   If n = 7 , here any value can be taken whether it be even or odd
//    -------------
//   |     1       |
//   |     12      |
//   |     123     |
//   |     1234    |
//   |     123     |
//   |     12      |
//   |     1       |
//    -------------

//The whole pattern is same as pattern 3 with a slight change
// Instead of printing * we print cst which is count of stars

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt(); //Here keep this value always odd or it wont work

        int trows = n;

        //initialization for the first row
        int stars = 1;

        for (int rows = 1; rows <=trows; rows++){

            //Work for current row
            for (int cst=1; cst<=stars; cst++){ //cst means count of stars
                System.out.print(cst);
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
