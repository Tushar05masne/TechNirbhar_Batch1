package collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Demo1 {

	public static void main(String[] args) {

		//HashMap hm = new HashMap();							// if we dont provide any specific datatype for key and value then each key and each value will be treated as Object
		HashMap<Integer,String> hm = new HashMap<Integer,String>();		// key - integer type, value - string type.
		
		hm.put(101, "Mahesh");
		hm.put(102, "Aniket");
		hm.put(103, "Amol");
		hm.put(104, "Jerry");
		hm.put(105, "Sandip");
		hm.put(102, "Tom");					// 102-Aniket replaced by 102-Tom as we are giving duplicate key
		hm.put(106, "Jerry");

		
		System.out.println("Hash Map is:"+hm);		// {101=Mahesh, 102=Tom, 103=Amol, 104=Jerry, 105=Sandip, 106=Jerry}
		
		System.out.println(hm.get(104));			// Jerry
		
		hm.remove(106);					// removes pair from hashmap
		System.out.println("After removing 106 entry:"+hm);		// {101=Mahesh, 102=Tom, 103=Amol, 104=Jerry, 105=Sandip}

		System.out.println(hm.containsKey(105));			// true
		System.out.println(hm.containsKey(106));			// false
		
		System.out.println(hm.containsValue("Jerry"));		// true
		System.out.println(hm.containsValue("Aadesh"));		// false

		System.out.println("Is HashMap empty?"+hm.isEmpty()); 	//false
		
		System.out.println("All the keys are:"+ hm.keySet());		// returns all the keys as Set because duplicate keys are not allowed -	[101, 102, 103, 104, 105]
		System.out.println("All the values are:"+ hm.values());		// return all the values as Collection because duplicate values allowed-  [Mahesh, Tom, Amol, Jerry, Sandip]
		System.out.println("All the entries are:"+hm.entrySet());	// returns all the entries as Set	- [101=Mahesh, 102=Tom, 103=Amol, 104=Jerry, 105=Sandip]
	
		
	/*	// If we don't provide the data types to the keys and values at the time of creating an object of HashMap, everything is an Object type	
		System.out.println("The keys are:");
		for(Object k:hm.keySet()) {
			System.out.println(k);
		}
		System.out.println("The values are:");
		for(Object v:hm.values()) {
			System.out.println(v);
		}
		
		System.out.println("The key and value pairs are:");
		for(Object k:hm.keySet()) {
			System.out.println(k+"   "+hm.get(k));
		}		
	*/	
		
		// If we provide the data types to the keys and values at the time of creating an object of HashMap
		System.out.println("The keys by for-loop are:");
		for(int k:hm.keySet()) {
			System.out.println(k);			
		}

		System.out.println("The values by for-loop are:");
		for(String v:hm.values()) {
			System.out.println(v);
		}
	
		// Entry methods
		//****************
	/*	System.out.println("The key value pairs by Entry method:");		
		for(Map.Entry entry:hm.entrySet()) {
				System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
	 */
		// iterator	
		System.out.println("The key value pairs by iterator:");	
		Set s = hm.entrySet();
		Iterator itr = s.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());				// it will gives the output as key value pair but in different format like '102=Tom'
//		}
		
		while(itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());	// it will gives the output as key value pair like '102   Tom'
		}
		
	}

}
