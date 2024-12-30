package Stack;

// We are implementing stack using linked list

public class StackUsingLL {

    class Node{

        int data;
        Node next;


        Node(int data){
            this.data = data;
        }

    }

    Node head;

    // push -> internally implements addAtHead();
    public void push(int x){

        Node nn = new Node(x);
        nn.next = this.head;
        this.head = nn;


    };


    //pop -> internally implements removeFirst();
    public int pop(){

        if (this.head == null){
            System.out.println("Stack is already empty");
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
