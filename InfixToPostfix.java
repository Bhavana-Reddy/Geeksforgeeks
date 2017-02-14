/* converting infix expression to postfix expresion in java*/
import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.lang.Iterable;
public class InfixToPostfix {
	static int prec(char op) {
		if(op=='+'||op=='-') 
			return 1;
		else if(op=='*'||op=='/')
			return 2;
		else if(op=='^')
			return 3;
		else 
			return 0;
		}
	 static String infixToPostfix(String infix){
		String postfix="";
		Stack<Character> stack = new Stack<Character>();
		char[] k=infix.toCharArray();
		System.out.println(k.length);
		for(char t:k) {
			//System.out.println(t);
			if(t>='a'&&t<='z') {
				//System.out.println("log 1 "+t);
				postfix=postfix+t;
			} //end of if
			else if(t==')') {
				//System.out.println("log 2 "+t);
				while(t!='(') {
				  postfix = postfix + stack.pop();	
				}
			 stack.pop();
			}
			else {
				//System.out.println("log 3 "+t);
				while( !stack.isEmpty() &&  prec(stack.peek())<prec(t)) {
			        stack.push(t);
				}
				 while( !stack.isEmpty() && (prec(stack.peek())>=prec(t))) {
						  postfix = postfix + stack.pop();
				 }
				 if(stack.isEmpty()) {
					 stack.push(t);
				 }
				 else if (prec(stack.peek())<prec(t)) {
				        stack.push(t);
				 }
				 
		}
	}
	while(!stack.isEmpty()) {
		postfix = postfix + stack.pop();
	}
		return postfix;
	}

		public static void main(String args[])throws IOException {
			String infix;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the infix expression : ");
	        infix = br.readLine();
			System.out.println("The expression in postfix is:" + infixToPostfix(infix));
		}


}

	
					   
		   
