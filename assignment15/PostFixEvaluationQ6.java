package in.ineuron.assignment15;

import java.util.*;

class Solution1 {
    public int evaluatePostfix(String expression) {
        if (expression == null || expression.length() == 0) {
            throw new IllegalArgumentException("Invalid expression");
        }

        Stack<Integer> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                // If the character is a digit, push it onto the stack
                stack.push(c - '0');
            } else {
                // If the character is an operator, pop the top two operands from the stack
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                // Perform the operation based on the operator
                int result = performOperation(operand1, operand2, c);

                // Push the result back onto the stack
                stack.push(result);
            }
        }

        // The final result will be the only element remaining on the stack
        return stack.pop();
    }

    private int performOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}

public class PostFixEvaluationQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression = "82+5*9+";

        Solution1 solution = new Solution1();
        int result = solution.evaluatePostfix(expression);

        System.out.println("Expression: " + expression);
        System.out.println("Result: " + result);

	}

}
