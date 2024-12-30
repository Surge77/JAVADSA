package Academic.Two;
import java.util.*;

/**
 * Write a Java program that adds elements to a List. Use an Iterator to
 * traverse the list and print each element. Modify the program to
 * remove elements using the remove() method of the Iterator.
 */

public class IteratingUsingIterator {

    public static void main(String[] args) {

        //Create a list and add elements
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Kiwi");
        stringList.add("Papaya");
        stringList.add("blueberry");

        //Iterating over the list using iterator and print them
        System.out.println("Original list");
        Iterator<String> iterator = stringList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        //Remove a element from the list
        iterator = stringList.iterator(); //Re initialize the iterator
        while (iterator.hasNext()){
            String fruit = iterator.next();
            if (fruit.startsWith("B")){
                iterator.remove();
            }
        }

        System.out.println();
        //Print the modified list
        System.out.println("List after removal");
        for (String fruit : stringList){
            System.out.println(fruit);
        }

    }
}