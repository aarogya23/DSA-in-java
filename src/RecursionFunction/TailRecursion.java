package RecursionFunction;

public class TailRecursion {
	
	
	//Lets implement the factorial method using tailRecursion method
	
	//in this above code acc stores the running result
	//insted of waiting to multiply after the call
	//Example 
	//Factorial(3,1)
	// -> fac(2, 3*1 = 3)
	// remaing same as it
	// ==> fact(0, 1*6 = 6)
	long factorial(int n, long acc) {
		if(n == 0) 
		{
			return acc;
		}
		
		return factorial(n - 1, n * acc);
	}
	
	public static void main(String[] args) {
		
		TailRecursion t1 = new TailRecursion();
		
		
		System.out.println("-- Factorial --");
		
		System.out.println("Factorial (5) " + t1.factorial(5, 1));
	}

	
	
}
