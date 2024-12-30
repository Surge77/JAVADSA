package RecursionProblems;

public class PrintingArray {

    //Printing array using recursion
    //Whenever we have arrays and recursion in the problem we need to follow a particular pattern to solve the problem
    //Which is in the form f(arr,idx) in this function arr is array and idx is the index

    public static void ArrayPrint(int[] arr, int idx){ //Function prints everything from idx -> n

        //Base case
        if (idx >= arr.length) return; //Everything is printed don't do anything

        System.out.println(arr[idx]); //self work

        ArrayPrint(arr,idx+1); //Recursive assumption / delegation
    }

    public static void main(String[] args) {

        int[] arr = {21, 43 ,23 ,65, 10,224};

        ArrayPrint(arr,0); //0 because we want to print everything from 0 -> n-1


    }
}
