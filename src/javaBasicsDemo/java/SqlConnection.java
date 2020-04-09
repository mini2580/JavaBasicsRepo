package javaBasicsDemo.java;
import java.sql.*;
public class SqlConnection {
	
	public Connection getConn() throws SQLException{
		String url = "jdbc/c:/localhost:3306";
		String User = "Admin";
		String password = "password01";
		Connection conn = null;
		conn = DriverManager.getConnection(url, User, password);
		
		return conn;
	}

	public void reterive (String Username) throws SQLException{
		getConn();
	}
}
