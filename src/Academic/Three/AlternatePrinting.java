package Academic.Three;

//Write a Java program that use two threads to print alternately.

class PrintThread extends Thread {
    private String character;
    private Object lock;

    public PrintThread(String character, Object lock) {
        this.character = character;
        this.lock = lock;
    }

    public void run() {
        for (int i = 0; i < 5; i++) { // Adjust the number of iterations as needed
            synchronized (lock) {
                System.out.print(character + " ");
                lock.notify(); // Notify the other thread
                try {
                    lock.wait(); // Wait for the other thread to print
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Handle interruption
                }
            }
        }
    }
}
public class AlternatePrinting {
    public static void main(String[] args) {
        Object lock = new Object(); // Lock object for synchronization

        // Create two threads
        PrintThread threadA = new PrintThread("A", lock);
        PrintThread threadB = new PrintThread("B", lock);

        // Start the threads
        threadA.start();
        threadB.start();

        // Start the first thread
        synchronized (lock) {
            lock.notify(); // Start the first thread
        }
    }
}
