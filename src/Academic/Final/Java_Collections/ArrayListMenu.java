package Academic.Final.Java_Collections;
import java.util.*;

/**
 * Write a menu-driven Java program to make use of ArrayList to do following
 * operations.
 * 1. Add item
 * 2. Remove item
 * 3. Display
 * 4. Exit
 */

public class ArrayListMenu {

    public static void main(String[] args) {

        ArrayList<String> itemList = new ArrayList<>();
        Scanner inp = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\nMenu : ");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = inp.nextInt();
            inp.nextLine(); //consumes newline character


            switch (choice){

                case 1:
                    System.out.print("Enter the item to add: ");
                    String ItemToAdd = inp.nextLine();
                    itemList.add(ItemToAdd);
                    System.out.println("Item added : " + ItemToAdd);
                    break;

                case 2:
                    System.out.print("Enter the item to remove: ");
                    String ItemToRemove = inp.nextLine();

                    if (itemList.remove(ItemToRemove)){
                        System.out.println("Element removed : " + ItemToRemove);
                    }else{
                        System.out.println("Element not found");
                    }
                    break;

                case 3:
                    System.out.print("Elements in the list are : " + itemList);
                    break;

                case 4:
                    System.out.println("Exiting..");
                    break;

                default:
                    System.out.println("Enter a valid choice");
            }
        }while (choice != 4);
    }
}
