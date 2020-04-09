package javaBasicsDemo.java;
import java.util.List;

public class ArraylistVsLinkedlist {
	
 public static void duration(List<Integer> list, String listType){
	 list.clear();;
	 for (int i=0 ; i<= 100000; i++){
		 list.add(i);
		 
	 }
	 int size = list.size();
	 System.out.println("the size of" + listType +  "is " + size);
	 int elementToAdd = size + 10000;
	 long startTime = System.currentTimeMillis();
//	 System.out.println("Adding the elements at the end of list");
// The result is :
//	 for (int i = 0; i< elementToAdd ; i++){
//		 list.add(i);
//		 
//	 }
//	 System.out.println("Removing the elements from the end of list");
// The result is : 
//	 the size ofArray listis 100001
//	 Removing the elements from the end of list
//	 The list Array listhas taken3ms
//	 the size ofLinked Listis 100001
//	 Removing the elements from the end of list
//	 The list Linked Listhas taken42ms
	 
	 
//	 for (int i =90000; i <  92000; i++ ){
//		 list.remove(i);
//	 }
	 
//	 System.out.println("Adding the elements at the beginning of the list");
//	 for (int i = 0 ; i < elementToAdd ; i++){
//		 list.add(0,i);
//	 }
// The result is :
//	 the size ofArray listis 100001
//	 Adding the elements at the beginning of the list
//	 The list Array listhas taken2020ms
//	 the size ofLinked Listis 100001
//	 Adding the elements at the beginning of the list
//	 The list Linked Listhas taken7ms

//	 System.out.println("Removing the elements at the beginning of the list");
//	 for (int i = 0 ; i <= 100 ; i++){
//		 list.remove(i);
//	 }
// The result is 
//	 the size ofArray listis 100001
//	 Removing the elements at the beginning of the list
//	 The list Array listhas taken7ms
//	 the size ofLinked Listis 100001
//	 Removing the elements at the beginning of the list
//	 The list Linked Listhas taken0ms

	 System.out.println("Adding the elements in between the list");
	 for (int i= 0; i <= 2000 ; i++){
		 list.add(5000,i);
	 }
// The result is :
//	 the size ofArray listis 100001
//	 Adding the elements in between the list
//	 The list Array listhas taken46ms
//	 the size ofLinked Listis 100001
//	 Adding the elements in between the list
//	 The list Linked Listhas taken25ms

	 long endTime = System.currentTimeMillis();
	 long duration = endTime - startTime;
	 System.out.println("The list "+ listType + "has taken" + duration + "ms");
	 
 }
}
