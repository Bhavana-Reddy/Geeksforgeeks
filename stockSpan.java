import java.util.Stack;
public class stockSpan{
	public static void main(String[] args) {
		int price[]={100,80,60,70,60,75,85};
		for(int i=0;i<7;i++){
			System.out.print(" "+price[i]);
		}
		int[] span= new int[7];
		span[0]=1;
		Stack<Integer> s= new Stack<Integer>();
		s.push(0);
		for(int i=1;i<7;i++){
			while(!s.empty()&& price[i]>=price[s.peek()]){
				s.pop();
			}
			if(s.empty()){
				span[i]=i+1;
			}
			else{
				span[i]=i-s.peek();
				//s.push(i);
			}
		s.push(i);
		}
		System.out.println();
		System.out.println("spans are :");
		for(int i=0;i<7;i++){
		    System.out.print(" "+span[i]);
		}
}
}








