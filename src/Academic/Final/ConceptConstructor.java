package Academic.Final;
import java.util.*;

/**
 * Create a class named “Bank” which have the following attributes:
 * bankName: String
 * area: String
 * phone no: String
 * A constructor:
 * Bank(String bankName, String area, String phone no) This constructor
 * initializes bankName, area and phone no
 * A method: displayBankDetails():void
 * This method prints bankName, area and phone no
 */

class Bank{

    String bankName;
    String area;
    String phone_no;

    public Bank(String bankName, String area, String phone_no){
        this.bankName = bankName;
        this.area = area;
        this.phone_no = phone_no;
    }

    public void displayBankDetails(){
        System.out.println("Bank Name : " + bankName );
        System.out.println("Area : " + area );
        System.out.println("Phone no : " + phone_no );
    }
}

public class ConceptConstructor {

    public static void main(String[] args) {

        Bank b1 = new Bank("SBI","Chandni Chowk","9900000");

        b1.displayBankDetails();
    }


}
