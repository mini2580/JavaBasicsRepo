package javaBasicsDemo.java;

public class Loginpage {
	
	// generating a explicit no argument constructor 
	
	public Loginpage() {
		this.userName = "Default";
		this.password = "Default";
		System.out.println("Executing the constructor without arguments");
	}
	
	// Generating the constructor with arguments
	
	public Loginpage(String userName, String password){
		
		this.userName = userName;
		this.password = password;
		System.out.println("Executing the constructor with arguments");
	}
	private String userName;
	private String password;
	
	public void login(){
		
		System.out.println("You have successfully Logged In");
			}

	// Generating getters and setters to access the values of private member variables
	
	public void setUserName(String userName){
		if (userName == "Admin"){
			this.userName = userName;
		}
		else 
		{
			System.out.println("Username supplied is not correct");
		}
		
	}
	
	public String getUserName(){
		return this.userName;
	}
	
	public void setPassword(String password){
		if (password == "password01"){
			this.password = password;
			
		}
		else {
			System.out.println("password supplied is not correct");
		}
		
	}
	public String getPassword(){
		return this.password;
		
	}
}
