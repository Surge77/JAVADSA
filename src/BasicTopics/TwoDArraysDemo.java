package BasicTopics;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class TwoDArraysDemo {

    public static void main(String[] args) {

        //Ways of initializing or defining 2D arrays

        //Here we follow zero indexing i.e indexing starts from zero
        //the order is first rows[3] => then columns [4] in below case
        //This array will basically allocate 12 cells or elements space which is 3*4 = 12
        int[][] a = new int[3][4];


        //another way of creating 2D arrays is

        //this array will have 3 rows and 2 columns
        int[][] a1 = {
                {3,4},
                {1,2},
                {5,6},
        };

        //printing of elements
        System.out.println(Arrays.toString(a));
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        System.out.println(a.length); //prints total number of rows
        System.out.println(a[0].length); //prints total number of columns , here we can add any row number instead of 0


        //access values in 2D Array
        //default value of any empty array is 0
        System.out.println(a[1][2]);

        //set or updating values in 2D arrays
        a[2][3] = 100;
        System.out.println(a[2][3]);

        int[][] a2 = {
                {3,4,6},
                {1,2,5},
                {5,6,1},
        };

        //printing all the above elements of 2D array using for loop

        for (int i= 0; i < a2.length; i++){

            //work for current row
            for (int j = 0; j < a2[0].length; j++){
                System.out.print(a2[i][j] +" ");
            }
            //prep for next row
            System.out.println();
        }

        System.out.println("\n");

        //using enhanced for loop
        for (int[] val : a2){
            for (int temp : val){
                System.out.print(temp+" ");
            }
            System.out.println();
        }

        //A jagged array in Java is a collection of arrays where each array may contain a varied number of elements.
        //A two-dimensional array, in contrast, requires all rows and columns to have the same length.
        //Jagged arrays are also known as "ragged arrays" or "irregular arrays". They can be created by specifying
        //the size of each array in the declaration.
        //For example, a jagged array with three rows can have the first row with three elements,
        //the second with two elements, and the third with four elements.

        //Most 2D arrays are of like square structure matrix which have equal number of rows and columns
        //Or we can have a rectangular like matrix structure which can have unequal number of rows and columns
        //The third type is jagged 2D arrays this means for every row we can have unequal number of columns

        //ways to declare jagged 2D arrays

        int[][] arr = new int[2][];  //here we can leave the column empty , this wont show any error
        //int[][] arr = new int[][3];  //but the reverse ain't true it will throw an error

        arr[0] = new int[4];
        arr[1] = new int[5];
        arr[2] = new int[8];
        //here the columns are all unequally defined

        //now to print these jagged arrays we need to print it for every column as all of them are unequal and won't show the same
        //elements




    }
}
