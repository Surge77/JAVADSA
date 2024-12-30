package Stack.Problems;
import java.util.*;

// Infix to Postfix conversion
public class InfixToPostfix {

    public static void main(String[] args) {
        System.out.println(infixToPostfix("A+B*(C^D-E)"));
        System.out.println(infixToPostfix("A+B"));
    }

    public static int precedence(char c) {
        // Define the precedence levels
        if (c == '^') {
            return 3;
        } else if (c == '/' || c == '*') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean isOperand(char c) {
        // Return true if character is an operand (letter or digit)
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public static String infixToPostfix(String exp) {
        // Resultant postfix expression
        String postfix = "";

        // Stack to hold operators
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If the character is an operand, add it to the result
            if (isOperand(c)) {
                postfix += c;

            } else if (c == '(') {
                // If the character is '(', push it to the stack
                st.push(c);

            } else if (c == ')') {
                // If the character is ')', pop and output until '(' is found
                while (!st.isEmpty() && st.peek() != '(') {
                    postfix += st.pop();
                }
                st.pop(); // Pop the '('

            } else {
                // Operator encountered
                while (!st.isEmpty() && precedence(c) <= precedence(st.peek())) {
                    postfix += st.pop();
                }
                // Push current operator to stack after popping higher precedence ones
                st.push(c);
            }
        }

        // Pop all the operators left in the stack
        while (!st.isEmpty()) {
            postfix += st.pop();
        }

        return postfix;
    }
}
