package Problems;

import java.util.Scanner;
public class MaxElementArray {

    public static void main(String[] args) {


        //Given an array find the maximum element

        int[] arr = {10,20,30,40,50};

        minimumElement(arr);


    }

    public static void minimumElement(int[] arr) {

        int max = Integer.MIN_VALUE; //will give the min value in the array

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
