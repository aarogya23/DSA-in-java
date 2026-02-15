package QueueImplementation;

class CircularQueue {

    int MAX = 5;
    int[] queue = new int[MAX];
    int front = -1;
    int rear = -1;

    // Check if queue is full
    boolean isFull() {
        return front == (rear + 1) % MAX;
    }

    // Check if queue is empty
    boolean isEmpty() {
        return front == -1;
    }

    // Enqueue operation
    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % MAX;
        queue[rear] = value;
        System.out.println("Inserted: " + value);
    }

    // Dequeue operation
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted: " + queue[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % MAX;
        }
    }

    // Display operation
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % MAX;
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        CircularQueue cq = new CircularQueue();

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        cq.display();

        cq.dequeue();
        cq.dequeue();

        cq.display();

        cq.enqueue(60);
        cq.enqueue(70);

        cq.display();
    }
}

