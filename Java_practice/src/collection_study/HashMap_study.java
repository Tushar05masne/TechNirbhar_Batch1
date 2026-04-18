package collection_study;

import java.awt.AWTException;
import java.util.HashMap;

public class HashMap_study {
	
	private static HashMap hm=new HashMap();


	public static void main(String[] args) {
		
		
			
		
//		HashMap hm=new HashMap();
//		
//		//key and value
//		
//		hm.put("Name1", "Monika");
//		hm.put("Name2", "Ashish");
//		hm.put("Name3", "Mitali");
//		hm.put("Name4", "Mahesh");
//		hm.put("Name5", "Tejshwini");
//		hm.put("Name6", "Bhushan");
//		hm.put("Name7", "Vishakha");
//		hm.put("Name8", "Madhuri");
//		
//		System.out.println(hm.get("Monika"));
		
		
				
		setValue("Name1","Monika");
		setValue("Name2","Ashsih");
		setValue("Name3","Mahesh");
		setValue("Name4","Bhushan");
		
		
		getValue();


	}
	
	public static void setValue(String k, String V) {
		
		hm.put(k, V);		
	}
	public  static  HashMap<String, String> getValue() {
		
		System.out.println(hm);
		return hm;
	}
	
	public void finalize() {
		
		System.out.println("hi");
	}
	

}
