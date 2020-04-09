package javaBasicsDemo.java;
import java.util.regex.*;

public class revstr {

	public static void main(String[] args) {
		// This program will reverse the string 
		
		String str = "This is a test string ";
		String[] splitStr;
		String reverseStr  = " ";
		splitStr = str.split(" ");
		System.out.println("the length of the string is "+ splitStr.length);
		System.out.println(splitStr[0]);
		System.out.println(splitStr[1]);
		System.out.println(splitStr[2]);
		System.out.println(splitStr[3]);
		System.out.println(splitStr[4]);
		System.out.println("The reverse string is: ");
		for (int i = 0 ; i < splitStr.length  ; i++)
		{
			reverseStr = splitStr[i] + " " + reverseStr;
		}
		
       System.out.println(reverseStr);
	}

}
