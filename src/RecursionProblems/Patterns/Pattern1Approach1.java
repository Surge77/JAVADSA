package RecursionProblems.Patterns;

public class Pattern1Approach1 {

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

        PrintPatternForGivenRow(totalstars); //Call this function to print the stars for given row
        RecursiveFunc(n-1,totalstars);
    }

    private static void PrintPatternForGivenRow(int n) {

        for (int i=0 ; i<n; i++){
            System.out.print("*"); //Print n stars
            //Be sure to use print here not println
        }
        System.out.println(); //Prints a new line
    }
    //Here we are still using for loop to print the pattern but we want an end to end recursive solution for that i can do:
    //We can have two recursive functions
    //One recursive function will print stars for a given row
    //Second recursive function will call the first function n times to print n rows
    //See this approach applied in pattern1approach2
}
