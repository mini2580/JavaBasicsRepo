package javaBasicsDemo.java;
import java.util.Scanner;

public class Readfromconsole {

	public static void main(String[] args) {
		// This program will show how to take input from console in java
		// we need to import Scanner class for this; System.in is passes as 
		// argument to tell that we want to read the input from console
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string :");
		String text = scan.nextLine();
		
		while (text.isEmpty() || text == null){
			System.out.println("Please enter a valid string , Null or Empty strings are not accepted");
			text = scan.nextLine();
			
		}
		scan.close();
        System.out.println("The string entered is: "+ text);
	}

}
