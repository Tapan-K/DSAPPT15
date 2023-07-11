package in.ineuron.assignment15;

import java.util.*;

class StackUsingQueues {
	Queue<Integer> q1;
	Queue<Integer> q2;

	public StackUsingQueues() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}

	public void push(int x) {
		// Move all elements from q1 to q2
		while (!q1.isEmpty()) {
			q2.add(q1.poll());
		}

		// Add the new element to q1
		q1.add(x);

		// Move all elements back from q2 to q1
		while (!q2.isEmpty()) {
			q1.add(q2.poll());
		}
	}

	public int pop() {
		if (q1.isEmpty()) {
			throw new EmptyStackException();
		}
		return q1.poll();
	}
}

public class StackUsingQueuesQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingQueues stack = new StackUsingQueues();
		stack.push(2);
		stack.push(3);
		System.out.print(stack.pop() + " ");
		stack.push(4);
		System.out.println(stack.pop());
	}

}
