package collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

// Map (I) --> HashMap (IC), HashTable(IC)
	// whenever we want to express element in the key and value pair, then go with Map. eg.	empId : empName
	// every key is an object and every value is an object
	// Every key,value pair is called 'Entry'

// HashMap (IC) - class which implements Map interface
		// Map interface is different from the collection interfaces(List, Set, Queue, Deque)
		// Collection of objects of heterogeneous data having key value pair as an element.
		// Data structure - Hash Table.
		// Use hashing technique to store the values.- On the basis of key, JVM will create the Hash Code and data will be stored in the form of HashCode.
		// insertion order does not preserved.
		// default capacity - 16		Load factor - 0.75
		// Key is unique, Value can be duplicated.	--> .keySet() -> return type is Set -> returns a set of keys  
												//		.values() -> return type is collection	-> returns all the values including duplicates
												//	  .entrySet() -> returns all the 'key:value' pairs from the HashMap
		// One null key is allowed
		// HashMap methods are non-synchronized. ie. at the time of execution of one method, other thread can access that method. one method can be accessed by multiple threads at the same time.
		// Not thread safe as multiple threads can access the same method at a time
		// performance is faster as compared to HashTable. as multiple threads can access the same method at a time
		// One null key and multiple null values can be accepted
		// Not a legacy class


		//interface Map{					// we have Map interface and in that we have Entry interface. Each entry of the Hash-table represented by Entry interface
			//	interface Entry{				// Each 'key:value' pair is called Entry. Methods from the Entry interface is only for each entry object in the HasTable
			//									// Entry is the sub-interface of the Map	
			//	}
		//}


public class HashMap_Demo {

	public static void main(String[] args) {

		// declaration
		//HashMap hm = new HashMap();
		HashMap <Integer,String> hm = new HashMap<Integer,String>();
		
		// Adding pairs
		hm.put(101, "Ajit");
		hm.put(104, "Arya");
		hm.put(105, "Sakshi");
		hm.put(102, "Bunty");
		hm.put(103, "Mahesh");
		hm.put(102, "Babli");
		
		System.out.println(hm);		// {101=Ajit, 102=Babli, 103=Mahesh, 104=Arya, 105=Sakshi}
		
		System.out.println("The size of HashMap is: "+hm.size());	//5
		
		//removing the pair
		hm.remove(102);
		System.out.println("Hashmap After removing the '102:Babli' pair: "+hm);	// {101=Ajit, 103=Mahesh, 104=Arya, 105=Sakshi}
		
		// Access value of the key
		System.out.println("The vakue of 104 key: "+ hm.get(104));
		 
		// Access all the keys from hashmap
		System.out.println("All the keys are: "+ hm.keySet());		// [101, 103, 104, 105]
		System.out.println("All the values are: "+ hm.values());	// [Ajit, Mahesh, Arya, Sakshi]
		System.out.println("All the key value pairs are: "+hm.entrySet());	// [101=Ajit, 103=Mahesh, 104=Arya, 105=Sakshi]
		System.out.println();
		
		// reading data from HashMap
		
		// using for..each loop
		System.out.println("Printing pairs by for..each loop:");
		
		for(int k:hm.keySet())
		{
			System.out.println(k+"  "+hm.get(k));
		}
		
		// using Iterator
		System.out.println("Printing pairs by Iterator:");
		
		Iterator<Entry<Integer, String>> itr = hm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		
		
		
		
	}

}
