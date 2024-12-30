package LinkedList.Problems;

import java.util.*;

/***
 * Problem : Find pairs with given sum in doubly linked list
 *
 * Given a sorted doubly linked list of positive distinct elements, the task is to find pairs in a doubly linked list
 * whose sum is equal to given value x, without using any extra space
 *
 *
 * Input : head : 1 <-> 2 <-> 4 <-> 5 <-> 5 <-> 8 <-> 9 , x = 7
 *
 * Output : (6,1), (5,2)
 *
 * The expected time complexity is O(n) and auxiliary space is O(1).
 *
 * Given : Doubly Linked list
 *          sorted list
 *          Positive elements
 *          Distinct elements
 *
 *  The brute force approach is to pick a element and find the other pair sum number through the whole list.This would take complexity of O(n^2)
 *  In this approach we didn't make the use of the property that list is sorted
 *
 *  The second approach is using hashmap and store all the values into it then checking them
 *
 *  The make solution more optimized we use the two pointer approach
 *  We keep one pointer at the start and other at the end
 *  And we keep checking if the pair sum is equal to x or not if yes we increment the starting pointer and decrement the end pointer
 */

public class PairSumDoublyLL {

    static class Node {

        int data;

        Node next;

        Node prev;

    }

    public static void main(String[] args) {

        Node head = null;

        //Insert elements into the doubly linked list
        head = insert(head,9);
        head = insert(head,8);
        head = insert(head,6);
        head = insert(head,5);
        head = insert(head,4);
        head = insert(head,3);
        head = insert(head,2);

        int x = 7;

        //Find and print pairs with the given sum
        pairSum(head,x);

    }

    static void pairSum(Node head, int x){

        Node first = head;
        Node second = head;

        while(second.next != null){
            second = second.next;
        }

        boolean found = false;
        while (first != second && second.next != first){

            if ((first.data + second.data) == x){
                found = true;
                System.out.println("(" + first.data + ", " + second.data + ")");
                first = first.next;
                second = second.next;
            }else{
                if ((first.data + second.data) < x)
                    first = first.next;
                else
                    second = second.prev;
            }
        }

        if (!found){
            System.out.println("No pair found");
        }

    }

     static Node insert(Node head, int data){

        Node temp = new Node();
        temp.data = data;
        temp.next = temp.prev = null;
        if (head == null)
            head = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        return temp;
    }


}
