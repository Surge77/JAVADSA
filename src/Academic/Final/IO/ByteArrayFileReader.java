package Academic.Final.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * Create a class ByteArrayFileReader write a array of bytes {11,21,3,40,5} in file
 * using FileOutputStream , Read content of same file using FileInputStream
 * and display.
 */

public class ByteArrayFileReader {

    public static void main(String[] args) {

        // Array of bytes to write to the file
        byte[] data = {11,21,3,40,5};

        try{
            // Write data to the file using FileOutputStream
            FileOutputStream fos = new FileOutputStream("output.txt");
            fos.write(data);
            System.out.println("Data written to File successfully");

        }catch (Exception e){

            System.out.println("Error occurred while writing the file: " + e.getMessage());

        }

        try{

            //Read the content of the file using FileInputStream
            FileInputStream fis = new FileInputStream("output.txt");

            int bytesread;

            System.out.println("Reading data from the file");

            // Read and display each byte from the file
            while ((bytesread = fis.read()) != -1){
                System.out.print(bytesread + " "); // Display byte as an integer

            }
        } catch (Exception e){

            System.out.println("Error while reading the file " + e.getMessage());
        }


    }
}
