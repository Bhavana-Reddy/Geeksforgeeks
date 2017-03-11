public class myStacktest {
	public static void main(String args[]) {
		myStack m = new myStack(10);
		m.push(2);
		m.push(4);
		m.push(6);
		System.out.println("checking whether the stack is empty or not"+m.isFull());
		System.out.println("the current size of stck is "+m.size());
		System.out.println("the element poped is " +m.pop());
		System.out.println("the peek element is "+m.peek());
		System.out.println("checking whether the stack is empty or not"+m.isEmpty());
		System.out.println("the element poped is " +m.pop());
		System.out.println("the element poped is " +m.pop());
		System.out.println("checking whether the stack is empty or not"+m.isEmpty());
	}
}
	
	class myStack {

		int size = 5;
		int array[] = new int [size];
		int top = -1;
		public myStack(int size) {
			this.size = size;
		}
	  

		public void push(int element){
		  top ++;
		  array[top] = element;
		}

		public int pop( ) { 
		  int ele = array[top];
		  top--;
		  return ele;
		}

		public int peek() {
			return array[top];
		}

		public boolean isEmpty() {
		  if(top==-1) {
			 return true;
			 } else {
			return false;
		  }
		}

		public boolean isFull() {
			if(top==size-1) {
			return true;
			} else {
			return false;
		   }
		 }  

		public int size() {
		   return (top+1);
		 }
		 
	 
	}

