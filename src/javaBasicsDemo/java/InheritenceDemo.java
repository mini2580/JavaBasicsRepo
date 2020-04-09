package javaBasicsDemo.java;

public class InheritenceDemo {

	public static void main(String[] args) {
		Shapes s1 = new Shapes(2, 5);
		double area = s1.shapeArea();
		System.out.println("the area of shape is : "+ area);
		
		Square sq = new Square(4);
		area = sq.shapeArea();
		System.out.println("the area of square is :" + area);
		
		Square sq1 = new Square(5);
		area = sq1.shapeArea();
		System.out.println("the area of square 1 is :" + area);

	}

}
