package Academic.Three;

//Create a Java program that create 5 threads and 4 th thread have high priority, 1st and
//2nd have normal priority and 0 th and 3 rd have low priority.

class CustomThread extends Thread {
    private int threadNumber;

    public CustomThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadNumber + " is running with priority: " + getPriority());
        // Simulate some work with a sleep
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadNumber + " was interrupted.");
        }
        System.out.println("Thread " + threadNumber + " has completed.");
    }
}

public class PriorityThreads {
    public static void main(String[] args) {
        // Create threads
        CustomThread[] threads = new CustomThread[5];

        // Assign priorities
        threads[0] = new CustomThread(0); // Low priority
        threads[0].setPriority(Thread.MIN_PRIORITY); // Priority 1

        threads[1] = new CustomThread(1); // Normal priority
        threads[1].setPriority(Thread.NORM_PRIORITY); // Priority 5

        threads[2] = new CustomThread(2); // Normal priority
        threads[2].setPriority(Thread.NORM_PRIORITY); // Priority 5

        threads[3] = new CustomThread(3); // Low priority
        threads[3].setPriority(Thread.MIN_PRIORITY); // Priority 1

        threads[4] = new CustomThread(4); // High priority
        threads[4].setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Start threads
        for (CustomThread thread : threads) {
            thread.start();
        }


//         Optionally, wait for all threads to finish
        for (CustomThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread was interrupted.");
            }
        }
        System.out.println("All threads have completed.");

    }
}