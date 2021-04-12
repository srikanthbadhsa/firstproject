package corejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValues {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fInput=new FileInputStream("C:\\Users\\VINOD\\eclipse-workspace\\TestNGExamples\\src\\corejava\\file.properties");
		prop.load(fInput);
		System.out.println("This is userName:"+prop.getProperty("UserName"));
		System.out.println("This is Password:"+prop.getProperty("Password"));
		prop.setProperty("UserName", "Kumar");
		prop.setProperty("Password", "9502910957");
		FileOutputStream fOutput=new FileOutputStream("C:\\Users\\VINOD\\eclipse-workspace\\TestNGExamples\\src\\corejava\\file.properties");
		prop.store(fOutput, null);
		
				
		

	}

}
