package Academic.Final;
import java.util.*;

/**
 * Create a class ‘ Shape’, It have three attributes length, breadth and side and
 * that have two constructors as bellow
 * Shape(int): It should print “It is a square”
 * Shape(int,int): It should print “It is a rectangle”
 * calculateArea(int):int calculates area of square
 * calculateArea(int, int):int calculates area of rectangle
 */

class shape {
    private int length;
    private int breadth;

    // Constructor for a square
    public shape(int side) {
        this.length = side;
        this.breadth = side;
        System.out.println("It is a square");
    }

    // Constructor for a rectangle
    public shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("It is a rectangle");
    }

    // Method to calculate the area of a square
    public int calculateArea(int side) {
        return side * side;
    }

    // Method to calculate the area of a rectangle
    public int calculateArea(int length, int breadth) {
        return length * breadth;
    }

}

public class MethodConstructOverl {

    public static void main(String[] args) {

        //create a rectangle
        shape rectangle = new shape(5,5);
        System.out.println(rectangle.calculateArea(5,5));

        //create a square
        shape square = new shape(2);
        System.out.println(square.calculateArea(2));
    }
}

