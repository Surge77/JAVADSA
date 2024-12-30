package Problems;

import java.util.Scanner;
public class FibonacciNumber {

    public static void main(String[] args) {

        //Given an n integer value, you need to find the nth fibonacci number
        //this question deal three with problems at once
        //prints till nth fibonacci numbers
        //prints first n fibonacci numbers
        //print the nth fibonacci number

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = input.nextInt();

        int a = 0;
        int b = 1;

        int count = 1;

        while (count <= num + 1){

            System.out.println(a);

            int sum = a + b;

            a = b;
            b = sum;

            count += 1;
        }


    }
}
