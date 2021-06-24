package cas.lab4.wt;

/**************************************************************************** 
 * * Compilation: javac Stopwatch.java
 * Execution: java Stopwatch n
 * Dependencies: none 
 *
 * A utility class to measure the running time (wall clock) of a program. 
 *
 * The {@code Stopwatch} data type is for measuring
 * the time that elapses between the start and end of a
 * programming task (wall-clock time).
 *
 */

public class Stopwatch {
	
	private final long start;
	
	/**
	 * Initializes a new stopwatch. 
	 */
	public Stopwatch() {
		start = System.currentTimeMillis();
	}
	/**
	 * Returns the elapsed CPU time (in seconds) since the stopwatch was created. 
	 *
	 * @return elapsed CPU time (in seconds) since the stopwatch was created
	 */
	public double elapsedTime() { 
		long now = System.currentTimeMillis();
		return (now - start) / 1000.0; 
	}
	
	/**
	 * Unit tests the {@code Stopwatch} data type.
	 * Takes a command-line argument {@code n} and computes the
	 * sum of the square roots of the first {@code n} positive integers,
	 * using {@code Math.sqrt()}.
	 * It prints to standard output the sum and the amount of time to
	 * compute the sum. Note that the discrete sum can be approximated by
	 * an integral - the sum should be approximately 2/3 * (n^(3/2) - 1). 
	 *
	 * @param args the command-line arguments 
	 */
	public static void main(String[] args) { 
		int n = Integer.parseInt(args[0]);
		// sum of square roots of integers from 1 to n using Math.sqrt(x).
		Stopwatch timer1 = new Stopwatch(); 
		double sum1 = 0.0;
		for (int i = 1; i <= n; i++) {
			sum1 = sum1 + Math.sqrt(i);
		}
		double time1 = timer1.elapsedTime(); 
		StdOut.printf("%e (%.2f seconds)\n", sum1, time1);
	}

}
