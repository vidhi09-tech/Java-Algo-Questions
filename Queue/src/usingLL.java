
// LinkedList node to store a queue entry
class QNode{
	int data;
	QNode next;
	
//	Constructor to create a linked list node
	public QNode(int data) {
		this.data=data;
		this.next=null;
	}
}


class Queue{
	QNode front,rear;
	
	public Queue() {
		this.front = this.rear = null;
	}
	
	void enqueue(int data) {
		
		// Create a newNode
		QNode temp = new QNode(data);
		
		// If queue is empty, then new node is front and rear both
		if(this.rear==null) {
			this.front=this.rear=temp;
			return;
		}
		
		// Add the newNode at the end of queue and change the rear pointer
		// Current node's next is pointing to the next node
		this.rear.next=temp;
		// Rear is pointing to the next node		
		this.rear=temp;
	}
	
	void dequeue() {
		if(this.front==null)
			return;
		
		//Store the previous front and move front one node ahead
		QNode temp = this.front;
		this.front=this.front.next;
		
		// if front becomes null, then change the rear also as Null
		if(this.front==null)
			this.rear=null;
		
	}
}


public class usingLL{
	public static void main(String[]args) {
		Queue q = new Queue();
		
		q.enqueue(1);
		q.enqueue(2);
		q.dequeue();
		
		System.out.println("Queue Front :"+q.front.data);
		System.out.println("Queue Back :"+q.rear.data);
		
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.dequeue();
		
		System.out.println("Queue Front :"+q.front.data);
		System.out.println("Queue Back :"+q.rear.data);
	}
}