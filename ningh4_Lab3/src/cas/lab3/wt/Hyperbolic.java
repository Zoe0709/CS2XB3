package cas.lab3.wt;

public class Hyperbolic {

	public static double cosh(double x) { 
		return ((Math.exp(x) + Math.exp(- x))/2);
	}
	
	public static double sinh(double x) { 
		return ((Math.exp(x) - Math.exp(- x))/2);
	}

	public static double tanh(double x) { 
		return (sinh(x) / cosh(x));
	}
	
	public static void main(String[] args) { 
		double x = Double.parseDouble(args[0]); 
		System.out.printf("sinh(%f) = %f\n", x, sinh(x)); 
		System.out.printf("cosh(%f) = %f\n", x, cosh(x)); 
		System.out.printf("tanh(%f) = %f\n", x, tanh(x));
	}
	
}
