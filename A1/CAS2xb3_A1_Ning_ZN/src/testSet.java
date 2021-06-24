/* Student Information
 * -------------------
 * Student Name: Ning, Zoe
 * Student Number: 400183343
 * Course Code: CS/SE 2XB3
 * Lab Section: Lab2
 * 
 * I attest that the following code being submitted is my own individual work. 
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class testSet {

	 public static PrintStream output;
	 public static Set set1;
	 public static Set set2;
	
	public static void main(String[] args) throws FileNotFoundException {
		output = new PrintStream(new File("src/data/output.txt"));
		set1 = new Set(new String[] {"1","a","2","B","3","c","4","D","5","e","6","F"} );
		set2 = new Set(new String[] {"q","W","3","e","R","6","t","Y","9","u"} );
		
		testAdd();
		testRemove();
		testUnion();
		testIntersection();
		testDifference();
		testProduct();
		testIsEqual();
		testIsSubset();
		testGetCount();
		testToString();
		
		output.close();
	}
	
	public static void testAdd() throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/data/input.txt"));
		Scanner answer = new Scanner(new File("src/data/addAnswer.txt"));
		output.append("Entering testAdd...");
		output.append("\n");
		int counter = 0;
		while (input.hasNext()){
			String current = input.nextLine();			
			String[] elems = current.split(",");
			Set aset = new Set(elems);
			
			String present = answer.nextLine();
			String[] items = present.split(",");
			Set bset = new Set(items);
			
			Set result = aset.set_Add("V");

			counter += 1;
			if (bset.isEqual(result)) {
				output.append("Test case " + counter + " passed.");
				output.append("\n");
			} else {
				output.append("Test case " + counter + " failed.");
				output.append("\n");
			}
		}
		input.close();
		answer.close();
	}
	
	public static void testRemove() throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/data/input.txt"));
		Scanner answer = new Scanner(new File("src/data/removeAnswer.txt"));
		output.append("Entering testRemove...");
		output.append("\n");
		int counter = 0;
		while (input.hasNext()){
			String current = input.nextLine();			
			String[] elems = current.split(",");
			Set aset = new Set(elems);
			
			String present = answer.nextLine();
			String[] items = present.split(",");
			Set bset = new Set(items);

			Set result = aset.set_Remove("e");
			counter += 1;
			if (bset.isEqual(result)) {
				output.append("Test case " + counter + " passed.");
				output.append("\n");
			} else {
				output.append("Test case " + counter + " failed.");
				output.append("\n");
			}
		}
		input.close();
		answer.close();
	}
	
	public static void testUnion() throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/data/input.txt"));
		Scanner answer = new Scanner(new File("src/data/unionAnswer.txt"));
		output.append("Entering testUnion...");
		output.append("\n");
		int counter = 0;
		while (input.hasNext()){
			String current = input.nextLine();			
			String[] elems = current.split(",");
			Set aset = new Set(elems);
			
			String present = answer.nextLine();
			String[] items = present.split(",");
			Set bset = new Set(items);

			Set result = aset.set_Union(set1);
			counter += 1;
			if (bset.isEqual(result)) {
				output.append("Test case " + counter + " passed.");
				output.append("\n");
			} else {
				output.append("Test case " + counter + " failed.");
				output.append("\n");
			}
		}
		input.close();
		answer.close();
	}
	
	public static void testIntersection() throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/data/input.txt"));
		Scanner answer = new Scanner(new File("src/data/interAnswer.txt"));
		output.append("Entering testIntersection...");
		output.append("\n");
		int counter = 0;
		while (input.hasNext()){
			String current = input.nextLine();			
			String[] elems = current.split(",");
			Set aset = new Set(elems);
			
			String present = answer.nextLine();
			String[] items = present.split(",");
			Set bset = new Set(items);

			Set result = aset.set_Intersection(set1);
			counter += 1;
			if (bset.isEqual(result)) {
				output.append("Test case " + counter + " passed.");
				output.append("\n");
			} else {
				output.append("Test case " + counter + " failed.");
				output.append("\n");
			}
		}
		input.close();
		answer.close();
	}
	
	public static void testDifference() throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/data/input.txt"));
		Scanner answer = new Scanner(new File("src/data/diffAnswer.txt"));
		output.append("Entering testDifference...");
		output.append("\n");
		int counter = 0;
		while (input.hasNext()){
			String current = input.nextLine();			
			String[] elems = current.split(",");
			Set aset = new Set(elems);
			
			String present = answer.nextLine();
			String[] items = present.split(",");
			Set bset = new Set(items);

			Set result = aset.set_Difference(set2);
			counter += 1;
			if (bset.isEqual(result)) {
				output.append("Test case " + counter + " passed.");
				output.append("\n");
			} else {
				output.append("Test case " + counter + " failed.");
				output.append("\n");
			}
		}
		input.close();
		answer.close();
	}
	
	public static void testProduct() throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/data/input.txt"));
		Scanner answer = new Scanner(new File("src/data/prodAnswer.txt"));
		output.append("Entering testProduct...");
		output.append("\n");
		int counter = 0;
		while (input.hasNext()){
			String current = input.nextLine();			
			String[] elems = current.split(",");
			Set aset = new Set(elems);
			
			String present = answer.nextLine();
			String[] items = present.split(",");
			Set bset = new Set(items);

			Set result = aset.set_Product(set2);
			counter += 1;
			if (bset.isEqual(result)) {
				output.append("Test case " + counter + " passed.");
				output.append("\n");
			} else {
				output.append("Test case " + counter + " failed.");
				output.append("\n");
			}
		}
		input.close();
		answer.close();
	}
	
	public static void testIsEqual() throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/data/input.txt"));
		Scanner answer = new Scanner(new File("src/data/equalAnswer.txt"));
		output.append("Entering testIsEqual...");
		output.append("\n");
		int counter = 0;
		while (input.hasNext()){
			String current = input.nextLine();			
			String[] elems = current.split(",");
			Set aset = new Set(elems);
			
			String present = answer.nextLine();
			String[] items = present.split(",");
			Set bset = new Set(items);

			counter += 1;
			if (bset.isEqual(aset)) {
				output.append("Test case " + counter + " passed.");
				output.append("\n");
			} else {
				output.append("Test case " + counter + " failed.");
				output.append("\n");
			}
		}
		input.close();
		answer.close();
	}
	
	public static void testIsSubset() throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/data/input.txt"));
		Scanner answer = new Scanner(new File("src/data/subAnswer.txt"));
		output.append("Entering testIsSubset...");
		output.append("\n");
		int counter = 0;
		while (input.hasNext()){
			String current = input.nextLine();			
			String[] elems = current.split(",");
			Set aset = new Set(elems);
			
			String present = answer.nextLine();

			boolean result = set1.isSubset(aset);
			counter += 1;
			if (present.equals(Boolean.toString(result))) {
				output.append("Test case " + counter + " passed.");
				output.append("\n");
			} else {
				output.append("Test case " + counter + " failed.");
				output.append("\n");
			}
		}
		input.close();
		answer.close();
	}
	
	public static void testGetCount() throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/data/input.txt"));
		Scanner answer = new Scanner(new File("src/data/countAnswer.txt"));
		output.append("Entering testGetCount...");
		output.append("\n");
		int counter = 0;
		while (input.hasNext()){
			String current = input.nextLine();			
			String[] elems = current.split(",");
			Set aset = new Set(elems);
			
			String present = answer.nextLine();

			int result = aset.getCount();
			counter += 1;
			if (present.equals(String.valueOf(result))) {
				output.append("Test case " + counter + " passed.");
				output.append("\n");
			} else {
				output.append("Test case " + counter + " failed.");
				output.append("\n");
			}
		}
		input.close();
		answer.close();
	}
	
	public static void testToString() throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/data/input.txt"));
		Scanner answer = new Scanner(new File("src/data/stringAnswer.txt"));
		output.append("Entering testToString...");
		output.append("\n");
		int counter = 0;
		while (input.hasNext()){
			String current = input.nextLine();			
			String[] elems = current.split(",");
			Set aset = new Set(elems);
			
			String present = answer.nextLine();

			String result = aset.toString();
			counter += 1;
			if (present.equals(result)) {
				output.append("Test case " + counter + " passed.");
				output.append("\n");
			} else {
				output.append("Test case " + counter + " failed.");
				output.append("\n");
			}
		}
		input.close();
		answer.close();
	}

}
