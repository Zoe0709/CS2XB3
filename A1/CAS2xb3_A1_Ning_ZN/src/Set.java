/* Student Information
 * -------------------
 * Student Name: Ning, Zoe
 * Student Number: 400183343
 * Course Code: CS/SE 2XB3
 * Lab Section: Lab2
 * 
 * I attest that the following code being submitted is my own individual work. 
 */

import java.io.FileNotFoundException;
import java.util.*;

public class Set {
	
	private final String[] s;
	
	// Constructor of class Set
	public Set(String[] s) {
		this.s = s;
	}

	public Set s() { 
		Set set = new Set(s);
		return set; 
	}
	
	// set_Add method takes a string and adds it to a set as the last element
	public Set set_Add(String item) {
		if (! set_check()) {
			throw new IllegalArgumentException("Invalid input!");
		}
		// create a new arraylist sum and return it after adding since the ADT is an immutable type
		ArrayList<String> sum = new ArrayList<String>();
		for (String string : this.s) {
			sum.add(string);
		}
		sum.add(item);
		String[] array_sum = sum.toArray(new String[sum.size()]);
		return new Set(array_sum);
	}
	
	// set_Remove method takes a string and removes it from a set if exists
	public Set set_Remove(String item) {
		if (! set_check()) {
			throw new IllegalArgumentException("Invalid input!");
		}
		// create a new arraylist sub and return it after adding since the ADT is an immutable type
		ArrayList<String> sub = new ArrayList<String>();
		for (String string : this.s) {
			if (! string.contentEquals(item)) {
				sub.add(string);
			}
		}
		String[] array_sub = sub.toArray(new String[sub.size()]);
		return new Set(array_sub);
	}
	
	// set_Union takes a set and returns the union of two sets
	public Set set_Union(Set that) {
		if (! set_check()) {
			throw new IllegalArgumentException("Invalid input!");
		}
		ArrayList<String> uni = new ArrayList<String>();
		// create a new arraylist uni and add all elements in this.s to it
		for (String string : this.s) {
			uni.add(string);
		}
		// loop through that.s and check if any elements in that.s are not in uni
		//if yes, add the element to uni
		for (String string : that.s) {
			if (! uni.contains(string)) {
				uni.add(string);
			}
		}
		String[] array_uni = uni.toArray(new String[uni.size()]);
		return new Set(array_uni);
	}
	
	// set_Union takes a set and returns the intersection of two sets
	public Set set_Intersection(Set that) {
		if (! set_check()) {
			throw new IllegalArgumentException("Invalid input!");
		}
		ArrayList<String> inters = new ArrayList<String>();
		// create a new arraylist inters and elements that are in both this.s and that.s, but not already exist in inters to it
		for (String string : this.s) {
			if ((!inters.contains(string)) && this.set_contains(string) && that.set_contains(string)) {
				inters.add(string);
			}
		}		
		String[] array_inters = inters.toArray(new String[inters.size()]);
		return new Set(array_inters);
	}
	
	// set_Difference takes a set and returns the difference between two sets
	public Set set_Difference(Set that) {
		if (! set_check()) {
			throw new IllegalArgumentException("Invalid input!");
		}
		ArrayList<String> result = new ArrayList<String>();
		for (String str1 : this.s) {
			if (! that.set_contains(str1)) {
				result.add(str1);
			}
		}
		String[] array_result = result.toArray(new String[result.size()]);
		return new Set(array_result);
	}
	
	// set_Product takes a set and returns the Cartesian product of these two set
	public Set set_Product(Set that) {
		if (! set_check()) {
			throw new IllegalArgumentException("Invalid input!");
		}
		ArrayList<String> product = new ArrayList<String>();
		// use two for loops to make sure all possibilities are covered
		for (String str2 : this.s) {
			for (String str3 : that.s) {
				product.add(str2 + str3);
			}
		}
		String[] array_product = product.toArray(new String[product.size()]);
		return new Set(array_product);
	}
	
	// isEqual checks if two sets are equal according to if they have same elements
	// the order of elements do not matter
	public boolean isEqual(Set that) {
		if (! set_check()) {
			throw new IllegalArgumentException("Invalid input!");
		}
		 if (this.s.length == that.s.length) {
			 for (String str4 : this.s) {
				 if (! that.set_contains(str4)) {
					 return false;
				 }
			 }
			 return true;
		 }
		 return false;
	}
	
	// isSubset checks if a set is the subset of another set
	public boolean isSubset(Set that) {
		if (! set_check()) {
			throw new IllegalArgumentException("Invalid input!");
		}
		if (this.s.length <= that.s.length) {
			 for (String str5 : this.s) {
				 if (! that.set_contains(str5)) {
					 return false;
				 }
			 }
			 return true;
		 }
		 return false;
	}
	
	// getCount returns the number of elements in a set
	public int getCount() {
		if (! set_check()) {
			throw new IllegalArgumentException("Invalid input!");
		}
		return this.s.length;
	}
	
	// toString converts a set to a string
	public String toString() {
		if (! set_check()) {
			throw new IllegalArgumentException("Invalid input!");
		}
		String result = "{";
		for (String string : this.s) {
			result = result + string + ",";
		}
		if (result.charAt(result.length() - 1) == ',') {
			result = result.substring(0, result.length() - 1);
	    }
		result += "}";
		return result;
	}
	
	// define my own contains() function
	public boolean set_contains(String str) {
		for (String string : this.s) {
			if (string.contentEquals(str)) {
				return true;
			}
		}
		return false;
	}
	
	// check if the input is valid
	public boolean set_check() {
		ArrayList<String> test = new ArrayList<String>();
		int count = 0;
		for (String string : this.s) {
			count += 1;
			if (! test.contains(string)) {
				test.add(string);
			} else {
				return false;
			}
		}
		return true;
	}


	
}


