package javaBasicsDemo.java;

public abstract class AbstarctStudent {
	String StName = "mini";
	int StRollno = 1234;
	 
	public void displayInfo(){
		System.out.println("Student" + StName + "has Roll no." + StRollno );
		
	}
   public abstract void SecurityInfo();
}
