package RecursionFunction;

public class NonTailRecursion {

    // Factorial - handles negative numbers properly
    long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Enter a number bigger than 0");
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Fixed spelling + memoization for performance
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Fibonacci with memoization (efficient for large n)
    static long fibonacciMemo(int n, long[] memo) {
        if (n <= 1)
            return n;
        if (memo[n] != 0)
            return memo[n];
        memo[n] = fibonacciMemo(n - 1, memo) + fibonacciMemo(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println("=== Non-Tail Recursion ===\n");

        NonTailRecursion f1 = new NonTailRecursion();

        // --- Factorial Tests ---
        System.out.println("-- Factorial --");
        System.out.println("Factorial(0):  " + f1.factorial(0));
        System.out.println("Factorial(5):  " + f1.factorial(5));
        System.out.println("Factorial(16): " + f1.factorial(16));

        // Negative number handling
        try {
            System.out.println("Factorial(-3): " + f1.factorial(-3));
        } catch (IllegalArgumentException e) {
            System.out.println("Factorial(-3): Error - " + e.getMessage());
        }

        // --- Fibonacci Tests ---
        System.out.println("\n-- Fibonacci Series (0 to 10) --");
        System.out.print("Basic:  ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        // Fibonacci with memoization
        System.out.print("Memo:   ");
        long[] memo = new long[50];
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacciMemo(i, memo) + " ");
        }
        System.out.println();

        // Single Fibonacci values
        System.out.println("\n-- Single Fibonacci Values --");
        System.out.println("Fibonacci(7):  " + fibonacci(7));
        System.out.println("Fibonacci(10): " + fibonacci(10));

        long[] memo2 = new long[50];
        System.out.println("Fibonacci(45): " + fibonacciMemo(45, memo2)); // too slow without memo
    }
}
