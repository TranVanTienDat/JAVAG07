package OOP;

public class Circle extends java.lang.Object{
	private double radius; String color;

    
	public double getRadius() {
		return radius;
	}
	public Circle() {
		radius = 1;
		color = "red";
	}
	public Circle(double rad) {
		radius = rad;
		color = "red";
	}

   public double getArea() {
	   return Math.PI*Math.pow(radius, 2);
   }
   
   
	
	public String toString() {
		return String.format("%f", getArea());
	}
	
}
