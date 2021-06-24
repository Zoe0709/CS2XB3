package cas.lab3.wt;

public class harmonic {

	// returns 1/1 + 1/2 + 1/3 + ... + 1/n
	public static double harmonic(int n) {
		double sum = 0.0;
		//sum of 1/1 + 1/2 + 1/3 + ... + 1/n
		for (int j = 1; j<= n; j++) {
			sum = sum + 1 / j;
		}
		return sum;
	}
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			int arg =Integer.parseInt(args[i]);
			//call the harmonic method and store the return value into a double called value
			double value = harmonic(arg);
			System.out.println(value);
		}
	}


}
