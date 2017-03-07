import java.util.Scanner;
public class stockSpanFinal {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter number of elements in array:");
		int n= s.nextInt();
		System.out.println("enter the elements of array");
		int a[]= new int[n];
		for(int i=0;i<n;i++){
			 a[i]= s.nextInt();	
		}
		//for(int i=0;i<n;i++){
		//	 System.out.println(a[i]);
		//}
		//System.out.println("the span values correspondingly are : ");
		int span[]= new int[n];//span array corresponding to given array
		span[0]=1;
		for(int i=1;i<n;i++){
			span[i]=1;
			for(int j=i-1;j>=0;j--){
				//System.out.println(i+"  "+j);
				if(a[i]>=a[j]){
					span[i]++;
				}
				else if(a[i]<a[j]){
					break;
			}
			
		}//for
		}
		for(int i=0;i<n;i++){
		System.out.println(span[i]);
		}
	}
	}


