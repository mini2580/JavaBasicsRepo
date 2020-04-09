package javaBasicsDemo.java;

public class Shapes {
      int length;
      int breadth;
      double area;
      double side;
      public Shapes(int len, int brd){
    	  length = len;
    	  breadth = brd;
      }
      public Shapes(double side){
    	  this.side = side;
      }
      public double shapeArea(){
    	  area = length * breadth;
    	  System.out.println("I AM FROM SUPER CLASS");
    	  return area;
    	  
      }
}
