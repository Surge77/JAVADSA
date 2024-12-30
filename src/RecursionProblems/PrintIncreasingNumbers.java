package RecursionProblems;

public class PrintIncreasingNumbers {

    public static void f(int n){

        //Base case
        if (n == 0) return; //Do nothing as zero is not a natural number

        f(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {

        f(5);



    }
}
