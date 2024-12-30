package LinkedList;

public class LinkedList {

    class Node{

        int data;
        Node next;


        Node(int data){
            this.data = data;
        }

    }
    Node head; //Node pointing to the head of the list


    //This is the traversal or display operation
    public void display(){

        System.out.println("---------------------------------");

        Node temp = this.head;

        while (temp != null ){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("----------------------------------");
    }


    //Insertion operation
    public void AddFirst(int data){

        Node newnode =  new Node(data); //Creating a new node
        newnode.next = this.head; // Assigning the memory address of previous head to newly created node
        this.head = newnode; // updating the head pointer

    }

    public void AddLast(int data){

        //To check if linked list is empty or not
        if (this.head == null){
            AddFirst(data);
            return;
        }

        Node newnode = new Node(data);
        Node temp = this.head;

        //We traverse to the last node of the linkedlist
        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = newnode; //The next part of new node is set to null


    }

    public void Addat(int data, int idx){

        if (idx < 0){
            return;
        }

        if (idx == 0 ){
            AddFirst(data);
            return;
        }

        Node newnode = new Node(data);
        Node temp = this.head;

        for (int i = 0; i < idx - 1; i++){
            temp = temp.next;
        }

        Node forward = temp.next;
        //Here, forward is set to temp.next, which means forward now points to the node that is currently at index idx (the one that comes after temp).

        temp.next = newnode; //The next pointer of the temp node (the node at index idx - 1) is updated to point to the new node (newnode).
        newnode.next = forward; //Finally, the next pointer of the new node is set to point to the forward node (the original node at index idx). This effectively inserts the new node into the list at the desired position.


    }

    public int removeFirst(){

        //Check if list is empty
        if (this.head == null){
            return -1;
        }

        int remove_value = this.head.data;
        this.head = this.head.next;

        return remove_value;
    }

    public int removeLast(){

        Node temp = this.head;

        //The unique property about the second last element of list
        while (temp.next.next != null){
            temp = temp.next;
        }

        int remove_value = temp.next.data;
        temp.next = null;

        return remove_value;
    }

    public int removeAt(int idx){

        //check if number is negative
        if (idx < 0){
            return -1 ;
        }

        //If we try to remove first node
        if(idx == 0){
            return removeFirst();
        }

        Node temp = this.head;

        for (int i=0; i < idx - 1; i++){
            temp = temp.next;
        }

        int remove_value = temp.next.data;

        temp.next = temp.next.next;

        return remove_value;

    }


}
