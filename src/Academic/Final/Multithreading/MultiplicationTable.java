package Academic.Final.Multithreading;
import java.util.*;

/**
 * Write a java program to display table of 1 to 10 using multithreading
 *
 * The output will display the multiplication tables of 1 through 10, with each table's result printed by its own thread.
 * The output will appear interspersed because the threads are running concurrently.
 */

class TableThread extends Thread {
    private int number;

    // Constructor to pass the number for which the table is to be printed
    public TableThread(int number) {
        this.number = number;
    }

    // Override the run() method to define the thread's behavior
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try {
                // Sleep for 500 milliseconds to simulate a delay between each multiplication
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create and start threads for the tables from 1 to 10
        for (int i = 1; i <= 10; i++) {
            TableThread tableThread = new TableThread(i);
            tableThread.start();
        }
    }
}
