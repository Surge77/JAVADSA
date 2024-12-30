import java.util.HashMap;
import java.util.Scanner;
import java.util.*;


class ThreadLifeCycleDemo extends Thread{

    @Override
    public void run(){

        for (int i = 0; i <= 5; i++){
            System.out.println("Thread in RUNNABLE state " + i);

            try{
                System.out.println("Thread state while sleeping " + Thread.currentThread().getState());
                Thread.sleep(500);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }

}

public class ThreadLifeCycle {
    public static void main(String[] args) {

        ThreadLifeCycleDemo thread = new ThreadLifeCycleDemo();
        System.out.println("Thread state after creation: " + thread.getState());

        thread.start();
        System.out.println("Thread state after callling start: " + thread.getState());

        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        System.out.println("Thread state during execution" + thread.getState());

        try {
            thread.join();
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        System.out.println("Thread state after execution " + thread.getState());


    }
}