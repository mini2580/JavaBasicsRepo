package javaBasicsDemo.java;
import java.util.Properties;
import java.io.IOException;
import java.io.FileInputStream;


public class propertiesDemo {

	public static void main(String[] args) throws IOException {
		// Reading an external files and its properties
		
		String path = "C:\\Users\\Mini\\Documents\\Testing\\java\\javaBasicsDemo\\src\\javaBasicsDemo\\java\\test.properties"; 
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(path);
		
		prop.load(fs);
		
		System.out.println("Username is "+ prop.getProperty("Username"));
		//System.out.println(prop.);
		

	}

}
