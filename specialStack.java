import java.util.*;

public class specialStack {
	public static void main(String[] args) {
		specialStack spl = new specialStack(5);
		spl.push(18);
		spl.push(19);
		spl.push(29);
		spl.push(15);
		spl.push(16);
		//System.out.println("the stack elements are : " + spl);
		System.out.println("the minimum element in the stack is : "
				+ getMin(spl));
		spl.pop();
		spl.pop();
		System.out.println("the minimum element in the stack is : "
				+ getMin(spl));
	}// main close
		// declaring the primary and secondary stacks

	Stack<Integer> primary = new Stack<Integer>();
		private int element;
	static Stack<Integer> secondary = new Stack<Integer>();

	public specialStack(int element) {
		this.element = element;
	}// constructor closed

	public void push(int i) {
		primary.push(i);
		if (secondary.empty()) {
			secondary.push(i);
		}
		// the loop (all elements)
		if (i < secondary.peek()) {
			secondary.push(i);
		} else if (i > secondary.peek()) {
			secondary.push(secondary.peek());
		}

	}// push completed

	public static int getMin(specialStack spl) {
		return secondary.peek();
	}

	public void pop() {
		secondary.pop();
		primary.pop();
	}
}
