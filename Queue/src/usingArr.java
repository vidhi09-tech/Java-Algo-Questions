
public class usingArr {
	private static int front,rear,n=20;
	private static int queue[];
	
	
	usingArr(){
		queue=new int[n];
		front=rear=-1;
	}
	
	static void push(int data) {
		if(rear==n-1) {
			System.out.println("Queue Overflow");
			return;
		}
		rear++;
		queue[rear]=data;
		
		if(front==-1)
			front++;
	}
	
	static void pop() {
		if(front==-1 || front>rear) {
			System.out.println("Queue is already empty");
			return;
		}
		front++;
	}
	
	static int peek() {
		if(front==-1 || front>rear) {
			System.out.println("Queue is already empty");
			return -1;
		}
		return queue[front];
	}
	
	static boolean isEmpty() {
		if(front==1 || front>rear)
			return true;
		return false;
	}

	public static void main(String[] args) {
		usingArr q = new usingArr();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		
		System.out.println("The top element of the Queue is "+q.peek());
		
		q.pop();
		
		System.out.println("The top element of the Queue is "+q.peek());
		
	}

}
