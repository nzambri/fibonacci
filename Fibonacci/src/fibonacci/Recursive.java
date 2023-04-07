package fibonacci;

public class Recursive {
	/**
	 * Fibonacci program - recursive and iterative
	 * 
	 * 
	 * @author Nick Zambri
	 * 2/24/2023
	 */
	public static int fibonacciRecursive(int n) {
	    if (n == 0) {
	        return 0;
	    } else if (n == 1) {
	        return 1;
	    } else {
	        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	    }
	}

}
