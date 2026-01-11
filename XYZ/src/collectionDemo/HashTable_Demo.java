package collectionDemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// HashTable (IC) - class which implements Map interface
			// Collection of objects of heterogeneous data having key value pair as an element.
			//  Key is unique, Value can be duplicated.
			// Data structure - HashTable	- On the basis of key, JVM will create the Hash Code and data will be stored in the form of HashCode.- Hashing technique	
			// insertion order does not preserved.
			//default capacity - 11		Load factor - 0.75
			// HashTable methods are synchronized. ie. at a time one thread can access one method. At the time of execution of a method, other thread can not access that method.	 
			// Thread safe as one threads can access the one method at a time
			//performance is poor/low as compared to HashMap. as one threads can access the one method at a time
			// null is not accepted either as a key or a value. 
			// Legacy class


public class HashTable_Demo {

	public static void main(String[] args) {
		
		// Declaration
		//Hashtable ht = new Hashtable();
		//Hashtable ht = new Hashtable(initial capacity, fill ratio/load factor)
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		
		ht.put(101,"Shekhar");
		ht.put(102,"Tom");
		ht.put(103,"Dick");
		ht.put(104,"Harry");
		//ht.put(null,"Maddy");		// NullPointerException	- nulls are allowed in Hashtable
		//ht.put(105, null);		// NullPointerException- nulls are allowed in Hashtable
		
		System.out.println(ht);		// {104=Harry, 103=Dick, 102=Tom, 101=Shekhar}
		
		System.out.println(ht.get(103));	// Dick
		
		ht.remove(103);
		System.out.println(ht);				// {104=Harry, 102=Tom, 101=Shekhar}
		
		
		System.out.println(ht.containsKey(104));		// true
		System.out.println(ht.containsKey(105));		// false
		System.out.println(ht.containsValue("Tom"));	// true
		System.out.println(ht.containsValue("David"));	// false
		
		ht.replace(104, "Harry", "Maddy");
		System.out.println(ht);				// {104=Maddy, 102=Tom, 101=Shekhar}
		
		System.out.println(ht.isEmpty());		// false
		
		System.out.println(ht.keySet());		// [104, 102, 101]
		System.out.println(ht.values());		// [Maddy, Tom, Shekhar]
		System.out.println(ht.entrySet());		// [104=Maddy, 102=Tom, 101=Shekhar]	entrySet- key,value pair
		
	/*	for(int i:ht.keySet()) {
			System.out.println(i+"  "+ht.get(i));
		}
	*/
		
		// Entry specific methods
	/*	System.out.println("Entry specific methods..");
		for(Map.Entry entry:ht.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
			// Output:
			//		104  Maddy
			//		102  Tom
			//		101  Shekhar
		*/
		
		
		// iterator
		Set s = ht.entrySet();		// it wll gives us all the entrySet in key value pair	
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
			
		}
		// Output:
		//		104  Maddy
		//		102  Tom
		//		101  Shekhar
		
		
		
	}

}
