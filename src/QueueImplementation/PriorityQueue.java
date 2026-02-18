package QueueImplementation;

public class PriorityQueue {
	
	int max = 6;
	int []arr = new int[max];
	
	int size = 0;
	
	//Enqueue -add elements
	void enqueue(int value) {
		arr[size] = value;
		size++;
	}

	
	//Dequeue - remove smallest one from the least
	int dequeue() {
		int minIndex = 0;
		for(int i = 1;i < size; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		int min = arr[minIndex];
		arr[minIndex] = arr[size - 1]; //Replace the last one
		size--;
		return min;
	}
	
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.enqueue(30);
		pq.enqueue(10);
		pq.enqueue(50);
		pq.enqueue(5);
		
		System.out.println(pq.dequeue() + " ");
		System.out.println(pq.dequeue() + " ");
		System.out.println(pq.dequeue() + " ");
	}
}
