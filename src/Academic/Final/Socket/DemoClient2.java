package Academic.Final.Socket;
import java.net.ServerSocket;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
import java.io.*;
import java.net.*;

import java.net.Socket;

public class DemoClient2 {

    public static void main(String[] args) {

        try{

            Socket socket = new Socket("localhost",5000);

            System.out.println("Connected to the server");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
            Scanner inp = new Scanner(System.in);

            String message;
            while (true){

                System.out.print("Enter the message: ");
                message = inp.nextLine();
                output.println(message);

                if (message.equalsIgnoreCase("bye")){
                    System.out.println("Ended the chat");
                    break;
                }

                String response = input.readLine();
                System.out.println(response);

            }

            socket.close();
            System.out.println("Connection closed");



        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
