import java.io.*;
import java.util.*;

public class paranthesis {
	public static void main(String[] args) throws IOException {

		String str = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the paranthesised expression : ");
		str = br.readLine();
		System.out.println(" the paran expression is : " + str);
		char[] k = str.toCharArray();

		// System.out.println(k);
		// System.out.println(k.length);
		Stack<Character> stack = new Stack<Character>();

		for (char t : k) {
			
			// System.out.println(t);
			if (t == '[' || t == '(' || t == '{') {
				stack.push(t);
			}
			// System.out.println(stack.peek());
			else if (t == ']' || t == ')' || t == '}') {
				if (t == ')' && stack.peek() == '(') {
					System.out.println(stack.pop());
				} else if (t == ']' && stack.peek() == '[') {
					System.out.println(stack.pop());
				} else if (t == '}' && stack.peek() == '{') {
					System.out.println(stack.pop());
				}
				// System.out.println("matched paranthesies");
				// stack.pop();	
			}
		}
		if (stack.isEmpty())
			System.out.println("the expression is paranthesised");
		else 
			System.out.println("the expression is not paranthesised...invalid.");
		// if(stack.peek()==stack.pop()){
		// System.out.println("the expression is paranthesised");
		// }
	}
}

