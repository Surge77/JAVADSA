package Sockets;
import java.util.*;

import java.io.*; // Import necessary classes for input and output operations
import java.net.*; // Import classes for networking

public class EchoClient {
    public static void main(String[] args) throws IOException {
        // Create a socket to connect to the echo server running on localhost at port 8000
        Socket clientSocket = new Socket("localhost", 8000);
        System.out.println("Connected to echo server"); // Notify that the client has connected

        // Create input and output streams for the client socket
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // Input stream to read responses from the server
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); // Output stream to send messages to the server
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in)); // Input stream to read user input from the console

        // Variable to store the message to be sent to the server
        String message;
        // Loop to continuously send messages to the server
        while (true) {
            System.out.print("Enter message (or 'quit' to exit): "); // Prompt user for input
            message = userInput.readLine(); // Read user input
            if (message.equalsIgnoreCase("quit")) { // Check if the user wants to quit
                break; // Exit the loop if the user types 'quit'
            }
            out.println(message); // Send the message to the server
            System.out.println("Server response: " + in.readLine()); // Print the server's response
        }

        // Close the client socket after communication ends
        clientSocket.close();
    }
}