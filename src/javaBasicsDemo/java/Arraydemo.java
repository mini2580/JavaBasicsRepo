package javaBasicsDemo.java;
import java.util.*;

public class Arraydemo {

	public static void main(String[] args) {
	
		int[] array1 = new int[4];
		int[] array2 = new int[4]; 
		 array1[0]= 45;
		 array1[1]= 27;
		 array1[2]= 13;
	     array1[3]= 60;
	     
	     Arrays.sort(array1);
	     System.arraycopy(array1, 7, array2, 0, 3 );
	     for (int i = 0; i<array1.length ; i++)
	     {
	    	 System.out.println(array1[i]);
	     }
	     
	     System.out.println("I am array2");
	     for (int i = 0 ; i<array2.length ;i++)
	     {
	    	
	    	 System.out.println(array2[i]);
	     }
	}
	
}
