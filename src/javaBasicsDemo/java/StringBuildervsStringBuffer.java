package javaBasicsDemo.java;

public class StringBuildervsStringBuffer {

	public static void main(String[] args) {
		// StringBuilder and StringBuffer are used to concatenate the strings 
		// StringBuilder  - non synchronized methods means not thread safe , however 
		// faster than StringBuffer
		
		StringBuilder sb = new StringBuilder();
		
		long starttime = System.currentTimeMillis();
		for (int i = 1; i < 1000000; i++){
			sb.append("TestTime");
		}
		
		long endtime = System.currentTimeMillis();
		long duration = endtime - starttime ;
		System.out.println("Time duration for StringBuilder:" + duration);
		
		//StringBuffer - Synchronized methods means thread safe 
		StringBuffer strbuff = new StringBuffer();
		long starttime1 = System.currentTimeMillis();
		for (int i = 1; i < 1000000; i++){
			strbuff.append("TestTime");
		}
		
		long endtime1 = System.currentTimeMillis();
		long duration1 = endtime1 - starttime1 ;
		System.out.println("Time duration for StringBuffer:" + duration1);

	}

}
