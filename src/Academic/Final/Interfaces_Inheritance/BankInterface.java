package Academic.Final.Interfaces_Inheritance;
import java.util.*;

/***
 * Write a program to create a interface ‘Bank’ having method rateOfInterest()
 * create another classes ‘SBI’ and ‘PNB’ which implements the interface
 * ‘Bank’. Display rate of interest of different banks.
 */

// Define the Bank interface
interface Bank {
    // Abstract method to get the rate of interest
    double rateOfInterest();
}

// SBI class implementing Bank interface
class SBI implements Bank {
    // Implement the rateOfInterest method for SBI
    public double rateOfInterest() {
        return 6.5; // SBI interest rate
    }
}

// PNB class implementing Bank interface
class PNB implements Bank {
    // Implement the rateOfInterest method for PNB
    public double rateOfInterest() {
        return 7.0; // PNB interest rate
    }
}

// Main class to test the implementation
public class BankInterface {
    public static void main(String[] args) {
        // Creating instances of SBI and PNB
        Bank sbi = new SBI();
        Bank pnb = new PNB();

        // Display the rate of interest for each bank
        System.out.println("SBI Rate of Interest: " + sbi.rateOfInterest() + "%");
        System.out.println("PNB Rate of Interest: " + pnb.rateOfInterest() + "%");
    }
}
