package Problems;


import java.util.Scanner;
public class Evenodd {

    public static void main(String[] args) {

        //To take a integer input from user and check whether it is even or odd and print it

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        //WE also can take input this way

//        Scanner scn = new Scanner(System.in);
//
//        System.out.println("Enter a number: ");
//        int num = scn.nextInt();

        if (num%2 == 0 ){
            System.out.println("It is a even number");

        }else {
            System.out.println("It is a odd number");
        }
    }
}
