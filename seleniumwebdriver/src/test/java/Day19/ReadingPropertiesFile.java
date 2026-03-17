package Day19;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {

		//location of properties file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		// create an object of Properties and load the file
		Properties propobj = new Properties();
		propobj.load(file);
		
		//reading from properties file
		String url = propobj.getProperty("appurl");
		String email = propobj.getProperty("email");
		String pwd = propobj.getProperty("password");
		String ordrid = propobj.getProperty("orderid");
		String custid = propobj.getProperty("customerid");
		      
		System.out.println(url+"  "+email+"  "+pwd+"  "+ordrid+"  "+custid);
		
		//reading all the keys from properties file
		Set<Object>	keys = propobj.keySet();
		System.out.println("Keys are: "+keys);
		
		// all values from properties file
		
		Collection<Object> values = 	propobj.values();
		System.out.println("Values are: "+values);
		
		file.close();
		
	}

}
