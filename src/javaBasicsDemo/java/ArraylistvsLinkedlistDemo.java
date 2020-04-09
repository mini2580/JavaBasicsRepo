package javaBasicsDemo.java;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistvsLinkedlistDemo {

	public static void main(String[] args) {
		ArraylistVsLinkedlist obj = new ArraylistVsLinkedlist();
		List<Integer> alist = new ArrayList<Integer>();
		List<Integer> llist = new LinkedList<Integer>();
		
		obj.duration(alist, "Array list");
		obj.duration(llist, "Linked List");
		

	}

}
