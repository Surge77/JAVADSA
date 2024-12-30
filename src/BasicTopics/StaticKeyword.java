package BasicTopics;

//A demonstration of static keyword and it's use cases

class Emp{

    int emp_id;
    static String ceo; //If you don't want some variables to be object specific rather common for all objects then we use static
    int salary;

    //Static var are variables which are same for all objects
    //Non static var are variables which are different for all objects

    public void show_details(){
        System.out.println(emp_id + ":" + salary + ":" + ceo);
    }

    /*A static block in Java is a block of code that is executed when a class is loaded into memory by the Java Virtual Machine (JVM).
    It is used primarily for initializing static variables or executing code that needs to run once when the class is loaded,
    regardless of how many instances of the class are created or even if no instances are created*/

    static {

        ceo = "Larry wheels";

    }

    //If we want to initialize non-static variables we can use constructor
}

public class StaticKeyword {

    //we can also make a method static ,as we don't need a object to call main method
    public static void main(String[] args) {

        Emp ronaldo = new Emp();
        ronaldo.emp_id = 1;
        ronaldo.salary = 1000;
        Emp.ceo = "Taco"; //Whenever we have static variable we can use object name or even class name to initialize
        //To access static variables we don't need objects

        Emp messi = new Emp();
        messi.emp_id = 2;
        messi.salary = 2000;
        messi.ceo = "Taco";

        //After changing a single object it changed across all the remaining objects due to static keyword
        ronaldo.ceo = "Raynor";

        ronaldo.show_details();
        messi.show_details();
    }
}
