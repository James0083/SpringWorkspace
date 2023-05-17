package day02;

public class Point implements Comparable<Point>{
	
	private int x;
	private int y;
	
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public int compareTo(Point o) {
		if(o.x==this.x) {
			return o.y-this.y;
		}else {
			return o.x-this.x;
		}
	}
	
	@Override
	public String toString() {
		return this.x+", "+this.y;
	}

}
