package Academic.Final.Array_String_operations;

/***
 * A project unit in a company wants to keep track of five employees in the
 * project and their salaries, and also find out the average of their salaries.
 * They also want to find the number of employees who get a salary greater
 * than the average salary and those who get lesser. Consider that the salaries
 * are stored in an array of double variables as given below:
 * double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0}
 *
 * There are four tasks: 
 * Store the salaries of the five employees in an array.
 * Calculate the average salary.
 * Count the number of employees who have a salary greater than the average.
 * Count the number of employees who have a salary lesser than the average.
 */

public class Employee_salaries {

    public static void main(String[] args) {

        double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};


        double totalSalary = 0;

        for (int i = 0; i < salary.length; i++){
            totalSalary += salary[i];
        }

        double avg_salary = totalSalary / salary.length;

        System.out.println("Average salary is " + avg_salary);

        int greaterthanaverage = 0;
        int lesserthanaverage = 0;

        for (int i = 0; i < salary.length; i++){

            if (salary[i] > avg_salary){
                greaterthanaverage++;

            }else if (salary[i] < avg_salary){
                lesserthanaverage++;
            }
        }

        System.out.println("Number of employees with salary greater than average is " + greaterthanaverage);
        System.out.println("Number of employees with salary lesser than average is " + lesserthanaverage);


    }
}
