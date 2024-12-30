package Stack.Problems;
import java.util.Stack;

public class EvaluatePostfix {

    public static void main(String[] args) {
        // Test the evaluateExpression method with a sample postfix expression.
        // The given expression "2536+**5/2-" represents the postfix equivalent of an arithmetic expression.
        System.out.println(evaluateExpression("2536+**5/2-"));
    }

    // Method to evaluate a postfix expression
    private static int evaluateExpression(String exp) {

        // Stack to store intermediate results during evaluation
        Stack<Integer> stack = new Stack<>();

        // Loop through each character in the postfix expression
        for (int i = 0; i < exp.length(); i++) {

            // Get the current character
            char c = exp.charAt(i);

            // If the character is a digit (operand)
            if (Character.isDigit(c)) {
                // Convert the character digit into an integer and push it onto the stack
                // 'c - '0'' converts character representation of a digit to its integer equivalent
                stack.push(c - '0');  // For example, '5' becomes 5

            } else {
                // If the character is an operator (+, -, *, /), pop two operands from the stack
                int op2 = stack.pop();  // Second operand
                int op1 = stack.pop();  // First operand

                // Perform the operation based on the operator and push the result back onto the stack
                switch (c) {
                    case '+':
                        stack.push(op1 + op2);  // Push the result of addition
                        break;

                    case '-':
                        stack.push(op1 - op2);  // Push the result of subtraction
                        break;

                    case '*':
                        stack.push(op1 * op2);  // Push the result of multiplication
                        break;

                    case '/':
                        stack.push(op1 / op2);  // Push the result of division
                        break;
                }
            }
        }

        // At the end of the evaluation, the stack will contain the final result of the postfix expression
        return stack.pop();  // Return the result
    }
}
