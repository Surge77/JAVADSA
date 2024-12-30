package Academic.Final.Java_Collections;
import java.util.*;

/**
 * /**
 *  * Write a menu-driven Java program to make use of HashSet to do following
 *  * operations.
 *  * 1. Add item
 *  * 2. Remove item
 *  * 3. Display
 *  * 4. Exit
 *  *
 *  * Info about HashSet:
 *  *
 *  * A HashSet is a collection in Java that is part of the Java Collections Framework.
 *  * It implements the Set interface and is backed by a hash table (actually a HashMap instance).
 *  * The HashSet does not allow duplicate elements, and the elements are stored in no particular order (i.e.,
 *  * it does not maintain the insertion order of elements).
 *  *
 *  * A HashSet can store objects of any type,
 *  * including primitive wrapper types (e.g., Integer, Double), String, custom objects (e.g., instances of your own classes), and null.
 *  */


public class HashSetMenu {

    public static void main(String[] args) {

        HashSet<String> itemset = new HashSet<>();
        Scanner inp = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\nMenu --> ");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            choice = inp.nextInt();
            inp.nextLine(); // consume newline character

            switch (choice){

                case 1:

                    System.out.print("Enter the item to add: ");
                    String ItemToAdd = inp.nextLine();

                    //true: If the element was not already in the set and was successfully added.
                    //false: If the element was already in the set (i.e., it's a duplicate)
                    if (itemset.add(ItemToAdd)){
                        System.out.println("Item added "+ ItemToAdd);
                    }else{
                        System.out.println("Item already present ");
                    }
                    break;

                case 2 :

                    System.out.println("Enter the item to remove: ");
                    String ItemToRemove = inp.nextLine();

                    if (itemset.remove(ItemToRemove)){
                        System.out.println("Item removed : " + ItemToRemove);
                    }else{
                        System.out.println("Item not found ");
                    }
                    break;

                case 3:

                    System.out.println("Items in the set: ");

                    //next() is another method of the Iterator interface.
                    //It retrieves the next element in the collection and moves the iterator forward.
                    //Important: Calling next() without checking hasNext() can throw a NoSuchElementException if there are no more elements left.
                    if (itemset.isEmpty()){
                        System.out.println("The set is empty nothing to display");
                    } else{
                        Iterator<String> iterator = itemset.iterator();
                        if (iterator.hasNext()){
                            System.out.println(iterator.next());
                        }
                    }

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Enter a valid choice!!");
            }
        } while (choice != 4);

        inp.close();
    }
}
