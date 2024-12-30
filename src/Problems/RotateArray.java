package Problems;

import java.util.Arrays;
import java.util.Scanner;
public class RotateArray {

    public static void main(String[] args) {

        //Given an array we need to rotate the array
        //for eg: 1 2 3 4 5
        //if k = 3 then the rotation will be 3 4 5 1 2
        //if k = 2 then the rotation of array will be 4 5 1 2 4
        //k can be anything
        //if we rotate the array 5 times it will return to its normal position
        //if k = -2 then the rotation is backwards 3 4 5 1 2 same as when k = 3
        //These below all are consecutive rotations
//        k = -2   => 3 4 1 2
//        k = -1   => 2 3 4 1
//        k =  0   => 1 2 3 4 |
//        k =  1   => 4 1 2 3 | 1 % 4 = 1
//        k =  2   => 3 4 1 2 | =>these 4 are the possible answers we can get everytime
//        k =  3   => 2 3 4 1 |
//        k =  4   => 1 2 3 4
//        k =  5   => 4 1 2 3   5 % 4 = 1
//        k =  6   => 3 4 1 2
//        k =  7   => 2 3 4 1
//        k =  8   => 1 2 3 4

        // k = k % arr.length is always the same array
        //For negative numbers
        // Suppose the number i.e k = -22
        // -22 % 4 = -2 => then add n to the answer i.e 4
        // -2 + 4 = 2 now k = 2 so the above values get mapped
        // -27 % 4 = -3 => -3 + 4 = 1 so k = 1 get mapped


        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 5};
        //n determine the number of times an array should be rotated.
        int n = 3; //rotating factor

        //Displays original array
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Rotate the given array by n times toward right
        for(int i = 0; i < n; i++){
            int j, last;
            //Stores the last element of array
            last = arr[arr.length-1];

            for(j = arr.length-1; j > 0; j--){
                //Shift element of array by one
                arr[j] = arr[j-1];
            }
            //Last element of array will be added to the start of array.
            arr[0] = last;
        }

        System.out.println();

        //Displays resulting array after rotation
        System.out.println("Array after right rotation: ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
