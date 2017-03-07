import java.util.*;
public class stackUsingQueues {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of  element to be pushed");
		int n= scan.nextInt();
		System.out.println("enter the element to be pushed");
		for(int i=0;i<n;i++){
			System.out.println("log i"+i);
			System.out.println("log n"+n);
			 push(scan.nextInt()); 
		}
		System.out.println(pop());
	}
	private static int pop() {
		return q1.remove();
	}
	static Queue<Integer> q1 = new LinkedList<Integer>();
	static Queue<Integer> q2 = new LinkedList<Integer>();
	static Queue<Integer> q3 = null;
	private static void push(int x) {
		System.out.println("log1"+x);
		q2.add(x);
		System.out.println("log 2"+" q1 has "+ q1 +" q2 has "+ q2);
		while(!(q1.isEmpty())){
		         q2.add(q1.remove());
		         System.out.println("log3"+"  q1 has "+ q1 +" q2 has "+ q2);
			}
			    q3=q1;
			    q1=q2;
			   q2=q3;
			  System.out.println("log4 "+" q1 has "+ q1 +" q2 has "+ q2);
		        
	}

}


























