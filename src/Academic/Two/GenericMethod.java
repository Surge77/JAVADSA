package Academic.Two;

/**
 * Write a Java program that demonstrates the use of a generic method
 * to perform common operations on arrays of different types (e.g.,
 * Integer, String, Double). The program should include the following:
 * Print Array Elements: Create a generic method printArray that
 * accepts an array of any type and prints all its elements.
 */

public class GenericMethod {

    public static <T> void printArray (T[] array){

        for (T element : array){
            System.out.print(element + " ");
        }
        System.out.println(); //new line
    }

    public static void main(String[] args) {

        //Create arrays of string integer and double
        String[] strarray = {"ab","c","e","f","g"};
        Integer[] intarray = {1,2,3,4,5,6,7};
        Double[] dblarray = {2.1,2.1,5.7,3.0};

        //printing string array
        System.out.println("string array");
        printArray(strarray);


        //printing integer array
        System.out.println("integer array");
        printArray(intarray);

        //double array printing
        System.out.println("double array");
        printArray(dblarray);



    }
}
