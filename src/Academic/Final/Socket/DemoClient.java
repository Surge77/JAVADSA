package Academic.Final.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

public class DemoClient {

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
                output.println(message); //sends the message to server

                if (message.equalsIgnoreCase("bye")){
                    System.out.println("Ending the chat");
                    break;
                }

                String response = input.readLine(); // Reads a message sent by the server
                System.out.println(response);

            }

        }catch (IOException e){
            e.printStackTrace();


        }
    }
}
