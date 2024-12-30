package Stack;

import java.util.Stack;

public class StackLibrary {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.pop());
        s.push(50);
        System.out.println(s.peek());
        s.isEmpty();
    }
}
