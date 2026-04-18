package collectionDemo;

import java.util.Map;
import java.util.TreeMap;

// TreeMap (IC) -  implementation class of Map Interface
			// elements stored in key,value pair
			// insertion order - in Ascending order of the keys
			// null key is not allowed
			// TreeMap is non-synchronized. i.e. at the same time, multiple threads can access the one node 

public class TreeMap_Demo {

	public static void main(String[] args) {

		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		
		tm.put(89,"Apple");
		tm.put(50,"Banana");
		tm.put(100,"Chicku");
		tm.put(44,"Pinaple");
		tm.put(29,"Guava");
		tm.put(189,"Orange");
		tm.put(645,"Coconut");
		
		for(Map.Entry entry:tm.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
			//		Output:						// It gives us output in Ascending order of the key
			//			29  Guava
			//			44  Pinaple
			//			50  Banana
			//			89  Apple
			//			100  Chicku
			//			189  Orange
			//			645  Coconut
		

		System.out.println("Total entries:"+tm.size()); 	// 7
		
		System.out.println(tm.containsKey(100));	// true
		System.out.println(tm.containsKey(105));	// false
		
		System.out.println(tm.containsValue("Orange"));	// true
		System.out.println(tm.containsValue("Sugarcane"));	// false
		
		System.out.println(tm.get(189)); 	// Orange
		
		System.out.println(tm.ceilingKey(55));	// 89	- one key greater than 55 
		System.out.println(tm.floorKey(55));	// 50	- one key lesser than 55
		
		System.out.println(tm.firstKey());		// 29
		System.out.println(tm.lastKey());		// 645
		
		System.out.println(tm.higherKey(180));	// 189	- one key higher than 180
		System.out.println(tm.lowerKey(180));	// 100	- one key lower than 180 
		
		System.out.println(tm.ceilingEntry(50));	// 50=Banana	// 50 key present so it gives that pair
		System.out.println(tm.floorEntry(50));		// 50=Banana
		
		System.out.println(tm.ceilingEntry(80));	// 89=Apple		- one entry higher than 180
		System.out.println(tm.floorEntry(80));		// 	50=Banana	- one entry lower than 180
		
		System.out.println(tm.firstEntry());	// 29=Guava
		System.out.println(tm.lastEntry());		// 645=Coconut
		
		System.out.println(tm.higherEntry(25));		// 29=Guava
		System.out.println(tm.lowerEntry(30));		// 29=Guava
		
		System.out.println(tm.ceilingEntry(45));	// 50=Banana	- one entry higher than 45
		System.out.println(tm.floorEntry(144));		// 100=Chicku	- one entry lower than 144
		
		System.out.println(tm.isEmpty()); 		// false
		
		System.out.println(tm.keySet()); 				// [29, 44, 50, 89, 100, 189, 645]		- gives set of keys
		System.out.println(tm.descendingKeySet());		// [645, 189, 100, 89, 50, 44, 29]		- gives set of keys in descending order
		
		System.out.println("Headmap of 100:"+tm.headMap(100));	// {29=Guava, 44=Pinaple, 50=Banana, 89=Apple} - key value pairs ahead of 100
		System.out.println("Tailmap of 100:"+tm.tailMap(100));	// {100=Chicku, 189=Orange, 645=Coconut}		- key value pairs at the tail-side of 100
		
//		tm.putFirst(10, "Tom");
//		tm.putLast(390, "Dick");
		
		tm.remove(50);					// removes key value pair of 50
		System.out.println(tm);				// {29=Guava, 44=Pinaple, 89=Apple, 100=Chicku, 189=Orange, 645=Coconut}
		
		System.out.println(tm.pollFirstEntry());	// 29=Guava	- removes FirstEntry
		System.out.println(tm);						// {44=Pinaple, 89=Apple, 100=Chicku, 189=Orange, 645=Coconut}
		
		System.out.println(tm.pollLastEntry());		// 645=Coconut	- removes LastEntry
		System.out.println(tm);						// {44=Pinaple, 89=Apple, 100=Chicku, 189=Orange}
		
		tm.replace(100, "Chickuuuuuuuu");
		System.out.println(tm); 					// {44=Pinaple, 89=Apple, 100=Chickuuuuuuuu, 189=Orange}
		
		System.out.println(tm.subMap(50, 160));	 	// {89=Apple, 100=Chickuuuuuuuu}
		
/*		TreeMap<String,Integer> tm1 = new TreeMap<String,Integer>();
		tm1.put("Dell", 19892);
		tm1.put("HP", 73845);
		tm1.put("Asus", 92834);
		tm1.put("Apple", 56382);
		tm1.put("Micro", 88263);
		
		System.out.println(tm1);			// {Apple=56382, Asus=92834, Dell=19892, HP=73845, Micro=88263}
		
*/		
		
	}

}
