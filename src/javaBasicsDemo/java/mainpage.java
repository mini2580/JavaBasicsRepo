package javaBasicsDemo.java;

public class mainpage {

	public static void main(String[] args) {
		// this is a default constructor running here
		Loginpage user1 = new Loginpage();
		
			
		//user1.setUserName("Admin");
		System.out.println("Getting the Username " + user1.getUserName());
		
		//user1.setPassword("password01");
		System.out.println("Getting the password to login " + user1.getPassword());
		  
		System.out.println("******************************************");
		
		Loginpage user2 = new Loginpage("Admin", "password01");
		System.out.println("Getting the Username " + user2.getUserName());		
		System.out.println("Getting the password to login " + user2.getPassword());
	}

}
