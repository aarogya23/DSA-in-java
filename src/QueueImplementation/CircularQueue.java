package QueueImplementation;

public class CircularQueue {
	
	int Max = 5;
	
	int []queue = new int[Max];
	
	int front = -1; //0
	
	int rear = -1;//4
	
	//Enqueue operation
	//adding the element from the rear
	
	void enqueue(int value) {
		if(front == (rear + 1) % Max) {
			
			System.out.println("Queue overflow");
			
			return;
			
		}
		
		if(front == -1) {
			front = 0;
		}
		
		rear = (rear + 1) % Max;
		
		queue[rear] = value;
		
		System.out.println("Element is inserted inside the queue" + value);
		
	}
	
	//Dequeue 
	//We remove the element from front
	
	void dequeue() {
		
		if(front == -1) {
			System.out.println("Queue Underflow");
			
			return;
		}
		
		System.out.println("Deleted element from the queue" + queue[front]);
		
		if(front == rear) {
			front = rear = -1;
		}
		
		else {
			front = (front + 1) % Max;
		}
		
		
	}
	
	//implementation of peek operation
	void peek() {
		if(front == -1) {
			System.out.println("Queue is empty");
		}
		else {
			System.out.println("Front elements is  " + queue[front]);
		}
	}
	
	//Now diaplaying the array i.e. circular queue elements
	void display(){
		if(front == -1) {
			
			System.out.println("Queue is empty");
			
			return;
		}
		
		System.out.println("Queue elements: ");
		
		//using while loop
		
		int i = front;
		
		while(true) {
			System.out.println(queue[i] + " ");
			
			if(i == rear)
				break;
			i = (i + 1) % Max;
		}
		
		System.out.println();
		
	}
	
	//similarly using for loop
		void displayusingfor() {
	if(front == -1) {
				
				System.out.println("Queue is empty");
				
				return;
			}
			
			System.out.println("Queue elements: ");
			
			//using while loop
			int count = (rear + Max - front) % Max + 1;
			
			for(int i = 0; i < count; i++) {
				System.out.println(queue[(front + i) % Max] + " ");
			}
			
			System.out.println();
			
		}
	
	public static void main(String[] args) {
		
		CircularQueue c1 = new CircularQueue();
		
		c1.enqueue(10);
		c1.enqueue(20);
		c1.enqueue(30);
		c1.enqueue(40);
		c1.enqueue(50);
		
		
		
		c1.dequeue();
		c1.dequeue();
		
		c1.display();
		c1.peek();
		
	}

}
