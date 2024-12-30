package RecursionProblems.Patterns;

public class Pattern3 {

    public static void main(String[] args) {

        //Given a number n, print the following pattern for a value of n
        //If n = 4 the pattern should be
        //    * * * *
        //    * * *
        //    * *
        //    *
        //We have to solve this problem recursively

        //Now let's see a more optimised solution for the above pattern than previous two solutions
        //We know that Recursive function 2 prints stars in a row (works on the columns of the row)
        //Recursive function 1 prints for each row (goes to each row)
        //The same is true about iterative approach while using for loops
        //So how about we combine the two functions together
        //So let's keep three parameters for our recursive function
        //row -> current row
        //col -> column in the current row
        //n -> total expected rows


        RecursiveFunc(1,1,4);

    }

    private static void RecursiveFunc(int row,int col,int n) {
        /*
         * THis function prints pattern starting from given row and col to nth row and nth col
         */

        if (row > n) return; // all rows are printed
        //This below block controls the printing of the columns
        //For the above pattern the relation would be n - r + 1
        if (col > n - row + 1) { //everything is printed in the current row
            System.out.println(); //Prints a newline before going to next row
            RecursiveFunc(row+1,1,n);
            return;
        }
        System.out.print("*");
        RecursiveFunc(row,col+1,n); //move to next col


    }
    }

