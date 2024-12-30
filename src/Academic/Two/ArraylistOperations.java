package Academic.Two;
import java.util.*;

/**
 * Write a program that creates an ArrayList of integers. Implement
 * methods to add elements, remove elements by index, and search for
 * a specific element in the list. Demonstrate the use of size(), add(),
 * remove(), and contains() methods.
 */

public class ArraylistOperations {

    public static void main(String[] args) {

        ArrayList<Integer> integerList = new ArrayList<>();
        Scanner inp = new Scanner(System.in);

        //Taking input from the user
        for (int i = 0; i < 5 ; i++){
            System.out.println("Enter number "+ (i+1) + ":");
            int number = inp.nextInt();
            addElement(integerList,number);
        }

        //Prints the size of the arraylist
        System.out.println("The size of the list is: "+ integerList.size());

        //Remove element

        System.out.println("Enter the index of the element to remove: ");
        int indextoRemove = inp.nextInt();
        removeElement(integerList,indextoRemove);

        //Search element
        System.out.println("Enter the element to search: ");
        int num = inp.nextInt();
        SearchElement(integerList,num);


        //Final state of the list
        System.out.println("The final state of the list: " + integerList);


    }

    private static void SearchElement(ArrayList<Integer> integerList, int num) {

        if (integerList.contains(num)){
            System.out.println("Element "+ num + "is present in list");
        }else{
            System.out.println("Element not present in the list");
        }

    }

    private static void removeElement(ArrayList<Integer> integerList, int indextoRemove) {

        if (indextoRemove >= 0 && indextoRemove < integerList.size() ){
            int removedElement = integerList.remove(indextoRemove);
            System.out.println("Element " + integerList.get(indextoRemove) + "removed from the list");
        }else{
            System.out.println("Error index out of bounds");
        }
    }

    private static void addElement(ArrayList<Integer> integerList, int number) {

        integerList.add(number);
        System.out.println("Added " + number + "to the list");
    }


}
