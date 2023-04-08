package OOP_Extends;

public class Square extends Rectangle{
	public Square() {
		super();
	}
	public Square(double side) {
		super(side,side);
	}
	public Square(double side, String color, boolean filled) {
		super(side,side, color,filled);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Square[%s]", super.toString());
	}

}
