package RecursionProblems;

public class PrintDecreasingNumbers {

    public static void f(int n){

        //Base case
        if (n == 0) return; //do nothing a zero is not a natural number

        System.out.println(n);
        f(n - 1);
    }

    public static void main(String[] args) {

        f(3);


    }
}
