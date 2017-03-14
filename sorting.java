

import java.util.*;

class sorting{
public static void main(String[] args){
              
	Scanner s=new Scanner(System.in);
		
	System.out.println("enter the array size :");
	int a=s.nextInt();
		
	int [] arr = new int[a];
	System.out.println("enter the elements :");
		 for(int c=0;c<arr.length;c++)
			 arr[c]=s.nextInt();
			 
			System.out.println("enter the value of x : ");
				 int x=s.nextInt();
				 
				int  g = element(arr,0,a-1,x);
		
				
	}
		     
static int  element(int arr[],int low,int high,int x){
		
			   int 	i,j;
               i = low;
               j = high;

                 
                 
                     while(i<j)
						{
						while(arr[i]+arr[j]<x)
							{
								i++;
							}

						while(arr[i]+arr[j]>x)
							{
								j--;
							}
						}
					if(arr[i]+arr[j]==x) {
						System.out.println("element found");
						return 1;
					}
				return 0;
			}
	  }
