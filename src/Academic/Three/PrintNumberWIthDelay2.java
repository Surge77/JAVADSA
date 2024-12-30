package Academic.Three;

//Create a Java program that create a thread that prints numbers from 1 to 10 with a delay of 1 second between each.

class NumberPrinter extends Thread{
    @Override
    public void run(){

        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
            try{
                Thread.sleep(1000); // Delay of 1 second (1000 milliseconds)
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class PrintNumberWIthDelay2 {

    public static void main(String[] args) {

        NumberPrinter numberPrinter = new NumberPrinter();  // Create a new thread
        numberPrinter.start(); //start the thread

    }
}
