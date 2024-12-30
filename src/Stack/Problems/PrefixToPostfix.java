package Stack.Problems;
import java.util.*;

//Prefix to postfix expression conversion
//The stack this time will store the operands instead of operators

/***
 * Algorithm:
 * Reverse the prefix string
 * Create a stack
 * For each character iterating
 *     - c == operand push to stack
 *     - c == operator we take out two operands from stack and apply the operator and push the entire string to stack
 */

public class PrefixToPostfix {

    public static void main(String[] args) {

        // Test the PrefixToPostfix method with a sample prefix expression
        System.out.println(PrefixToPostfix("*+AB-CD"));
    }

    // Method to check if a given character is an operator (+, -, *, /)
    public static boolean isOperator(char x) {

        // If the character is one of these operators, return true
        if (x == '+' || x == '-' || x == '/' || x == '*') {
            return true;
        }
        return false;
    }

    // Method to convert a Prefix expression to a Postfix expression
    public static String PrefixToPostfix(String str) {

        // Reverse the prefix expression because prefix expressions are read from right to left
        StringBuilder reversedStr = new StringBuilder(str);
        reversedStr.reverse();

        // Stack to store intermediate results during conversion
        Stack<String> s = new Stack<>();

        // Traverse the reversed prefix expression from left to right
        for (int i = 0; i < str.length(); i++) {

            // If the current character is an operator
            if (isOperator(reversedStr.charAt(i))) {

                // Pop two operands from the stack
                String op1 = s.pop();
                String op2 = s.pop();

                // Combine operands and operator in Postfix order (op1 + op2 + operator)
                String temp = op1 + op2 + reversedStr.charAt(i);

                // Push the resulting string back onto the stack
                s.push(temp);

            } else {
                // If the character is an operand (A, B, C, etc.), push it onto the stack
                // Convert the character to a string and push
                s.push(Character.toString(reversedStr.charAt(i)));
            }
        }

        // The final result on the stack will be the Postfix expression, return it
        return s.pop();
    }
}
