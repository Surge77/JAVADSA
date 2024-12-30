package Stack.Problems;

import java.util.Stack;
import java.util.*;

public class EvaluateInfix {

    public static void main(String[] args) {

        // Test the infixExpression method with a sample expression.
        System.out.println(infixExpression("2*(5*(3+6))/5-2"));
    }

    // Method to evaluate an infix expression
    private static int infixExpression(String exp) {

        // Stack to store the operands (numbers)
        Stack<Integer> operands = new Stack<>();

        // Stack to store the operators (+, -, *, /, etc.)
        Stack<Character> operators = new Stack<>();

        // Loop through each character in the expression
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If the character is a digit, push it onto the operands stack
            if (Character.isDigit(c)) {
                operands.push(c - '0');  // Convert character to integer

                // If the character is '(', push it onto the operators stack
            } else if (c == '(') {
                operators.push(c);

                // If the character is ')', pop and evaluate the expression inside the parentheses
            } else if (c == ')') {

                // Perform operations until '(' is encountered
                while (!operators.isEmpty() && operators.peek() != '(') {
                    int op1 = operands.pop();
                    int op2 = operands.pop();

                    char operator = operators.pop();
                    int result = performOperation(op1, op2, operator);
                    operands.push(result);
                }
                // Pop '(' from the stack
                operators.pop();

                // If the character is an operator
            } else if (isOperator(c)) {

                // While there's an operator with higher or equal precedence on top of the stack, evaluate it
                while (!operators.isEmpty() && precedence(c) <= precedence(operators.peek())) {
                    int op1 = operands.pop();
                    int op2 = operands.pop();

                    char operator = operators.pop();
                    int result = performOperation(op1, op2, operator);
                    operands.push(result);
                }
                // Push the current operator onto the stack
                operators.push(c);
            }
        }

        // Perform the remaining operations in the stacks
        while (!operators.isEmpty()) {
            int op1 = operands.pop();
            int op2 = operands.pop();

            char operator = operators.pop();
            int result = performOperation(op1, op2, operator);
            operands.push(result);
        }

        // Return the final result
        return operands.pop();
    }

    // Method to perform a basic arithmetic operation between two operands
    private static int performOperation(int op1, int op2, char operator) {

        switch (operator) {
            case '+':
                return (op1 + op2);

            case '-':
                return (op1 - op2);

            case '*':
                return (op1 * op2);

            case '/':
                return (op1 / op2);
        }
        return 0;  // Default return if no operator is matched
    }

    // Method to define the precedence of operators
    public static int precedence(char c) {
        if (c == '^') {
            return 3;  // Exponentiation has the highest precedence
        } else if (c == '/' || c == '*') {
            return 2;  // Multiplication and division come next
        } else if (c == '+' || c == '-') {
            return 1;  // Addition and subtraction have the lowest precedence
        } else {
            return 0;  // Return 0 if the character is not an operator
        }
    }

    // Method to check if a character is an operator
    public static boolean isOperator(char x) {
        return (x == '+' || x == '-' || x == '/' || x == '*');
    }

}
