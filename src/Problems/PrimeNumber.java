package Problems;

import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {

        //To check whether a number is prime and print it
        //a prime no is a number divisible only by 1 and itself
        // we can also say that it is not divisible from the number between 2 to n-1

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scn.nextInt(); //taking input from the user

        int div = 2;

        int flag = 0; // just to flip the condition when using while loop

        while (div <= n-1){

            if (n %  div == 0){
                flag = 1; //if the number gets divided then it is not prime and we toggle the flag
                //the flag value tells us why we came out of the loop
                break; //to break the loop after this flag is toggled
            }
            div += 1;
        }

        if (flag == 1){
            System.out.println("NOT PRIME");
        }else{
            System.out.println("PRIME");
        }



    }
}
