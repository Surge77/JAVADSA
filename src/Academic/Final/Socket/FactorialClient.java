package Academic.Final.Socket;
import java.net.ServerSocket;
import java.util.*;
import java.io.*;
import java.net.*;

/**
 * Write a Java program having client and server classes communicating using
 * socket. Client sending a number and server will calculate factorial of that
 * number and send back to server as response.
 */

public class FactorialClient {

    public static void main(String[] args) {

        try{

            Socket socket = new Socket("localhost",5000);
            System.out.println("Server connected successfully");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
            Scanner inp = new Scanner(System.in);

            System.out.print("Enter the number to find factorial for: ");
            String number = inp.nextLine();
            output.println(number);

            //Receive factorial from the server
            String response = input.readLine();
            System.out.println("Factorial of the number is: " + response);


        }catch (Exception e){
            e.printStackTrace();
        }
    }




}
