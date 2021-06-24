package cas.lab3.wt;

public class Euclid {

	// recursive implementation
	public static int gcd(int p, int q) { 
		//recursively find the greatest common divisor
	    //base case
		if (q == 0) {
            return p;
        }
        return gcd(p, p%q);
	}
	// non-recursive implementation
	public static int gcd2(int p, int q) {
		//non-recursively find the greatest common divisor
		int gcdnum = 1;
		for (int i = 1; i <= p && i <= q; i++) {
            if (p%i == 0 && q%i == 0)
                gcdnum = i;
        }
		return gcdnum;
	}
	public static void main(String[] args) {
		int p = Integer.parseInt(args[0]); 
		int q = Integer.parseInt(args[1]); 
		int d = gcd(p, q);
		int d2 = gcd2(p, q); 
		System.out.println("gcd(" + p + ", " + q + ") = " + d);
		System.out.println("gcd(" + p + ", " + q + ") = " + d2);
	}

}
