package OOP_Extends;

public class Rectangle extends Shape {
	private double width, length;
	public Rectangle() {
		super();
		width = length = 1;
	}
	public Rectangle(double w, double l) {
		super();
		width =w;
		length = l;
	}
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color,filled);
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return width*length;
	}
	public double getCV() {
		return (width+length)*2;
	}
	@Override
	public String toString() {
		return String.format("Rectangle[%s, w=%f, l=%f]", super.toString(),width,length);
	}
	
	
}
