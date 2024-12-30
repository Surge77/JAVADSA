package Academic.Final.IO;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/***
 * Write a java program, which creates InputStreamReader to read standard
 * input stream until the user types a “q”.
 */



public class InputStream {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        // Converts byte stream (System.in) into a character stream, allowing you to work with character data instead of raw bytes.
        //System.in provides input as bytes, and InputStreamReader converts that byte stream into character stream.

        BufferedReader br = new BufferedReader(isr);
        //BufferedReader is another class that wraps around an existing Reader (like InputStreamReader) and provides buffered reading of text.
        // It reads large chunks of data into memory at once (instead of reading one character at a time),
        // which makes it much more efficient for reading text line-by-line or character-by-character.
        //It allows us to read lines of text using the readLine() method, which is much easier and more convenient than reading individual characters or bytes.

        System.out.print("Enter characters, type 'q' to quit: ");


        try{

            String input;

            while (true){

                input = br.readLine(); //read a line of input

                //The method equalsIgnoreCase() in Java is used to compare two strings while ignoring the case (uppercase or lowercase) of the characters.
                if (input.equalsIgnoreCase("q")){
                    System.out.println("exiting...");
                    break;
                }

                System.out.println("You entered " + input); // Echo the input back to the user
            }
        } catch (Exception e){

            System.out.println("An error occured" + e.getMessage());

        //the finally block is used to define a section of code that will always be executed, regardless of whether an exception was thrown or not during the execution of the try block.
        //The finally block ensures that critical code, like resource cleanup or closing resources, is always executed after the try block, even if an exception occurs.
        //This is particularly useful for operations like closing files, network connections, or releasing other resources, ensuring that resources are not left open or in an inconsistent state.
        } finally {

            try{
                br.close(); //Close bufferedReader
            }catch (Exception e){
                System.out.println("Error closing reader" + e.getMessage());
            }
        }
    }
}
