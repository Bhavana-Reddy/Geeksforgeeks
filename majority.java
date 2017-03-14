        /*Majority Element: A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).*/
	/*Write a function which takes an array and emits the majority element (if it exists), otherwise prints NONE*/


import java.util.Scanner;
public class majority {
	public static void main(String[] args) {
		//scanner object
		Scanner input = new Scanner(System.in);
		//print on the output
		System.out.println("enter the size of array : ");
		
		int array_size = input.nextInt();
		//declaring an array
		int [] array = new int[array_size];
		System.out.println(" enter the array elements : ");
		//waiting for user to give the array elements
		for(int i=0;i<array.length;i++){
			array[i]= input.nextInt();
		}
		//count stores the value how many times the element got repeated
			int count=0,major_element=0;
			
			for(int i=0;i<array_size;i++){
				count=0;
				for(int j=0;j<array_size;j++){
					if(array[i]==array[j]){
						major_element = array[i];
						count++;
						
					//System.out.println(" the count is :"+count);
					}
				}
			}
			if(count>array_size/2){
				System.out.println("the majority element is found and the element is : "+major_element);
			}
			else
				System.out.println("NONE");
			
			
			}
		}
			
