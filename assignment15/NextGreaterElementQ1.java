package in.ineuron.assignment15;

import java.util.*;

class Solution {
	public int[] nextGreaterElements(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		Arrays.fill(result, -1); // Initialize result array with -1

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < 2 * n; i++) {
			int num = nums[i % n];

			while (!stack.isEmpty() && nums[stack.peek()] < num) {
				result[stack.pop()] = num;
			}

			if (i < n) {
				stack.push(i);
			}
		}

		return result;
	}
}

public class NextGreaterElementQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 5, 2, 25, 10, 8 };

		Solution solution = new Solution();
		int[] result = solution.nextGreaterElements(nums);

		// Print the resulting array
		for (int num : result) {
			System.out.print(num + " ");
		}
		System.out.println();

	}

}
