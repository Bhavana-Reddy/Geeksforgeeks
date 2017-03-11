import java.util.*;
public class sortStack {
public static void main(String[] args) {
	Stack<Integer> s = new Stack<Integer>();
	s.push(-3);
	s.push(14);
	s.push(18);
	s.push(-5);
	s.push(30);
	System.out.println(s);
	sortStack(s);
	System.out.println(s);
}
public static void sortStack(Stack<Integer> s) {
	if(!s.empty()){
		int temp=s.pop();
		sortStack(s);
		sortInsert(s,temp);
	}
}
public static void sortInsert(Stack<Integer> s, int element) {
	if(s.empty()||element<s.peek()){
		s.push(element);
		return;
	}
	else{
		int top= s.pop();
		sortInsert(s,element);
		s.push(top);
	}
}
}
