package Academic.Final;

import java.util.*;

/**
 * Write a program to print the names of students by creating a Student class.
 * Class two methods
 * printName():void this method should display name as “Unknown”
 * printName(String):void this method should display name passed to that
 * method.
 */

class student{

    public void PrintName(){
        System.out.println("Name : Unknown");
    }

    public void PrintName(String name){
        System.out.println("Name : "+ name);
    }

}

public class MethodOverl2 {

    public static void main(String[] args) {

        student s1 = new student();

        s1.PrintName();
        s1.PrintName("Markus");
    }
}
