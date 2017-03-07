import java.util.Scanner;
import java.util.Stack;
public class ngeusingstack {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the elements in array: ");
	int n= scan.nextInt();
	int a[] = new int[n];
	System.out.println("enter the array elements : ");
	for(int i=0;i<n;i++){
		a[i]=scan.nextInt();
	}
	int element,next;
	Stack<Integer> s = new Stack<Integer>();//creating stack
	 s.push(a[0]);//pushing first element
	for (int i=1;i<n;i++){
		 next=a[i];// next element is the current element in array
		if(!s.empty()){
			 element=s.pop();
			System.out.println("element is : "+element+"  and next is "+next);
			while(element<next) {// comparing stack element and other elements
				//element=s.pop();
				System.out.println(element+"--->"+next);
				if(s.empty())
					break;
				element=s.pop();
			}
			if(element>next){
				s.push(element);
			}
			s.push(next);
			
		}
	}
		while(!s.empty()){
			 element=s.pop();
			next=-1;
			System.out.println(element+"----->"+next);
		}
	}
	
}


