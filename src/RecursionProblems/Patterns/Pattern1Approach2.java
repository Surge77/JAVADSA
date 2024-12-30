package RecursionProblems.Patterns;

public class Pattern1Approach2 {

    public static void main(String[] args) {
        //Given a number n, print the following pattern for a value of n
        //If n = 3 the pattern should be
        //    * * *
        //    * * *
        //    * * *
        //here the number of row and columns and the stars are equal to n
        //We have to solve this problem recursively

        RecursiveFunc(4,4);

    }

    private static void RecursiveFunc(int n,int totalstars) {

        //base case
        if (n <= 0) return;

        Recursivefunc2(totalstars); //Call this function to print the stars for given row
        //at this point we have n stars printed in a row/line
        //so let's go to the new line
        System.out.println();
        RecursiveFunc(n-1,totalstars);
    }

    private static void Recursivefunc2(int n) {

       if (n <= 0) return;
       Recursivefunc2(n-1);
    }
}

