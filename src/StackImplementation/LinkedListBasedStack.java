package StackImplementation;

import java.util.LinkedList;

public class LinkedListBasedStack {
	
	LinkedList<Integer> stack = new LinkedList<>();
	
	//push method
	void push(int value) {
		stack.addFirst(value);
		
		System.out.println(value + "The value is pushed");
	}
	
	//Pop method
	
	int pop() {
		
		if(stack.isEmpty()) {
			System.out.println("Stack UnderFlow");
			
			return -1;
		}
		
		return stack.removeFirst(); //This is the ready made function inside the application
		//Inside the java
		
	}
	
	//peek method
	
	int peek() {
		
		if(stack.isEmpty()) {
			System.out.println("Srtack is empty");
			return -1;
		}
		
		return stack.getFirst();
	}
	
	public static void main(String[] args) {
		
		LinkedListBasedStack l1 = new LinkedListBasedStack();
		
		l1.push(10);
		l1.push(20);
		l1.push(30);
		l1.push(40);
		l1.push(50);
		
		System.out.println("Pop: " + l1.pop());
		
		System.out.println("Peek: "+ l1.peek());
	}

}
