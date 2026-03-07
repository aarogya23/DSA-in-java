package RecursionFunction;

public class NonTailRecursion {
	
  long factorial(int n) {
	  
	 
	  if(n == 0) {
		  return 1;
	  }
	  if(n<0) {
		  System.out.println("Enter any number bigger than 0");
		  	
		  
		  return n;
	  }
	  
		  return n * factorial(n - 1);
	  
	 
  }
  
  static int fabonacci(int n) {
	  
	  if(n<=1)
		  return n;
	  
	  return fabonacci(n - 1) + fabonacci(n - 2);
	  
  }
  
  public static void main(String[] args) {
	System.out.println("=== Non - Tail Recursion ==");
	
	NonTailRecursion f1 = new NonTailRecursion();
	
	
	
	System.out.println("Factorial (6): "+ f1.factorial(16));
	
	System.out.println("Fibonacci Series" + fabonacci(1));
}

}
