import java.util.*;
import java.io.*;
public class postfixEvaluation {
public static void main(String[] args) throws IOException {
	String postfix;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the postfix expression : ");
postfix = br.readLine();
System.out.println(postfix);
System.out.println(post(postfix));
}

 static int post(String postfix) {
	Stack<Integer> stack = new Stack<Integer>();
	char[] k=postfix.toCharArray();
	for(char t:k) {
		if(t==' ') {
			continue;
		}
		System.out.println("in for loop "+t);
		char ch= t;
		
		if(t>='0'&&t<='9') {
			System.out.println("log 1 "+t);
		     stack.push(Character.getNumericValue(t));
		     
     }//end of if
		else if(!stack.empty()){
			 int n1 = stack.pop();
             int n2 =  stack.pop();
            System.out.println(ch);
             switch(ch){
             case '+': 
            	 stack.push( (n2+n1));
            	 break;
			case '-': 
				stack.push((n2-n1));
				break;
			case '*': 
				stack.push((n2*n1));
				 break;
			case '/': 
				stack.push( (n2/n1));
				 break;
            default:
                 System.out.println("Invalid operator order!");
            }
		}
	}//end of for
	int res = stack.pop();
	return res;
	
}// end of postfix

private static char charAt(char t) {
	// TODO Auto-generated method stub
	return 0;
}
}//end of class






