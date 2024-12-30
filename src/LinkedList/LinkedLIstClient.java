package LinkedList;

public class LinkedLIstClient {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.AddFirst(10);
        ll.display();
        ll.AddFirst(20);
        ll.display();
        ll.AddFirst(30);
        ll.display();
        ll.AddFirst(40);
        ll.display();            // 40 30 20 10
        ll.AddLast(100);
        ll.display();           // 40 30 20 10 100
        ll.AddLast(200);
        ll.display();           // 40 30 20 10 100 200
        ll.AddLast(300);
        ll.display();           // 40 30 20 10 100 200 300
        ll.Addat(290,3);
        ll.display();           // 40 30 20 290 10 100 200 300

        ll.removeFirst();
        ll.display();           // 30 20 290 10 100 200 300
        ll.removeLast();
        ll.display();           // 30 20 290 10 100 200
        ll.removeAt(3);
        ll.display();           // 30 20 290 100 200

    }
}
