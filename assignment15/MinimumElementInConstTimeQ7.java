package in.ineuron.assignment15;

import java.util.*;

class MinStack {
	Stack<Integer> stack;
	Stack<Integer> minStack;

	public MinStack() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int val) {
		stack.push(val);

		if (minStack.isEmpty() || val <= minStack.peek()) {
			minStack.push(val);
		}
	}

	public void pop() {
		if (stack.isEmpty()) {
			throw new EmptyStackException();
		}

		int val = stack.pop();

		if (val == minStack.peek()) {
			minStack.pop();
		}
	}

	public int top() {
		if (stack.isEmpty()) {
			throw new EmptyStackException();
		}

		return stack.peek();
	}

	public int getMin() {
		if (minStack.isEmpty()) {
			throw new EmptyStackException();
		}

		return minStack.peek();
	}
}

public class MinimumElementInConstTimeQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack minStack = new MinStack();
		minStack.push(3);
		minStack.push(5);
		minStack.push(2);
		minStack.push(1);

		System.out.println("Top element: " + minStack.top());
		System.out.println("Minimum element: " + minStack.getMin());

		minStack.pop();
		minStack.pop();

		System.out.println("Top element: " + minStack.top());
		System.out.println("Minimum element: " + minStack.getMin());

	}

}
