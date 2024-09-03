package justlearn;

public class fibonacci {

	public static void main(String[] args) {
		 int n = 5; 
	        int first = 0, second = 1;

	        System.out.print("Fibonacci Series up to " + n + " numbers: ");
	        
	        for (int i = 1; i <= n; ++i) {
	            System.out.print(first + " ");

	            // Compute the next number
	            int next = first + second;
	            first = second;
	            second = next;
	        }

	}

}
