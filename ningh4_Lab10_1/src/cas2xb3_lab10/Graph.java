package cas2xb3_lab10;

import java.util.*;

public class Graph {
	int V;
	int E;
	private Bag<Integer>[] adj;

	public Graph(int V){
		
		this.V = V; 
		this.E = 0;
		adj = (Bag<Integer>[]) new Bag[V]; // Create array of lists.
	
		for (int v = 0; v < V; v++) // Initialize all lists 
			adj[v] = new Bag<Integer>(); // to empty.
	}
	
	public int V() {
		return V;
	}
	
	public int E() {
		return E;
	}
	
	public void addEdge(int v, int w){ 
		adj[v].add(w); // Add w to v’s list. 
		adj[w].add(v); // Add v to w’s list. 
		E++;
	}
	
	public Iterable<Integer> adj(int v)
	{ return (Iterable<Integer>) adj[v]; }
	
	public static int degree(Graph G, int v){ 
		int degree = 0;
		for (int w : G.adj(v)) degree++;
		return degree; 
	}
	
	public static int maxDegree(Graph G){ 
		int max = 0;
		for (int v = 0; v < G.V(); v++) 
			if (degree(G, v) > max)
				max = degree(G, v);
		return max;
	}
	
	public static int avgDegree(Graph G) { 
		return 2 * G.E() / G.V(); 
	}
	
	public static int numberOfSelfLoops(Graph G){ 
		int count = 0;
		for (int v = 0; v < G.V(); v++)
			for (int w : G.adj(v))
				if (v == w) count++;
		return count/2; // each edge counted twice
	}
	
	public String toString(){
		String s = V + " vertices, " + E + " edges\n"; 
		for (int v = 0; v < V; v++) {
			s += v + ": ";
			for (int w : this.adj(v)) 
				s += w + " ";
			s += "\n";
		}
		return s; 
	}
	
//	public static void main(String[] args) {
//		Graph G = new Graph(new In(args[0])); 
//		int s = Integer.parseInt(args[1]); 
//		Search search = new Search(G, s);
//		
//		for (int v = 0; v < G.V(); v++) 
//			if (search.marked(v))
//				System.out.print(v + " ");
//		System.out.println();
//		
//		if (search.count() != G.V()) 
//			System.out.print("NOT ");
//		System.out.println("connected");
//	}


}

