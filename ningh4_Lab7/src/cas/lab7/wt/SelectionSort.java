package cas.lab7.wt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class SelectionSort {

	private static boolean less(Comparable v, Comparable w)
	{ return v.compareTo(w) < 0; }
	
	private static void exch(Comparable[] a, int i, int j)
	{ Comparable t = a[i]; a[i] = a[j]; a[j] = t; }
	
	public static void sort(Comparable[] a) 
	{ // Sort a[] into increasing order.
		int N = a.length; // array length
		for (int i = 0; i < N; i++)
		{ // Exchange a[i] with smallest entry in a[i+1...N).
			int min = i; // index of minimal entr. 
			for (int j = i+1; j < N; j++)
				if (less(a[j], a[min])) min = j; 
			exch(a, i, min);
		}
	}
	
	 public static boolean isSorted(Comparable[] a)
	{ // Test whether the array entries are in order.
		 for (int i = 1; i < a.length; i++)
			 if (less(a[i], a[i-1])) return false;
		 return true; 
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/data/input.txt"));
		
		PrintStream output = new PrintStream(new File("src/data/output.txt"));

		while (input.hasNext()){
			String current = input.nextLine();
			String[] unsort = current.split(" ");
			sort(unsort);
			for (String item : unsort) {
				output.append(item + " ");
			}
			output.append("\n");
		}
		
		input.close();
		
		output.close();

	}

}
