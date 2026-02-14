package StackImplementation;

public class ArrayStack {
	
	int maxSize = 6; //Max size of the stack
	
	int [] stackArray = new int[maxSize]; //Array to store stack element
	
	int top = -1; //Top of the stack
	//array 0----5
	
	
	//today lets implement simple push operation
	
	void push(int value) {
		if(top == maxSize - 1) {
			
			
			System.out.println("Stack Overflow! Cannot push" +value);
		    
			return;
		}
		
		top++;
		
		stackArray[top] = value;
		System.out.println(value + "paused to stack");
	}
	
	
	//lets implement the pop operation
	
	int pop() {
		
		if(top == -1) {
			
			System.out.println("Stack Underflow ! We cannot pop up the element");
			
		}
		
		int value = stackArray[top];
		top--;
		
		return value;
		
	}
	
	int peek() {
		if (top == -1){
			System.out.println("Stack is empty");
			
			return -1;
			
		}
		
		return stackArray[top];
	}
	
	public static void main(String[] args) {
		
		ArrayStack s1 = new ArrayStack();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);  
		
		
		System.out.println("Top of the element in this array is" + s1.pop());
		System.out.println("Top of the element in this array is" + s1.pop());
		
		
		System.out.println("top element is :" + s1.peek());
		
		
	}
	
			
	

}
