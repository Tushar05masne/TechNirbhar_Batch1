package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class readJson {
	
	
	public static void main(String[] args) throws IOException {
		
		  //  String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\tusha\\OneDrive\\Desktop\\TechNirbhar\\TechN_sele_maven\\src\\test\\resources\\Test.json")));
	       
		    String content = new String(Files.readAllBytes(Paths.get("src/test/resources/Test.json")));
		    
		    JSONObject obj = new JSONObject(content);
	        
		    //JSONArray myArray = obj.getJSONArray("skills");
		    
		    //System.out.println(myArray);
	        
	        JSONObject employee = obj.getJSONObject("TC2");

	        int id = employee.getInt("id");
	        String name = employee.getString("name");
	        String role = employee.getString("role");
	        boolean active = employee.getBoolean("active");

	        System.out.println(id + " - " + name + " - " + role + " - " + active);
		
	}

}
