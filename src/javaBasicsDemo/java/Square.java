package javaBasicsDemo.java;
public class Square extends Shapes {
	
	public Square(double side){
		super(side);
	}
	public Square(int len, int brd){
		super(len, brd);
	}
     double area;
	/* (non-Javadoc)
	 * @see javaBasicsDemo.java.Shapes#shapeArea()
	 */
	@Override
	public double shapeArea() {
		area = Math.pow(side, 2);
		System.out.println("I AM FROM SUB CLASS");
		return area;
	}

	
}
