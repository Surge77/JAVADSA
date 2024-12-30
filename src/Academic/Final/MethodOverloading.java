package Academic.Final;
import java.util.*;

/**
 * Create a class named PrintNumber to print various numbers of different
 * datatypes by creating three different methods with the same name “printn()”
 * having a parameter for each datatype int, float, double.
 */

class PrintNumber{

    public void printn(int number){
        System.out.println("Integer: " + number);
    }


    public void printn(float number){
        System.out.println("float: " + number);
    }

    public void printn(double number){
        System.out.println("double: " + number);
    }

}



public class MethodOverloading {

    public static void main(String[] args) {

        PrintNumber p1 = new PrintNumber();

        p1.printn(2);  // calls for method int
        p1.printn(23.43f); // calls for method float
        p1.printn(23.22345533); // calls for method double

    }
}
