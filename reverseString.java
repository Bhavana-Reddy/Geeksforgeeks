import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class reverseString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the String : ");
		String str = br.readLine();
		Stack<Character> stack = new Stack<Character>();
		char[] k=str.toCharArray();
		for(char t:k) {
			//System.out.println("the element to be pushed is"+t);
			stack.push(t);
		}
		String output = "";
		for(char t:k) {
			t=stack.pop();
			System.out.println("the element to be poped is  "+t);
			output=output+t;
			System.out.println("the reversed string is  "+output);
		}
		
		
	}

}
