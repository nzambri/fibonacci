package fibonacci;
/**
 * Fibonacci program - recursive and iterative
 * 
 * 
 * @author Nick Zambri
 * 2/24/2023
 */
public class Iterative {
	
	public static int fibonacciIterative(int n) {
	    if (n == 0) {
	        return 0;
	    } else if (n == 1) {
	        return 1;
	    } else {
	        int a = 0;
	        int b = 1;
	        int c;
	        for (int i = 2; i <= n; i++) {
	            c = a + b;
	            a = b;
	            b = c;
	        }
	        return b;
	    }
	}


}
