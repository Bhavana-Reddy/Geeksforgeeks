import java.util.Scanner;
public class ngeusingloops {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number of elements in array : ");
	int n = scan.nextInt();
	int a[]= new int[n];
	System.out.println("enter the elements in the array : ");
	for(int i=0;i<n;i++){
		a[i]= scan.nextInt();
	}
	/*for(int i=0;i<n;i++){
		System.out.println(a[i]);
	}*/
	for(int i=0;i<n;i++){
		int next = -1;
		for(int j=i+1;j<n;j++){
			if(a[j]>a[i]){
				next= a[j];
				break;
			}
		}
		System.out.println(a[i]+"---->"+next);
	}
	
}
}
