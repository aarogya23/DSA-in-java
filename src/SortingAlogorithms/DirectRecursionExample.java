public class DirectRecursionExample {

    static int factorial(int n) {
        if (n == 0 || n == 1)   // Base Case
            return 1;
            
            //1
            //6*5*4*3*2*1

        return n * factorial(n - 1);   // Direct Recursive Call
    }

    public static void main(String[] args) {
        int result = factorial(6);
        System.out.println("Factorial: " + result);
    }
}
