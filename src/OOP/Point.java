package OOP;

public class Point extends java.lang.Object {	
	private int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point() {
		x=0; y=0;
	}
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	
// tinh khoang cach tu 1 diem toi goc toa do O(0, 0);
	public double Distance() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

//tinh khoang cach tu 1 diem toi diem p(x1, y1);
	public double Distance(Point p) {
		return Math.sqrt(Math.pow(x-p.x, 2) + Math.pow(y-p.y, 2));
	}
	
	//tinh khoang cach tu 1 diem toi diem p(x1, y1); su dung ham static
	static double Distance(Point p,Point p1) {
//		return Math.sqrt(Math.pow(p1.x-p.x, 2) + Math.pow(p1.y-p.y, 2));
		return p.Distance(p1);
	}
	
	public String toString() {
		return String.format("%d, %d\n", x,y);
	}
}