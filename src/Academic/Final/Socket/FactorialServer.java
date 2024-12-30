package Academic.Final.Socket;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
import java.io.*;
import java.net.*;

/**
 * Write a Java program having client and server classes communicating using
 * socket. Client sending a number and server will calculate factorial of that
 * number and send back to server as response.
 */


public class FactorialServer {

    public static void main(String[] args) {

        try{
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("connecting to port 5000..");

            while (true){

                Socket socket = serverSocket.accept();
                System.out.println("Client connected successfully");

                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter output = new PrintWriter(socket.getOutputStream(),true);


                //receiving number from client
                String recieved = input.readLine();
                int number = Integer.parseInt(recieved);
                System.out.println("Number received: " + number);

                //calculating factorial
                long factorial = calculateFactorial(number);
                System.out.println("Calculated factorial: " + factorial);

                //send result back to client
                output.println(factorial);

                socket.close();


            }

        }catch (IOException e){
            e.printStackTrace();
        }


    }

    public static long calculateFactorial(int number){

        if (number < 0) return -1;
        long result = 1;
        for (int i = 1 ; i <= number; i++ ){
            result *= i;
        }

        return result;

    }
}
