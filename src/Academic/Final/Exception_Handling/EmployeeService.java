package Academic.Final.Exception_Handling;
import java.util.*;

/***
 * Create a class Employee” with data members
 * empName”,“empAge”,“empSalary”. Add appropriate get/set methods for
 * the data members. Create an Exception class “EmpSalaryException” with
 * an appropriate constructor. Create a class EmployeeService with the main()
 * method. Write a method checkEmployeeSalary(Employee emp) in
 * EmployeeService, which checks if empSalary&amp;lt;1000 then throws
 * EmpSalaryException. In the EmployeeService class main() method Create
 * five objects of employee class by passing appropriate values to all the data
 * members. Call checkEmployeeSalary() method for each of the
 * five Employee objects being passed and handle the EmpSalaryException.
 * Print the empName where the Salary is < 1000.
 */

/**
 * getters and setters are not built-in methods; they are defined by the programmer as part of the class to provide controlled access to the class's private fields.
 * They are an essential part of the encapsulation principle in object-oriented programming, allowing for better data management, validation, and abstraction.
 */

class Employee {

    String empName;
    int empAge;
    double empSalary;

    public Employee(String empName,int empAge,double empSalary){

        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    //getters and setters
    public String getEmpName(){
        return empName;
    }

    public void setEmpName(){
        this.empName = empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(){
        this.empAge = empAge;
    }

    public double getEmpSalary(){
        return empSalary;
    }

    public void setEmpSalary(){
        this.empSalary = empSalary;
    }


}

class EmpSalaryException extends Exception{

    //constructor that accepts a message
    public EmpSalaryException(String message){
        super(message);
    }

}

public class EmployeeService{

    public static void checkEmployeeSalary(Employee emp) throws EmpSalaryException{

        if (emp.getEmpSalary() < 1000){
            throw new EmpSalaryException("salary of " + emp.getEmpName() + " is less than 1000");
        }

    }

    public static void main(String[] args) throws EmpSalaryException {

        // Create five Employee objects
        Employee emp1 = new Employee("John", 25, 1200);
        Employee emp2 = new Employee("Jane", 30, 800);
        Employee emp3 = new Employee("Alice", 28, 1500);
        Employee emp4 = new Employee("Bob", 35, 950);
        Employee emp5 = new Employee("Charlie", 40, 1100);

         Employee[] employee = {emp1,emp2,emp3,emp4,emp5};

         for (Employee emp : employee){

             try{
                 checkEmployeeSalary(emp);
             }catch (EmpSalaryException e){
                 // Print the name of the employee with salary < 1000
                 System.out.println(e.getMessage());
             }
         }

    }


}
