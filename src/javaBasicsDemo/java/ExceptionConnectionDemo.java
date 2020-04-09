package javaBasicsDemo.java;

import java.sql.SQLException;

public class ExceptionConnectionDemo {

	public static void main(String[] args) {
		SqlConnection sq = new SqlConnection();
		
		try{
		sq.reterive("Mini");
		}
		catch (SQLException e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("this block will always get executed");
			System.out.println("Database NOT FOUND");
		}
	}

}
