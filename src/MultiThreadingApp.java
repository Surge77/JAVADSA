import java.util.*;

class RandomNumberGenerator extends Thread{

    private final SharedData sharedData;

    public RandomNumberGenerator(SharedData sharedData){
        this.sharedData = sharedData;
    }

    @Override
    public void run(){

        Random random = new Random();
        while (true){
            int number = random.nextInt(100);
            sharedData.setNumber(number);
            System.out.println("Generated :" + number);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}

class EvenHandler extends Thread{

    private final SharedData sharedData;

    public EvenHandler(SharedData sharedData){
        this.sharedData = sharedData;
    }
    @Override
    public void run(){

        while (true) {

            int number = sharedData.getNumber();

            if (number % 2 == 0) {
                int square = number * number;
                System.out.println("Square of " + number + " is " + square);
            }
        }
    }

}

class OddHandler extends Thread{

    private final SharedData sharedData;

    public OddHandler(SharedData sharedData){
        this.sharedData = sharedData;
    }

    @Override
    public void run(){


        while (true){
            int number = sharedData.getNumber();

            if (number % 2 != 0){
                int cube = number * number * number;
                System.out.println("Cube of " + number + " is " + cube);
            }
        }
    }
}

class SharedData{

    private int number;

    public synchronized void setNumber(int number){
        this.number = number;
    }

    public synchronized int getNumber(){
        return number;
    }

}

public class MultiThreadingApp {
    public static void main(String[] args) {

        SharedData sharedData = new SharedData();

        RandomNumberGenerator generator = new RandomNumberGenerator(sharedData);
        EvenHandler evenHandler = new EvenHandler(sharedData);
        OddHandler oddHandler = new OddHandler(sharedData);

        generator.start();
        evenHandler.start();
        oddHandler.start();


    }
}
