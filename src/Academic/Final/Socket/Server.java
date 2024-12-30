package Academic.Final.Socket;

/**
 * Write a Java program having client and server classes communicating using
 * socket. Client sending a greet and server will respond and send message
 * back. Communication continues until any one sends ‘bye’.
 */

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {


        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server is listening on port 5000...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String message;
            while (true) {
                message = input.readLine();
                if (message.equalsIgnoreCase("bye")) {
                    System.out.println("Client has ended the chat.");
                    break;
                }
                System.out.println("Client: " + message);

                String response = "Server: Received '" + message + "'";
                output.println(response);
            }

            socket.close();
            System.out.println("Connection closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
