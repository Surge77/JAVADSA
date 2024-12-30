package Academic.Final.Exception_Handling;
import java.util.*;

/**
 * Problem Statement: Create a class MultipleExceptions.java. Add the main
 * method in which first accept two numbers from user using Scanner class
 * and print division of two numbers. Further, declare an array of size 5
 * arr={10,20,30,40,50}
 * 1. If user entered 20 and 0 then “We can’t divide any number by 0” message
 * should display.
 * 2. Print element at index 5 or more than 5 then “You are trying to
 * access index out of range of given array” message should display.
 */

public class MultipleExceptions {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);


        //Handling division by zero
        try{
            System.out.print("Enter numerator: ");
            int n1 = inp.nextInt();

            System.out.print("Enter denominator: ");
            int n2 = inp.nextInt();

            double div = n1/n2;
            System.out.println("Division of two numbers is: "+ div);

        }catch(ArithmeticException e){
            System.out.println("Division by zero not possible");
        }

        try{
            int[] arr={10,20,30,40,50};

            System.out.print("Enter the index of which value you want: ");
            int index = inp.nextInt();

            System.out.println("Value of index "+ index + " : " + arr[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Index out of bounds");
        }

        inp.close();


    }
}
