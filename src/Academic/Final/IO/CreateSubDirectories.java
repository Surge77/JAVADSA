package Academic.Final.IO;
import java.util.*;
import java.io.File; //The File class is used to represent files and directories in Java. It provides methods to create, delete, check existence, and manipulate files and directories.

/**
 * Create a class DirectoryTest.java Add a main method in which first create a
 * directory “JavaPgm” within that directory create three subdirectories
 * “InheritancePgm”, ”AbstractionPgm” and ”PolymorphismPgm”. Display
 * list of subdirectories in “JavaPgm” directory.
 */

public class CreateSubDirectories {

    public static void main(String[] args) {

        File mainDir = new File("C:\\Users\\tdmne\\Downloads\\JAVADSA\\src\\Academic\\Final\\IO\\JavaPgm");


        if (!mainDir.exists()){

            boolean isCreated = mainDir.mkdir();

            if (isCreated){
                System.out.println("Directory 'JavaPgm' created successfully.");
            }else{
                System.out.println("Failed to create 'javaPgm' directory");
                return;
            }
        }

        //creating subdirectories under 'JavaPgm'
        File subDir1 = new File(mainDir,"InheritancePgm");
        File subDir2 = new File(mainDir,"AbstractionPgm");
        File subDir3 = new File(mainDir,"PolymorphismPgm");
        //This only creates the File object in memory, not the actual directory on the filesystem.

        //This line actually creates the directory "AbstractionPgm" on the filesystem, under the parent directory "JavaPgm"
        subDir1.mkdir();
        subDir2.mkdir();
        subDir3.mkdir();

        //List all subdirectories under 'JavaPgm' directory
        System.out.println("\nSubdirectories in 'JavaPgm' directory");

        File[] subDirs = mainDir.listFiles(File::isDirectory);
        //The listFiles() method of the File class returns an array of File objects representing all files and directories inside the JavaPgm directory.
        //The argument File::isDirectory is a lambda expression that filters the results to include only directories (not files).
        // It checks each item and only includes it in the result if it's a directory.

        if(subDirs != null && subDirs.length > 0){
            for(File dir : subDirs){
                System.out.println(dir.getName());
            }
        }else{
            System.out.println("No sub directories found");
        }


    }
}
