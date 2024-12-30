package Academic.Final;
import java.util.*;

/**
 *
 Create a class Loan with attributes: tenure, principal, interestRate, and accountNumber,
 and a method calculateEMI() that calculates EMI using the formulas:
 simpleInterest = (principal * interestRate * tenure) / 100 and EMI = (simpleInterest + principal) / (tenure * 12).
 Create a subclass HomeLoan with a default constructor to initialize default values for all attributes.
 In the main method, create an instance of HomeLoan, display its details, and calculate the EMI.

 This question implements concepts like method overloading, inheritance, constructor classes and objects

 */

class Loan{

    int tenure;
    double principal;
    float interestRate;
    String accountNumber;

    // Constructor
    public Loan(int tenure, double principal, float interestRate, String accountNumber) {
        this.tenure = tenure;
        this.principal = principal;
        this.interestRate = interestRate;
        this.accountNumber = accountNumber;
    }

    // Overloaded calculateEMI method (no parameters)
    public double calculateEMI() {
        double simpleInterest = (principal * interestRate * tenure) / 100;
        double EMI = (simpleInterest + principal) / (tenure * 12); // Monthly EMI
        return EMI;
    }

    // Overloaded calculateEMI method (custom interest rate)
    public double calculateEMI(double customInterestRate) {
        double simpleInterest = (principal * customInterestRate * tenure) / 100;
        double EMI = (simpleInterest + principal) / (tenure * 12); // Monthly EMI
        return EMI;
    }


}

public class HomeLoan extends Loan {

    // Default constructor for HomeLoan
    public HomeLoan() {
        super(10, 500000, 7.5f, "HL123456789"); // Default values
    }

    public static void main(String[] args) {
        // Create an instance of HomeLoan
        HomeLoan homeLoan = new HomeLoan();

        // Display loan details
        System.out.println("Account Number: " + homeLoan.accountNumber);
        System.out.println("Principal: " + homeLoan.principal);
        System.out.println("Tenure (years): " + homeLoan.tenure);
        System.out.println("Interest Rate (%): " + homeLoan.interestRate);

        // Calculate and display EMI with default interest rate
        double emiDefault = homeLoan.calculateEMI();
        System.out.println("Monthly EMI (Default Interest Rate): " + emiDefault);

        // Calculate and display EMI with custom interest rate
        double customInterestRate = 8.0;
        double emiCustom = homeLoan.calculateEMI(customInterestRate);
        System.out.println("Monthly EMI (Custom Interest Rate " + customInterestRate + "%): " + emiCustom);
    }




}
