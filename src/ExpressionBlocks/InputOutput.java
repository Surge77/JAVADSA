package ExpressionBlocks;

import java.util.Scanner; //this is a class we need to include in order to take input
public class InputOutput {

    public static void main(String[] args) {

        int value = 10;

        System.out.println("The value is "+ value); //for printing value we have to compulsory add + between statements

        //now we will see how to take inputs in java

        //created a object of scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value "); //we used print instead of println so that it doesnt skip next line
        //takes input from the user
        int number = input.nextInt();

        System.out.println("You entered "+ number);

        //inputs for different data types
        float myfloat = input.nextFloat();

        double mydouble = input.nextDouble();

        long mylong = input.nextLong();

        byte mybyte = input.nextByte();

        String mystring = input.nextLine();
        String my_string = input.next();

        //next() -> read a word from the user
        //nextLine -> read a line from the user

    }
}
