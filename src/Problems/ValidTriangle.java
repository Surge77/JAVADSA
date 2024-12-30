package Problems;


import java.util.Scanner;
public class ValidTriangle {

    public static void main(String[] args) {

        //Given the 3 angles of a triangle. You need to check whether a valid triangle can be formed from those 3 angles.As we know sum of angles in a triangle is 180deg
        // and every angle must be greater than 0 for eg: 90 0 90 are the three sides it makes 180deg but is not a valid triangle because of 0
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the three angles of triangle: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;

        if (sum == 180 && num1> 0 && num2>0 && num3 > 0){

            System.out.println("It is a valid Triangle");

        }else {
            System.out.println("It is a invalid Triangle");
        }


    }
}
