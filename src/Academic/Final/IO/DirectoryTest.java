package Academic.Final.IO;

import java.io.File;
import java.util.*;

public class DirectoryTest {

    public static void main(String[] args) {
        // Specify the absolute path for the "JavaPgm" directory
        File mainDir = new File("C:\\Users\\tdmne\\Downloads\\JAVADSA\\src\\Academic\\Final\\IO\\JavaPgm");

        // Check if the main directory exists, if not, create it
        if (!mainDir.exists()) {
            boolean isCreated = mainDir.mkdir();  // Create the directory
            if (isCreated) {
                System.out.println("Directory 'JavaPgm' created successfully.");
            } else {
                System.out.println("Failed to create 'JavaPgm' directory.");
                return;
            }
        }

        // Create subdirectories under "JavaPgm"
        File subDir1 = new File(mainDir, "InheritancePgm");
        File subDir2 = new File(mainDir, "AbstractionPgm");
        File subDir3 = new File(mainDir, "PolymorphismPgm");

        // Create the subdirectories
        System.out.println("Attempting to create 'InheritancePgm'...");
        if (subDir1.mkdir()) {
            System.out.println("'InheritancePgm' directory created.");
        } else {
            System.out.println("Failed to create 'InheritancePgm'.");
        }

        System.out.println("Attempting to create 'AbstractionPgm'...");
        if (subDir2.mkdir()) {
            System.out.println("'AbstractionPgm' directory created.");
        } else {
            System.out.println("Failed to create 'AbstractionPgm'.");
        }

        System.out.println("Attempting to create 'PolymorphismPgm'...");
        if (subDir3.mkdir()) {
            System.out.println("'PolymorphismPgm' directory created.");
        } else {
            System.out.println("Failed to create 'PolymorphismPgm'.");
        }

        // List all subdirectories in the "JavaPgm" directory
        System.out.println("\nSubdirectories in 'JavaPgm' directory:");
        File[] subDirs = mainDir.listFiles(File::isDirectory);

        // Display each subdirectory's name
        if (subDirs != null && subDirs.length > 0) {
            for (File dir : subDirs) {
                System.out.println(dir.getName());
            }
        } else {
            System.out.println("No subdirectories found.");
        }
    }
}
