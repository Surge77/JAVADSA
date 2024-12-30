package Academic.Final.Socket;

/**
 * Write a Java program having client and server classes communicating using
 * socket. Client sending a greet and server will respond and send message
 * back. Communication continues until any one sends ‘bye’.
 */

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("Connected to the server.");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            String message;
            while (true) {
                System.out.print("Enter message: ");
                message = scanner.nextLine();
                output.println(message);

                if (message.equalsIgnoreCase("bye")) {
                    System.out.println("Ending the chat.");
                    break;
                }

                String response = input.readLine();
                System.out.println(response);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
