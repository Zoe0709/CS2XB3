package cas.lab4.wt;

/****************************************************************************
 * Compilation: javac PotentialGene.java 
 * Execution: java PotentialGene < input.txt
 * 
 * Determines whether a a DNA string corresponds to a potential gene 
 * - length is a multiple of 3
 * - starts with the start codon (ATG)
 * - ends with a stop codon (TAA or TAG or TGA)
 * - has no intervening stop codons (i.e. a stop codon cannot be in the middle of the string.
 * 
 * % java PotentialGene ATGCGCCTGCGTCTGTACTAG 
 * true
 * % java PotentialGene ATGCGCTGCGTCTGTACTAG 
 * false
 * 
****************************************************************************/

public class PotientialGene {
	public static boolean isPotentialGene(String dna) {
		int l = dna.length();
		if (l % 3 == 0 && dna.startsWith("ATG") && (dna.endsWith("TAA") || dna.endsWith("TAG") || dna.endsWith("TGA"))) {
			String str = dna.substring(0, l - 3);
			if (str.contains("TAA") || str.contains("TAG") || str.contains("TGA")) {
				return false;
			} else {
				return true;
			}
		}
		return false; 
	}
	public static void main(String[] args) { 
		String dna = args[0]; 
		StdOut.println(isPotentialGene(dna));
	}


}
