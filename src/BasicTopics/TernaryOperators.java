package BasicTopics;

import java.util.Scanner;
public class TernaryOperators {

    public static void main(String[] args) {

        //Replace if else condition in certain situations

        //Evaluates the test condition and executes a block of code based on the result of the condition

        //Syntax : condition ? exp1 : exp2 ;  => if the condition is true either exp1 will be executed or exp2
        //The ternary operator takes three operands i.e condition,exp1,exp2

        int marks = 75;

        String result = (marks > 70) ? "pass" : "Fail"; //use this only when the expressions are short instead of if else statements
        // using this makes the code more readable and clean

        System.out.println(result);


    }
}
