package LinkedList;

public class Doubly_LL {

    class Node {

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

    Node head;

    //inserts a node at the start of the doublyLL
    public void insertFront(int data) {

        //Create a new node and allocate data into it.
        Node newNode = new Node(data);

        newNode.next = head;

        //this is just an additional step for DoublyLL
        if (head != null) {
            head.prev = newNode;
        }

        //head starts pointing to the new node
        head = newNode;
    }

    //inserting a node at the end
    public void insertEnd(int data) {

        //If the list is empty it doesn't matter if we add at front or end it will be the same
        if (head == null) {
            insertFront(data);
            return;
        }

        //create a new node
        Node newNode = new Node(data);


        Node temp = head;
        //take the temp pointer to the very last node of the LL
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode; //attaching the last node of LL to the new node
        newNode.prev = temp; // We set the prev of newNode to the last node of the list

    }

    //inserting a node at a specific index
    public void insertAtIdx(int data, int index) {

        // Case 1: Inserting at the front (index 0)
        if (index == 0) {
            insertFront(data);
            return;
        }

        // Create the new node to be inserted
        Node newNode = new Node(data);

        Node temp = head;  // temp will stop at the node just before the desired index
        Node forward = head.next;  // forward will point to the node at the desired index

        // Traverse the list until `temp` is the node just before the index
        for (int i = 1; i < index; i++) {
            if (forward == null) {  // If forward becomes null, index is out of bounds
                System.out.println("Index out of bounds");
                return;
            }
            temp = forward;         // Move temp to the next node
            forward = forward.next; // Move forward to the next node
        }

        // Inserting the new node at the desired index:
        temp.next = newNode;      // temp's next now points to newNode
        newNode.prev = temp;      // newNode's prev now points to temp

        newNode.next = forward;   // newNode's next now points to forward (node at index)

        // If forward isn't null, update its prev to point to newNode
        if (forward != null) {
            forward.prev = newNode;
        }
    }

    //Function to print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //Removal operations on Doubly LL

    //removes node from the start
    public int removeFirst(){

        //If the LL is empty nothing to return
        if(this.head == null){
            return -1;
        }

        int rv = this.head.data;
        this.head = this.head.next;
        this.head.prev = null;

        return rv;
    }

    public int removeLast(){

        Node temp = this.head;

        //It stops at the second last node
        while(temp.next.next != null){
            temp = temp.next;
        }

        int rv = temp.next.data; //accessing the data of last node
        temp.next = null;

        return rv;
    }

    public int removeAtIdx(int index){

        if(index < 0){
            return -1;
        }

        if(index == 0){
            return removeFirst();
        }

        Node temp = this.head;

        for(int i=0; i< index - 1; i++){
            temp = temp.next;
        }

        int rv = temp.next.data;

        temp.next = temp.next.next;

        Node forward = temp.next;
        forward.prev = temp;

        return rv;
    }




}