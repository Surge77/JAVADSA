package Sockets;

import java.io.*;
import java.net.*;

public class SimpleClient {

    public static void main(String[] args) {
        // Server IP and port
        String hostname = "localhost";
        int port = 1234;

        try (Socket socket = new Socket(hostname, port)) {
            System.out.println("Connected to the server");

            // Get message from the server
            InputStream input = socket.getInputStream(); //inputStream receives and reads that data
            BufferedReader reader = new BufferedReader(new InputStreamReader(input)); //read text from a character-input stream efficiently.

            String message = reader.readLine();
            System.out.println("Server says: " + message);
        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}
