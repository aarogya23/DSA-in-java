package QueueImplementation;

public class PriorityQueueString {
	
	int max = 6;
	String [] arr = new String[max];
	int size = 0;
	
	//Enqueue
	void enqueue(String value) {
		if(size == max) {
			System.out.println("Queue us full");
			return;
		}
		arr[size] = value;
		size++;
	}
	
	//Dequeue(remove the element)
	String dequeue() {
		if(size == 0) {
			System.out.println("Queue is empty");
			return null;
		}
		
		int minIndex = 0;
		
		for(int i = 1; i< size; i++) {
			if(arr[i].compareTo(arr[minIndex]) < 0) {
				minIndex = i;
			}
			
		}
		String min = arr[minIndex];
		arr[minIndex] = arr[size - 1];
		size--;
		
		return min;
	}
	
	void display() {
		if(size == 0) {
			System.out.println("Queue is empty");
			return;
		}
		for(int i = 0; i< size; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		PriorityQueueString p1 = new PriorityQueueString();
		
		p1.enqueue("Ram");
		p1.enqueue("Shiva");
		p1.enqueue("Vishnu");
		p1.enqueue("Varma");
		p1.enqueue("Maheshsor");
		
		
		System.out.println(p1.dequeue());
		System.out.println(p1.dequeue());
		System.out.println(p1.dequeue());
		
		System.out.println("The element remain in the array are:");
		p1.display();
		
	}

}
