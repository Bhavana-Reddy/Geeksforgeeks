import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class HashOdd {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//output on screen
		System.out.println("enter the number of elements : ");
		//int array_size=input.nextInt();
	
		HashMap<Integer,Integer > hm = new HashMap<Integer, Integer>();
		
		int numberofElements=input.nextInt();
		for(int i=0;i<numberofElements;i++ ){
			int k=input.nextInt();
				 if(hm.containsKey(k)) {
					 hm.put(k, hm.get(k)+1);
				 } else {
					 hm.put(k, 1) ;
				 }
			}
		 Set<Integer> keySet = hm.keySet();
		 for(int b:keySet) {
			 if(hm.get(b)%2!=0) {
				 System.out.println(hm.get(b)+" key is "+b);
				 return ;
			 }
		 }
		 
}
}
