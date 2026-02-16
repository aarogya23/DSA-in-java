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

	    // Peek operation (see front element)
    void peek() {

        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Front element is: " + queue[front]);
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
		
		
	}

}
