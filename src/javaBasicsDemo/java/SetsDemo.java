package javaBasicsDemo.java;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetsDemo {

	public static void main(String[] args) {
		Set<String> myset = new HashSet<String>();
// Hashset displays the elements in any order, that's why it is a bit faster way to
//access elements		
		myset.add("Mini");
		myset.add("Dhruv");
		myset.add("Kapil");
		myset.add("Ashu");
		//int size = myset.size();
		
		System.out.println(myset);
		
		
		
		myset.add("Kapil");
		
		for (String item : myset){
			System.out.println(item);
		}
		
// we have three types of sets :- HASHSET, LINKEDHASHSET, TREESET
		// HASHSET - will display the elements in any order 
		// LinkedHashset = will display the elements in the order in which they are stored 
		//Treeset = will display the elements in the natural sorting order , 
		// like alphabetically if strings are stored and in the increasing order if they are numbers
	System.out.println("Presenting linked hash set");	
		Set<Integer> linkSet = new LinkedHashSet<Integer>();
		
		linkSet.add(78);
		linkSet.add(1254);
		linkSet.add(56354653);
		
		for (int num: linkSet){
			System.out.println(num);
		}
		
		System.out.println("Presenting Tree set");
		Set<String> myTreeSet = new TreeSet<String>();
		
		myTreeSet.add("Saga");
		myTreeSet.add("vaga");
		myTreeSet.add("Baga");
		myTreeSet.add("Jaga");
		for (String str: myTreeSet){
			System.out.println(str);
		}
		
		
	}

}
