package Academic.Final.Multithreading;

/**
 * This program demonstrates the lifecycle stages of a thread:
 * NEW, RUNNABLE, TIMED_WAITING (during sleep), and TERMINATED.
 */

class ThreadLifecycleDemo extends Thread {

    @Override
    public void run() {
        // Simulate some work in the RUNNABLE state
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is in RUNNABLE state: " + i);
            try {
                // Thread goes into TIMED_WAITING state while sleeping
                System.out.println("Thread state while sleeping: " + Thread.currentThread().getState()); // TIMED_WAITING
                Thread.sleep(500); // Simulate work by sleeping for 500 milliseconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
    }
}

public class ThreadLifecycle {
    public static void main(String[] args) {
        // Create a new thread (NEW state)
        ThreadLifecycleDemo thread = new ThreadLifecycleDemo();
        System.out.println("Thread state after creation: " + thread.getState()); // Expected: NEW

        // Start the thread (it moves to RUNNABLE state)
        thread.start();
        System.out.println("Thread state after calling start(): " + thread.getState()); // Expected: RUNNABLE

        // Wait for a moment to allow the thread to enter TIMED_WAITING during sleep
        try {
            Thread.sleep(100); // Allow some time for the thread to start and possibly enter TIMED_WAITING
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Check the state again (could be RUNNABLE or TIMED_WAITING depending on timing)
        System.out.println("Thread state during execution: " + thread.getState());

        // Wait for the thread to finish (join ensures the main thread waits for thread completion)
        try {
            thread.join(); // Main thread will wait here until thread is TERMINATED
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Check the state after the thread has finished execution
        System.out.println("Thread state after completion: " + thread.getState()); // Expected: TERMINATED
    }
}
