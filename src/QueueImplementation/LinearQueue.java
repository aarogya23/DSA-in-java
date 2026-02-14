package QueueImplementation;

public class LinearQueue {

	
	//lets set the max i.e. n
	
	int Max = 5;
	
	int [] queue = new int[Max];
	
	
	int []array = {1,2,3,4,5};
	
	int front = -1; // initial point
	int rear = -1; // this is the final index or point
	
	//We set the front and rear -1 because it will allow us to implement
	//the index from Zero
	//Enqueue Operation
	
	void enqueue(int value) {
		
		if(rear == Max-1) {
			System.out.println("Queue Overflow");
			
			return;
		}
		
		if(front == -1) //if the current position of the front is zero then we will increment
			//it into the 0 index
			front = 0;
		
		//we already set the value of front zero then we will
		//be able to add the value into the stack
		rear++;
		queue[rear] = value;
		System.out.println(value + " inserted into the queue");
	}
	
	
	//Dequeue process of removing the value
	
	void dequeue() {
		
		//Suppose the array have 0-4 index
		// the front index have 5 then we should not give the permission 
		//this means the Queue is underflow
		if(front == -1 || front > rear) {
			
			System.out.print("Queue underflow");
			return;
			
		}
		
		
		System.out.println(queue[front] + " deleted from the queueu");
		
		front++;
	}
	
	//Function which will do the peek operation
	
	void peek() {
		
		if(front == -1 || front > rear) {
			System.out.print("Queue is empty");
			
			return;
		}
		
		System.out.println("Front element is:" + queue[front]);
	}
	
	//display
	void display() {
		
		if(front == -1 || front > rear) {
			System.out.print("Queue is empty");
			
			return;
		}
		
		System.out.println("Queue elements");
		
		for(int i = front; i<=rear; i++) {
			System.out.println(queue[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		LinearQueue l1 = new LinearQueue();
		
		l1.enqueue(10);
		l1.enqueue(20);
		l1.enqueue(30);
		l1.enqueue(10);
		l1.enqueue(20);
	
		
		l1.dequeue();
		
		l1.enqueue(90);
		
		l1.peek();
		
		l1.display();
		
		
		
		
		
		
	}
	
}
