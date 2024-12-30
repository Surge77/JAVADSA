package Problems;

import java.util.Scanner;
public class LargestOfThree {

    public static void main(String[] args) {

        //Input three integers and find the greatest of them

        Scanner scn  = new Scanner(System.in);

        System.out.println("Enter the three integers: ");

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println(num1 + " is greatest");
        } else if ((num2 > num3) && (num2 > num1)) {
            System.out.println(num2 + " is greatest");
        } else {
            System.out.println(num3 + " is greatest");
        }
    }
}
