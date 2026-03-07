package RecursionFunction;

public class NonTailRecursion {
	
  long factorial(int n) {
	  
	 
	  if(n == 0) {
		  return 1;
	  }
	  else if(n<0) {
		  System.out.println("Enter any number bigger than 0");
	  }
	  
		  return n * factorial(n - 1);
	  
	 
  }
  
  public static void main(String[] args) {
	System.out.println("=== Non - Tail Recursion ==");
	
	NonTailRecursion f1 = new NonTailRecursion();
	
	
	
	System.out.println("Factorial (6): "+ f1.factorial(-1));
}

}
