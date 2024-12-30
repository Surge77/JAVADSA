package Problems;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/*
observations:
1.If we observe if the column number is even it moves down and if column number is odd it moves down
2.we are moving in a wave like a format so we need to make a intuition when we are moving up and down
3.in previous question we were moving horizontally but here we move vertically printing through each column
*/
public class PrintWaveArray {

    public static void main(String[] args) {

        //We will always focus and solve square or rectangular 2D arrays 
        //Printing the 2D array in wave form
        //for eg: The array is
        // c0 c1 c2 c3  -> here zero based indexing is followed and c means columns
        // 1  2  3  4
        // 5  6  7  8
        // 9 10 11 12

        //output: 1 5 9 10 6 2 3 7 11 4 8 12

        int[][] a = {
                {1,4,7,10},
                {2,5,8,11},
                {3,6,9,12},
        };

        WaveDisplay(a);
    }

    private static void WaveDisplay(int[][] arr) {

        for (int c = 0; c < arr[0].length; c++){

            if (c % 2 == 0){
                //move down
                for (int r=0; r< arr.length; r++){
                    System.out.print(arr[r][c] + " ");
                }
            }else {
                //move up

                for (int r= arr.length-1; r>=0; r--) {
                    System.out.print(arr[r][c] + " ");
                }
            }
        }
    }
}
