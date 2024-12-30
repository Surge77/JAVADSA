package OOPs;

//A class is a blueprint through which we create a object or multiple objects
//Every object has it's own state and its behaviour
//For ex: A bicycle class whose object has its state and behaviour
//state of the object would be like whether its resting or its in first gear
//And the behaviour would be like accelerating,braking etc

//We create a separate file for class to make the code clean and readable
public class BicycleClient {

    public static void main(String[] args) {

        //An object is an instance of a class
        //Using the bicycle class we can create objects like mountain bike,sports bicycle,touring bicycle

        //creating an object

        Bicycle mountain_bike = new Bicycle();

        //Accessing the methods and fields of class

        System.out.println(mountain_bike.gear);
        mountain_bike.braking();

        //second object
        Bicycle sports_bike = new Bicycle();

        System.out.println(sports_bike.gear);
        sports_bike.braking();

    }
}
