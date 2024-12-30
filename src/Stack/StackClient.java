package Stack;

public class StackClient {


    public static void main(String[] args) {

        StackUsingLL stack = new StackUsingLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        stack.display();
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.display();
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());


    }


}
