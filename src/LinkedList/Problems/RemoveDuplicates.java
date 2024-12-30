package LinkedList.Problems;

//Problem: Remove duplicates from a sorted doubly linked list

// We traverse through the whole list with curr pointer, we compare the current data value to the next node value
// Then we delete it through the deleting logic

public class RemoveDuplicates {

    static class Node {

        int data;

        Node next;

        Node prev;

        //constructor
        //By default after creating a node the prev and the next pointer will be null
        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }


    public static void main(String[] args) {

        Node head = null;
        head = push(head,12);
        head = push(head,12);
        head = push(head,10);
        head = push(head,8);
        head = push(head,8);
        head = push(head,6);
        head = push(head,4);
        head = push(head,4);
        head = push(head,4);
        head = push(head,4);
        head = push(head,3);

        System.out.println("Original doubly linked list:");
        printList(head);

        //Remove duplicate nodes
        removeDuplicates(head);
        System.out.println("\nDoubly Linked list after removing duplicates");
        printList(head);
    }

    //Function to print the list
    public static void printList(Node head) {

        if(head == null){
            System.out.println("Doubly linked list is empty");
        }

        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node push(Node head,int data){

        //allocate node
        Node newNode = new Node(data);

        //link the odd list to the new node
        newNode.next = head;

        //change prev of head node to new node
        if (head != null){
            head.prev = newNode;
        }

        //update head to point to the new node
        head = newNode;
        return head;
    }

    public static void removeDuplicates(Node head){

        if(head == null || head.next == null){
            return;
        }

        Node current = head;

        while (current.next != null){
            if (current.data == current.next.data){
                //delete the node pointed by current.next
                deleteNode(current.next);
            }else{
                current = current.next;
            }
        }
    }

    /***
     * Delete node corner cases:

     * 1. Node pointing to null i.e empty list
     * 2. Node pointing to head i.e no prev
     * 3. Having a prev but not next i.e last node
     * 4. Have both prev and next
     */
    private static void deleteNode(Node del) {

        //If list is empty
        if (del == null){
            return;
        }

        //if the node to be deleted is the head node i.e doesn't have a prev pointer
        if (del.prev == null){
            del.next.prev = null;
            del = del.next;

        }else{
            //it means del is some middle node and not the last node
            if(del.next != null){
                del.next.prev = del.prev;
            }
            //del pointing to last node
            del.prev.next = del.next; //This is always be executed irrespective if its middle or head
            }
        }
    }


