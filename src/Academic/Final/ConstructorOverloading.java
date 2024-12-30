package Academic.Final;

import java.util.*;

/***
 * Write a program to print the names of students by creating a Student class.
 * If no name is passed while creating an object of Student class, then the
 * name should be unknown otherwise the name should be equal to the String
 * value passed while creating object of Student class.
 *
 */

class Student {

    String name;


    public Student(){
        this.name = "Unknown";
    }

    //overloading of constructor
    public Student(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("Name of the student is :"  + this.name);
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Mike");

        s1.display();
        s2.display();


    }

    
}
