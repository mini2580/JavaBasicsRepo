package javaBasicsDemo.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMaps {

	public static void main(String[] args) {
		//Maps are collection framework where it stores the data in key, value pair 
		//One pair of key, value is called an entry
		// key will always be unique, values can be duplicated 
		// If we will try to give two different values for a single key, 
		//the last value will be retained i.e. will will overwrite the first one
		
		Map<Integer, String> myMap = new HashMap<Integer, String>();
		
		myMap.put(1, "value1");
		myMap.put(2, "value2");
		myMap.put(3, "value3");
		myMap.put(4, "value2");
		
		for (Map.Entry<Integer, String>  item : myMap.entrySet() ){
			int key = item.getKey();
			String value = item.getValue();
			System.out.println(" key: " + key + ", Value:" + value );
		}
		
// Again we have three types of Maps :
		// Hash Maps : Access the elements in any order 
		// LinkedHashMap : Access the elements in the order , they are put
		// TreeMap: Access the elements using the natural sorting techniques
	
		
		//Linked Hash Map 	
		Map<String, String> linkMap = new LinkedHashMap<String, String>();
		
		linkMap.put("Name", "Mini");
		linkMap.put("Addr", "20 Street");
		linkMap.put("phone", "5678877898");
		linkMap.put("college", "Asten");
		
		for(Map.Entry<String, String> item : linkMap.entrySet()){
			String key = item.getKey();
			String value = item.getValue();
			System.out.println("key :" + key + ", Value:" + value);
			
		}
		
		//TreeMap
		
		Map<String, String> treeMap = new TreeMap<String, String>();
		
		treeMap.put("Name", "Mini");
		treeMap.put("Addr", "20 Street");
		treeMap.put("phone", "5678877898");
		treeMap.put("college", "Asten");
		
		for(Map.Entry<String, String> item : treeMap.entrySet()){
			String key = item.getKey();
			String value = item.getValue();
			System.out.println("key :" + key + ", Value:" + value);
			
		}
			
	}

}
