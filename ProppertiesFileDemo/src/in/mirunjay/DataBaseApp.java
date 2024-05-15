package in.mirunjay;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataBaseApp {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("datbase.properties");
		Properties p = new Properties();
		
		p.load(fis);
		System.out.println(p);
		String UserName = p.getProperty("UserName");
		String pwd = p.getProperty("Pwd");
		String driver = p.getProperty("Driver");//Key not present
		System.out.println("UserName  : "+UserName);
		System.out.println("Password  : "+pwd);
		System.out.println("Driver    : "+driver);//null
		fis.close();
		

	}

}
