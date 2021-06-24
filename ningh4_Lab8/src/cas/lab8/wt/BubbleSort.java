package cas.lab8.wt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class BubbleSort {

	private static boolean less(Comparable v, Comparable w)
	{ return v.compareTo(w) < 0; }
	
	private static void exch(Comparable[] a, int i, int j)
	{ Comparable t = a[i]; a[i] = a[j]; a[j] = t; }

// Original sort method:
//	public static void sort(Comparable[] num){ 
//		int j;
//		boolean sorted = true;// set flag to true to begin first pass 
//		while (sorted){
//			sorted= false;//set flag to false awaiting a possible swap 
//			for(j=0; j < num.length -1; j++){
//				if (less(num[j+1],num[j])){ 
//					exch(num,j,j+1);
//					sorted = true;//shows a swap occurred
//				}
//			}
//		}
//	}	
	
	public static void sort(Comparable[] a)
	{  // Sort a[] into increasing order.
	   int N = a.length;
	   int h = 1;
	   while (h < N/3) h = 3*h + 1; // 1, 4, 13, 40, 121, 364, 1093, ...
	   while (h >= 1)
	   {  // h-sort the array.
	      for (int i = h; i < N; i++)
	      {  // Insert a[i] among a[i-h], a[i-2*h], a[i-3*h]... .
	         for (int j = i; j >= h && less(a[j], a[j-h]); j -= h)
	            exch(a, j, j-h);
	      }
	      h = h/3; 
	   }
	}
	
	
	public static boolean isSorted(Comparable[] a)
	{ // Test whether the array entries are in order.
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i-1])) return false;
		return true; 
	}
	 
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/bubble_data/input.txt"));
		PrintStream output = new PrintStream(new File("src/bubble_data/output.txt"));

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
