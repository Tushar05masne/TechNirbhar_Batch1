package collectionDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//LinkedHashMap (IC) - child class of the HashMap - exactly same as HashMap including methods
		// Data structure - Linked List + HashTable
		// insertion order is preserved
		// The only difference in HashMap and LinkedHashMap is that insertion order is preserved in LinkedHashMap. introduced in 1.4 version
		// In LinkedHashMap we have Doubly Linked List which is used to store the elements in order as we have inserted/created.
		// Slower as compared to HashMap because of the insertion order preservation

public class LinkedHashMap_Demo {

	public static void main(String[] args) {
		
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("Apple",10);
		hm.put("Orange",49);
		hm.put("Banana",19);
		hm.put("Pinapple",80);
		
		//System.out.println("Fruit HashMap: "+hm);	// {Apple=10, Pinapple=80, Orange=49, Banana=19} --> insertion order does not preserved

		for(Map.Entry entry:hm.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		//		Output:
		//		Apple  10
		//		Pinapple  80
		//		Orange  49
		//		Banana  19
	
		
		//LinkedHashMap lhm = new LinkedHashMap();	
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		
		// Adding pairs
		lhm.put(101, "Ajit");
		lhm.put(10, "Bunty");
		lhm.put(320, "Sakshi");
		lhm.put(78, "Babli");
		lhm.put(90, "Mahesh");
		lhm.put(590, "Arya");
		System.out.println(lhm);		// {101=Ajit, 10=Bunty, 90=Mahesh, 590=Arya, 320=Sakshi, 78=Babli} --> insertion order preserved
		
		for(Map.Entry entry:lhm.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		//		Output:
		//		101  Ajit
		//		10  Bunty
		//		320  Sakshi
		//		78  Babli
		//		90  Mahesh
		//		590  Arya
	}

}
