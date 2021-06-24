package search;

import java.util.ArrayList;
import java.util.Queue;

public class SequentialSearchST<Key, Value> {
	
	private Node first; // first node in the linked list
	
	private class Node{ // linked-list node 
		Key key;
		Value val;
		Node next;
		
		public Node(Key key, Value val, Node next){ 
			this.key = key;
			this.val = val;
			this.next = next; 
		}
	}
	public Value get(Key key){ // Search for key, return associated value. 
		for (Node x = first; x != null; x = x.next)
			if (key.equals(x.key))
				return x.val; // search hit 
		return null; // search miss
	}		
				
	public void put(Key key, Value val){ // Search for key. Update value if found; grow table if new.
		for (Node x = first; x != null; x = x.next) 
		if (key.equals(x.key))
			{ x.val = val; return; } // Search hit: update val.
		first = new Node(key, val, first); // Search miss: add new node.
	}
	
	public int size() {
		Node currentNode = first;
		int count = 0;
		while (currentNode != null) {
			count++;
			currentNode = first.next;
		}
		return count;
	}
	
	public Iterable<Key> keys() {
		ArrayList<Key> allkeys = new ArrayList<Key>();
	    for (Node x = first; x != null; x = x.next)
	        allkeys.add(x.key);
	    return allkeys;
	}
	
	public void delete(Key key) {
		Node prev = null;
		Node now = first;
		while (now != null) {
			if (now.key == key) {
				prev.next = now.next;
			} else {
				prev = now;
			}
			now = now.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
