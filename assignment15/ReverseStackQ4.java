package in.ineuron.assignment15;
import java.util.*;

class StackReverse {
    public void reverseStack(Stack<Integer> st) {
        if (st.isEmpty() || st.size() == 1) {
            return;
        }

        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st, top);
    }

    private void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);
    }
}

public class ReverseStackQ4 {

	public static void main(String[] args) {
		// Question 4
		Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(3);
        st.push(9);
        st.push(6);

        StackReverse stackReverse = new StackReverse();
        stackReverse.reverseStack(st);

        System.out.print("Reversed Stack: ");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();

	}

}
