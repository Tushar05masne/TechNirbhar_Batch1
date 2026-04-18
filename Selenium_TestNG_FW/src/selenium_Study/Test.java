package selenium_Study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws IOException {
	
		Properties prop=new Properties();
		
        String properties_file_Path="C:\\Users\\tusha\\OneDrive\\Desktop\\TechNirbhar\\Selenium_TestNG_FW\\Selenium_TestNG_FW\\src\\";
		        
		FileInputStream  fis=new FileInputStream (properties_file_Path+"config.properties");
		
		prop.load(fis);
		
		
		String url_value = prop.getProperty("Environment");
		String browser = prop.getProperty("browser");

		
		System.out.println("url_value is "+url_value);
		
		System.out.println("you are passing browser value as "+browser);
		
		
		
		//write
		

		Properties prop2 = new Properties();

		prop2.setProperty("username", "admin");
		prop2.setProperty("password", "12345");

		FileOutputStream fos = new FileOutputStream(properties_file_Path + "writeData.properties");

		prop2.store(fos, "Updated credentials");
         
        fos.close();

		
		

		
		
	

}
}
