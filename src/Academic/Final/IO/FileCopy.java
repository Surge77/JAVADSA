package Academic.Final.IO;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;

/***
 * Write a Java program to make use of FileInputStream and FileOutputStream
 * to copy an input file into output file.
 */

public class FileCopy {

    public static void main(String[] args) throws FileNotFoundException {

        String inputFile = "source.txt";
        String outputFile = "destination.txt";

        try {

            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);

            byte[] buffer = new byte[1024];
            //A buffer is a temporary storage area. In this case, it's an array of bytes.
            //new byte[1024] creates a byte array that can hold up to 1024 bytes (1 KB) of data at a time.
            //Instead of reading/writing one byte at a time (which is slow), the program processes data in chunks for efficiency.

            int bytesread;
            //bytesRead is a variable that stores the number of bytes actually read from the file.
            //The read method of FileInputStream returns how many bytes were read and stored in the buffer.
            //If the end of the file is reached, read returns -1, which stops the loop.

            while ((bytesread = fis.read(buffer)) != -1){

                    fos.write(buffer,0,bytesread);
                    //It writes from the start of the buffer (0) to the number of bytes actually read (bytesRead).
                    //The loop continues as long as fis.read(buffer) doesn't return -1.
                    //-1 means the end of the file has been reached.
            }

            System.out.println("File copied successfully");

        } catch (Exception e){

            System.out.println("Error occurred" + e.getMessage());

        }


    }
}
