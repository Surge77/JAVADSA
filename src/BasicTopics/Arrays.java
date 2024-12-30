package BasicTopics;

import java.util.Scanner;
public class Arrays {

    public static void main(String[] args) {

        //datatype[] arrayName = new datatype[5]
        int[] arr = new int[5];
        System.out.println(arr);

        //if we want to do declaration and initialization in different lines

//        int[] arr = null;
//        arr = new int[5];

        //Initializing during declaration
        //In this the java compiler automatically specifies the size by counting the number of elements in arrays
        int[] age = {12,43,52,32,54};

        System.out.println(arr.length);
        //to print size of array

        //values are by default zero
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
//        System.out.println(arr[5]); // error index out of range

        //how to update elements in array
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        for (int i = 0 ; i < arr.length; i++){

            System.out.println(arr[i]);
        }

        //prints for n to 0
        for (int i = arr.length-1; i >= 0 ; i--){
            System.out.println(arr[i]);
        }

        //Enhanced for loop
        //Forward looping only can be done
        //read only
        System.out.println("--------------EF------------");
        for (int val: arr){
            System.out.println(val);
            //val is directly accessing the element it
            //val is not an index it does not work on the concept of index
            //this can only read values
            //this is a shorter and faster ways
        }





    }
}
