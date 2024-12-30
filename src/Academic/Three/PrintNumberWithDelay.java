package Academic.Three;

//Create a Java program that create a thread that prints numbers from 1 to 10 with a delay of 1 second between each.

public class PrintNumberWithDelay {

    public static void main(String[] args) {
        // Create a new thread using an anonymous inner class
        Thread numberThread = new Thread() {
            // Override the run() method to define the thread's behavior
            public void run() {
                // Loop from 1 to 10
                for (int i = 1; i <= 10; i++) {
                    // Print the current number followed by a space
                    System.out.print(i + " ");
                    try {
                        // Pause execution for 1 second (1000 milliseconds)
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // Handle exception if the thread is interrupted during sleep
                        Thread.currentThread().interrupt();
                    }
                }
            }
        };

        // Start the thread, which will execute the run() method
        numberThread.start();

        try {
            // Wait for the numberThread to finish its execution before proceeding
            numberThread.join();
        } catch (InterruptedException e) {
            // Handle exception if interrupted while waiting for the thread to finish
            Thread.currentThread().interrupt();
        }
    }
}