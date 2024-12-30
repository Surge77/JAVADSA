package Sockets;

import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        // Server runs on port 1234
        int port = 1234;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            // Wait for a client connection
            Socket socket = serverSocket.accept();
            System.out.println("New client connected");

            // Send greeting message to the client
            OutputStream output = socket.getOutputStream(); //When we want to send data to other machine we use outputstream
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("Hello, Client!");

            // Close the connection
            socket.close();
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
