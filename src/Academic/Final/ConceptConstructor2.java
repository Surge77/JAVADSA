package Academic.Final;
import java.util.*;

/**
 * Create a class Account having the following attributes
 * accountNo:String
 * name:String
 * static min_balance:number
 * balance:number
 * A constructor
 * Account(String AccountNo, String name, int balance) initialize AccountNo,
 * name and balance
 * In main method values of all attributes should be print.
 *
 */

class Account{

    String account_no;
    String name;
    static int min_balance;
    int balance;

    public Account(String account_no,String name,int balance){
        this.account_no = account_no;
        this.name = name;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + account_no);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Minimum Balance: " + min_balance);


    }
}

public class ConceptConstructor2 {

    public static void main(String[] args) {

        // Creating an instance of Account
        Account acc = new Account("123456789", "John Doe", 1000);

        // Displaying account details
        acc.displayAccountDetails();
    }
}
