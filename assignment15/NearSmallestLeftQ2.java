package in.ineuron.assignment15;

import java.util.*;

class SolutionNum {
	public int[] nearestSmallerToLeft(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		Arrays.fill(result, -1); // Initialize result array with -1

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && stack.peek() >= arr[i]) {
				stack.pop();
			}

			if (!stack.isEmpty()) {
				result[i] = stack.peek();
			}

			stack.push(arr[i]);
		}

		return result;
	}
}

public class NearSmallestLeftQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 6, 2 };

		SolutionNum solution = new SolutionNum();
		int[] result = solution.nearestSmallerToLeft(arr);

		// Print the resulting array
		for (int num : result) {
			System.out.print(num + " ");
		}
		System.out.println();

	}

}
