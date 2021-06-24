import java.util.Queue;
import java.util.Stack;

public class DepthFirstOrder {

	public DepthFirstOrder(Diagraph G){ 
		post = new Queue<Integer>(); 
		pre = new Queue<Integer>(); 
		marked = new boolean[G.V()]; 
		for(int v = 0; v<G.V(); v++){
			if(!marked[v])
				dfs(G,v);
		} 
	}

	private void dfs(Digraph G, int v){ 
		pre.enqueue(v);
		marked[v] = true;
		for (int w : G.adj(v)){
			if (!marked[w]){ 
				dfs(G, w);
			} 
		}
		post.enqueue(v);
		reversePost.push(v);
	}
	
	private boolean[] marked;
	private Queue<Integer> pre; // vertices in preorder
	private Queue<Integer> post; // vertices in postorder
	private Stack<Integer> reversePost; // vertices in reverse postorder
}
