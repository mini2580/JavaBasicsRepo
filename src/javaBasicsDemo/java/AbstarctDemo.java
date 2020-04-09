package javaBasicsDemo.java;

public class AbstarctDemo extends AbstarctStudent {
	
	public static void main(String[] args){
		AbstarctDemo c1 = new AbstarctDemo();
		c1.displayInfo();
		c1.SecurityInfo();
	
			
		}

	/* (non-Javadoc)
	 * @see javaBasicsDemo.java.AbstarctStudent#SecurityInfo()
	 */
	@Override
	public void SecurityInfo() {
		System.out.println("The security information is needed");
		
	}


}
