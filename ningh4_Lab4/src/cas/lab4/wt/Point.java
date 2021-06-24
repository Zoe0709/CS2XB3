package cas.lab4.wt;

/************************************************************************* 
***
 * Compilation: javac Point.java
 * Execution: java Point *
 * Immutable data type for 2D points. *
************************************************************************** 
**/

public class Point {
	private double x; // Cartesian 
	private double y; // coordinates
	// create and initialize a point with given (x, y)
	public Point(double x, double y) { 
		this.x = x;
		this.y = y;
	}
	
	// return Euclidean distance between invoking point p and q 
	// i.e. sqrt((this.x – that.x)^2 + (this.y – that.y)^2) 
	public double distanceTo(Point that) {
		double distance = Math.sqrt(Math.pow(this.x-that.x,2) + Math.pow(this.y-that.y,2));
		return distance;
	}
	
	// draw point using standard draw
	public void draw() { 
		StdDraw.point(x, y);
	}
	
	// draw the line from the invoking point p to q using standard draw
	public void drawTo(Point that) { 
		StdDraw.line(this.x, this.y, that.x, that.y);
	}
	
	// return string representation of this point
	public String toString() { 
		String strpoint = "(" + Double.toString(x) + "," + Double.toString(y) + ")";
		return strpoint;
	}
	
	// test client
	public static void main(String[] args) {
		Point p = new Point(0.6, 0.2);
		StdOut.println("p = " + p);
		Point q = new Point(0.5, 0.5);
		StdOut.println("q = " + q); 
		StdOut.println("dist(p, q) = " + p.distanceTo(q));
		StdOut.println(q.toString());
		p.drawTo(q);
	}

}
