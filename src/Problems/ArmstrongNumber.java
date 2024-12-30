package Problems;

import java.util.Scanner;
public class ArmstrongNumber {

    public static void main(String[] args) {

        //A positive number is called an armstrong number if
        //abc = a^n +b^n + c^n ==>where n is the total number of terms in this case which is 3 in abc

        //153 = 1^3 + 5^3 + 3^3 = 153
        //1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1634

        //Given an input integer it should print true/false if the number is armstrong number or not
        //153 => true
        //570 => false
        //1634 => true

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a integer: ");
        int result = input.nextInt();
        System.out.println(isarmstrong(result));
//      System.out.print(PrintArmstrongNumbers(100,500));

        //now if we want to print armstrong number between a given range we need to put it in a for loop


    }

//    public static boolean PrintArmstrongNumbers(int lo, int high){
//
//        for (int n= lo; n<= high; n++){
//
//            boolean res = isarmstrong(n);
//            if (res){
//                System.out.println(n);
//            }
//        }
//        return false;
//    }

    public static boolean isarmstrong(int n){


        int nod = countDigits(n); // 4 //nod => number of digits
        int on = n; //on =>original number //1634
        int sum = 0;

        while (n >0){
            int rem = n % 10;
            sum += Math.pow(rem,nod); // 1^ 4
            n = n/10;
        }

//        if (sum == on){
//            return true;
//        }else {
//            return false;
//        }

        return sum==on; //if sum is equal to original number then it is a armstrong number

    }

    public static int countDigits(int n){

        int nod = 0;

        while (n > 0){ // till the number does not become 10
            n = n / 10;
            nod++;
        }
        return nod;
    }
}
