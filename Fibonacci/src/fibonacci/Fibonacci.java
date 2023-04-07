package fibonacci;


/**
 * Fibonacci program - recursive and iterative
 * 
 * 
 * @author Nick Zambri
 * 2/24/2023
 */


public class Fibonacci {
	
	private static long[] fibonacciCache;
	
	public static void main(String[] args) {
		
		int n = 50;
		// limit of a long is 92
		
		fibonacciCache = new long[n + 1];
		
		for (int i = 0; i <=n; i++) {
		System.out.print(fibonacci(i) + " ");
		}
		
		// 9,223 372,036,854,775,807
		// Longest number a Long can hold
		// 92 = 7,540,113,804,746,346,429
		// 93 brings negative 
	}

	private static long fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		
		if (fibonacciCache[n] != 0) {
			return fibonacciCache[n];
		}
		
		long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
		fibonacciCache[n] = nthFibonacciNumber; 
				
		return nthFibonacciNumber;
		
		
	}
	

}
