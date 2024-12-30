package Academic.Final.Multithreading;

/**
 * Write a Java program that implements a multi-thread application that has
 * three threads. First thread generates random integer every 1 second and if
 * the value is even, second thread computes the square of the number and
 * prints. If the value is odd, the third thread will print the value of cube of the
 * number.
 */

import java.util.Random;

class RandomNumberGenerator extends Thread {
    //The final modifier means the sharedData reference cannot be reassigned after it is initialized.
    //sharedData is an instance/object of the SharedData class, which acts as a shared resource between threads.
    private final SharedData sharedData;

    //Constructor to initialize the sharedData object.
    public RandomNumberGenerator(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    //run() is the entry point of the thread.
    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(100); // Generate a random integer between 0 and 99
            sharedData.setNumber(number); //The number is stored in the SharedData object.
            System.out.println("Generated: " + number);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}

//This class handles even numbers.
class EvenNumberHandler extends Thread {

    private final SharedData sharedData;

    //Constructor initializes sharedData.
    public EvenNumberHandler(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (true) {
            int number = sharedData.getNumber(); // Get the latest number
            //Continuously checks if the latest number is even.
            //If even, it calculates and prints the square.
            if (number % 2 == 0) {
                int square = number * number;
                System.out.println("Square of " + number + " is: " + square);
            }
        }
    }
}


//This class handles odd numbers
class OddNumberHandler extends Thread {
    private final SharedData sharedData;

    //Constructor initializes sharedData.
    public OddNumberHandler(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (true) {
            int number = sharedData.getNumber(); // Get the latest number
            //Continuously checks if the latest number is odd.
            //If odd, it calculates and prints the cube.
            if (number % 2 != 0) {
                int cube = number * number * number;
                System.out.println("Cube of " + number + " is: " + cube);
            }
        }
    }
}

//The SharedData class acts as a shared resource between multiple threads (RandomNumberGenerator, EvenNumberHandler, and OddNumberHandler).
//It holds a single integer (number) that can be accessed and updated by these threads in a synchronized manner.
class SharedData {
    private int number;

    //Updates the number in a thread-safe way.
    public synchronized void setNumber(int number) {
        this.number = number;
    }

    //Retrieves the number in a thread-safe way
    public synchronized int getNumber() {
        return number;
    }

    //The synchronized keyword ensures that only one thread can access these methods at a time, preventing race conditions.
}

public class MultiThreadApp {
    public static void main(String[] args) {

        SharedData sharedData = new SharedData(); //Creates a SharedData instance to be shared among threads.

        //Creates instances of RandomNumberGenerator, EvenNumberHandler, and OddNumberHandler.
        //All threads share the same SharedData instance.
        RandomNumberGenerator generator = new RandomNumberGenerator(sharedData);
        EvenNumberHandler evenHandler = new EvenNumberHandler(sharedData);
        OddNumberHandler oddHandler = new OddNumberHandler(sharedData);

        generator.start();
        evenHandler.start();
        oddHandler.start();
    }
}