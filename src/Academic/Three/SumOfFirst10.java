package Academic.Three;

//Develop a program to create a thread that calculates the sum of the first 10 natural numbers.

class Sumcalculator extends Thread{
    @Override
    public void run(){
        int sum = 0; // Variable to hold the sum
        for (int i = 0; i <= 10; i++){
            sum += i;  // Add the current number to the sum
        }
        System.out.println("Sum of first 10 natural numbers is: " + sum);
    }
}

public class SumOfFirst10 {

    public static void main(String[] args) {

        Sumcalculator sum = new Sumcalculator(); //create the thread
        sum.start(); //start the thread
    }
}
