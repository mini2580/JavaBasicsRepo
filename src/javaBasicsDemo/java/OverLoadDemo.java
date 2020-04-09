package javaBasicsDemo.java;
//import java.util.Scanner;

public class OverLoadDemo {

	public static void main(String[] args) {
		// overloading can be done in three ways 
		// 1. number of arguments must be different
		//2. Argument data types must be different
		//3. the order of arguments must be different 
		//int length ;
		//int breadth;
//		int side;
	double area;
//		String shape;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the name of shape:");
//		shape = scan.nextLine();
//		if (shape == "rectangle")
//		{
//		System.out.println("Enter the length :");
//		length = scan.nextInt();
//		System.out.println("Enter the breadth");
//		breadth = scan.nextInt();
//		scan.close();
		//area = areaOfFourSide(length, breadth);
		
		 areaOfFourSide(12.34, 12.45);
		 
		
		areaOfFourSide(5,6);
	
//		} 
//		else {
//			System.out.println("Enter the Side:");
//			side = scan.nextInt();
//			scan.close();
		
		 areaOfFourSide(4);
		
			
		
		
	

	}
	public static void  areaOfFourSide(int length, int breadth)
	{
		int area = length * breadth;
		
		System.out.println("The Area of rectangle integer is:" + area); 
	}
	
	public static void areaOfFourSide(int side){
		double area = Math.pow(side,  2);
		System.out.println("The area of square is :" + area);
		
	}
    public static void areaOfFourSide(double length, double breadth){
    	double area = length * breadth;
    	System.out.println("The Area of rectangle double is:" + area); 
    	
    }
}
