package Academic.Final.Java_Collections;
import java.util.*;

/**
 * Write a menu driven Java program to make use of HashMap to do following
 * operations.
 * 1. Add item
 * 2. Remove item
 * 3. Display
 * 4. Exit
 */

public class HashmapMenu {

    public static void main(String[] args) {

        HashMap<String,String> itemMap = new HashMap<>();
        Scanner inp = new Scanner(System.in);
        int choice;

        System.out.println("Choose an operation");
        System.out.println("\nMenu: ");
        System.out.println("1. Add item (Key-value) pair: ");
        System.out.println("2. Remove item (Enter the key) :");
        System.out.println("3. Display");
        System.out.println("4. Exit");

        while(true){

            System.out.print("Enter your choice (1-4)");
            choice = inp.nextInt();

            switch (choice){

                case 1:
                    System.out.print("Enter the key : ");
                    String keyToadd = inp.next();
                    System.out.print("Enter the value: ");
                    String value = inp.next();
                    itemMap.put(keyToadd,value);
                    System.out.println("Item added: " + keyToadd + " --> " + value);
                    break;

                case 2:

                    System.out.println("Enter the key of the element to remove: ");
                    String keyToremove = inp.next();

                    if (itemMap.remove(keyToremove) != null){
                        System.out.println("Item removed : " + keyToremove);
                    }else{
                        System.out.println("Item not found");
                    }
                    break;

                case 3:
                    System.out.println("Items in hashmap are: ");
                    for (String key : itemMap.keySet()){
                        System.out.println(key + " --> " + itemMap.get(key));
                    }
                    break;

                case 4:
                    System.out.println("Exiting..");
                    break;

                default:
                    System.out.println("Enter a valid choice");


            }
        }

    }
}
