package Problems;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class AddTwoArrays {

    public static void main(String[] args) {

        //we need to add two arrays
        // arr1 = [ 9 9 ]
        // arr2 = [9 9 9]
        //output = [ 1098 ]

        //--Way to think about it
        //Since the size of the output array is not fixed so we store it in arraylist
        //We know that elements always starts to get added from ones digit then tenth digit,hundredth and so on
        //we need two variables i and j which will point at end of two arrays
        //we need a carry variable which will contain the carry value when there is double digit
        //create a answer arraylist
        //We need a sum variable to sum the two digits from the two arrays
        //if sum is double digit for ex: 13 to get the output 3 we do 13%10 => 3 and for getting carry value 1 we do 13/10 => 1
        //And after this we update the carry value
        //After this we decrement i and j and add the elements with carry
        //At last after adding all the elements we do not stop as it is
        //We need a condition to check whether their is any carry or not
        //If carry is not zero then add it to arraylist

        int[] one = {9,9};
        int[] two = {9,9,9};

        System.out.println(SumofTwoArrays(one,two));

    }

    public static ArrayList<Integer> SumofTwoArrays(int[] one, int[] two) {

        ArrayList<Integer> ans = new ArrayList<>(); //new arraylist for storing the sum

        int carry = 0;

        int i = one.length - 1;
        int j = two.length - 1;

        while (i >=0 || j >=0) {

            int sum = 0;

            if (i >= 0) {
                sum += one[i];
            }

            if (j >= 0) {
                sum += two[j];
            }

            sum += carry;

            int rem = sum % 10; //gives the value of remainder when modulo 10
            carry = sum / 10;  // gives the carry values when divided by 10

            ans.add(0, rem); //we always add the remainder at the first position
            i--;
            j--;

        }

        if (carry != 0){ //if a carry remains at the end it will add it to the first position in arraylist
                ans.add(0,carry);
            }


        return ans;

    }
}
