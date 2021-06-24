package cas.lab8.wt;

import java.util.Arrays;
import java.util.Random;

public class ExperimentsSort {

	public static void main(String[] args) {
		
		// create array x and y
		Integer [] x = {10, 100, 1000, 10000, 100000};
		Double [] y = new Double [5];
	
		Random random = new Random();
		
		// loop through x
		for (int i = 0; i < x.length; i++) {
			Integer [] array = new Integer [x[i]];
			// generate array with specific number of elements
			// all elements are random numbers
			for (int j = 0; j < x[i]; j++) {
				Integer newNumber = (random.nextInt(10000));
				array [j] = newNumber;
			}	
			// calculate sorting time
			Stopwatch stopwatch = new Stopwatch (); 
			double startTime = stopwatch.elapsedTime(); SelectionSort.sort(array);
			double endTime = stopwatch.elapsedTime();
			System.out.println("Total execution time: " + (endTime - startTime) );
			// append time to array y
			y [i] = endTime - startTime;
		}
		System.out.println(Arrays.toString(y));
		
		// draw graph
		drawGraph();
		for (int i = 0; i < x.length - 1; i++) {
			StdDraw.line(x[i], y[i], x[i + 1], y[i + 1]);
		}
	}
	
	public static void drawGraph() {
		StdDraw.setXscale(-20, 100500);
		StdDraw.setYscale(-20, 30);
		StdDraw.line(-10, 0, 100500, 0);
		StdDraw.line(0, -10, 0, 30);
	}
		

}
