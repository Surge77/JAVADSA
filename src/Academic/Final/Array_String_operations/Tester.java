package Academic.Final.Array_String_operations;
import java.util.*;
/***
 * The Hogwarts University wants to register students in the University. For this,
 * students are required enter their first name, middle name and last name in the
 * registration form. The University also generates the initials for the student.
 * Create a class Student, as shown below, to implement logic.
 *
 * Method Description: change():This method removes any leading or trailing
 * spaces from the firstName, middleName, lastName of the Student object. It also
 * checks whether the middleName is blank or not. If the middleName of the
 * Student is empty, it changes the middleName to “N.A.”. Finally, it returns the
 * Student object.
 *
 * generateInitials():This method calls the change() method of the Student class. It
 * returns a string with the first letter of firstName, middleName, lastName
 * respectively of the object returned by the change() method. To test the
 * functionality make a Tester Class. Create an object of Student class and initialise
 * the instance variables. Using this object, call the methods generateInitials()
 * method of the Student class and display the initials of the Student.
 */

class Student {
    private String firstName;
    private String middleName;
    private String lastName;

    // Constructor to initialize the student details
    public Student(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // Method to change the names by trimming spaces and setting middleName to "N.A." if empty
    public Student change() {
        this.firstName = this.firstName.trim();
        this.middleName = this.middleName.trim();
        this.lastName = this.lastName.trim();

        if (this.middleName.isEmpty()) {
            this.middleName = "N.A.";
        }

        return this;
    }

    // Method to generate initials from the student's names
    public String generateInitials() {
        change(); // Ensure names are formatted correctly
        return String.format("%s.%s.%s",
                String.valueOf(firstName.charAt(0)).toUpperCase(),
                String.valueOf(middleName.charAt(0)).toUpperCase(),
                String.valueOf(lastName.charAt(0)).toUpperCase());
    }
}

public class Tester {
    public static void main(String[] args) {
        // Create a Student object with example names
        Student student = new Student("  John  ", "   ", "Doe  ");

        // Call the generateInitials method and display the initials
        String initials = student.generateInitials();
        System.out.println("Student Initials: " + initials);
    }
}