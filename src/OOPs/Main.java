package OOPs;

public class Main {

    //A constructor in java is similar to method that is invoked when an object of the class is created
    //Constructor has the same name as that of the class and does not have any return type
    //There are three types of constructors : No-argument , Parameterized , Default constructors

    String name;

    //No-arg constructor => we do not pass any parameter
    Main(){
        System.out.println("Constructor invoked");
        name = "Algocamp";
    }

    //Parameterized constructor => here we pass parameters
    Main(String lang){
        System.out.println(lang + " is a programming language");
    }

    //Default constructor => even if we don't create any constructor java creates always creates an empty constructor

    public static void main(String[] args) {

        Main obj = new Main(); // => When we write new Main() here the constructor is being called

        System.out.println(obj.name);

        Main obj2 = new Main("C++");





    }
}
