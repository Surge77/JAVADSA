package Queue;

public class QueueClient {

    public static void main(String[] args) {

        QueueUsingLL queue = new QueueUsingLL();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.dequeue());
        queue.display();
        queue.enqueue(60);
        System.out.println(queue.peek());
    }
}
