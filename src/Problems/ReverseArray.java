package Problems;

import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {

    public static void main(String[] args) {

        //In this method we swap the first element and the last element and then the second element with last second and so on..

        int[] arr = {10,20,30,40,50};

        System.out.println(arr.length);

        display(arr);
//      System.out.println(Arrays.toString(arr)); //alternative method for printing array
        reverse(arr);
        display(arr);

    }

    public static void display(int[] arr){

        for (int i= 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void reverse(int[] arr){

        int i = 0;
        int j = arr.length - 1;

        while (i <= j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i ++;
            j--;

        }
    }

}
