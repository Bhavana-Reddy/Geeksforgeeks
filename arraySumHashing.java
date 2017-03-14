import java.util.HashMap;
import java.util.Scanner;


public class arraySumHashing {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter the number of elementsin the given set : ");
		int numberofElements=input.nextInt();
		
		HashMap<Integer,Integer > hm = new HashMap<Integer, Integer>();
		
		int [] array = new int[numberofElements];
		System.out.println(" enter the array elements : ");
		//waiting for user to give the array elements
		for(int i=0;i<array.length;i++){
			array[i]= input.nextInt();
			hm.put(array[i],7);
		}
		System.out.println("enter the value of x : ");
		int x=input.nextInt();
		for(int i=0;i<numberofElements;i++ ){
			if(hm.containsKey(x-array[i])) {
				System.out.println("yes!! the element is found");
				return;
			}
			
		}
	}

}
