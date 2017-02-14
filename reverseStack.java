import java.util.*;

class reverseStack {

	public static void main(String args[]) {

		Stack<Integer> s = new Stack<Integer>();
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		System.out.println(s);
		reverse(s);
		System.out.println(s);
	}

	public static void reverse(Stack<Integer> s) {

		if (!s.isEmpty()) {
			int top = s.pop();
			reverse(s);
			insertAtBottom(s, top);
			return;
		}

	}

	public static void insertAtBottom(Stack<Integer> s, Integer i) {
		if (s.isEmpty()) {

			s.push(i);

			return;

		} else {
			int up = s.pop();

			insertAtBottom(s, i);

			s.push(up);
			return;
		}

	}

}
