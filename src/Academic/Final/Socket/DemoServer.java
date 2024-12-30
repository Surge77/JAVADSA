package Academic.Final.Socket;
import java.net.ServerSocket;
import java.util.*;
import java.io.*;
import java.net.*;

import java.io.IOException;

public class DemoServer {

    public static void main(String[] args) {

        try{

            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Listening on port 5000...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(),true);

            String message;
            while (true){

                message = input.readLine(); // reads the message from the client

                if(message.equalsIgnoreCase("bye")){
                    System.out.println("Client ended the chat");
                    break;
                }

                System.out.println("Message: " + message);

                String response = "server received response : " + message + "'";
                output.println(response); // Sends the response to the client

            }

            socket.close();
            System.out.println("Connection closed");


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

