package Queue;

//Queue implementation using Linked list

public class QueueUsingLL {

    class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    Node head;
    Node tail;

    // internally implements addLast() -> O(1)
    public void enqueue(int x){

        Node nn = new Node(x);
        //Condition for if queue is empty
        //The logic when we add the first elements have to be different
        if (this.tail == null){
            this.head = this.tail = nn;
            return;
        }

        //condition if queue has elements
        tail.next = nn;
        this.tail = nn;
    }

    // Implements internally removeFirst() -> O(1)
    public int dequeue(){

        if (this.head == null){
            System.out.println("Queue is already empty");
            return -1;
        }

        //rv -> removed value
        int rv = this.head.data;
        this.head = this.head.next;

        return rv;
    }

    public void display(){

        System.out.println("---------------------------------------");
        Node temp = this.head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("---------------------------------------");
    }

    public boolean isEmpty(){

        return head == null;
    }

    public int peek(){

        if (this.head == null){
            System.out.println("Stack is already empty");
            return -1;
        }

        //rv -> removed value
        //This is the same function as pop just we return the head value
        int top = this.head.data;

        return top;

    }
}
