package Sockets;

//Create a server that echoes back messages received from a client.

import java.io.*; // Import necessary classes for input and output operations
import java.net.*; // Import classes for networking

public class EchoServer {
    private ServerSocket serverSocket; // Declare a ServerSocket to listen for client connections

    // Constructor to initialize the server socket on a specific port
    public EchoServer(int port) throws IOException {
        serverSocket = new ServerSocket(port); // Create a ServerSocket that binds to the specified port
        System.out.println("Echo server started on port " + port); // Print server start message
    }

    // Method to start the server and accept client connections
    public void start() {
        while (true) { // Infinite loop to keep the server running
            try {
                // Accept a new client connection and create a socket for communication
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected"); // Notify that a client has connected

                // Create input and output streams for the client socket
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // Input stream to read messages from the client
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); // Output stream to send messages back to the client

                // Variable to store the incoming message
                String message;
                // Read messages from the client until the connection is closed
                while ((message = in.readLine()) != null) {
                    System.out.println("Received message: " + message); // Print the received message
                    out.println(message); // Echo the message back to the client
                }

                // Close the client socket after communication ends
                clientSocket.close();
            } catch (IOException e) { // Handle any I/O exceptions
                System.out.println("Error handling client connection: " + e.getMessage()); // Print error message
            }
        }
    }

    // Main method to start the echo server
    public static void main(String[] args) throws IOException {
        EchoServer server = new EchoServer(8000); // Create an instance of EchoServer on port 8000
        server.start(); // Start the server to listen for client connections
    }
}