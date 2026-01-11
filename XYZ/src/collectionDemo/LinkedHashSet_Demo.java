package collectionDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

// same as HashSet. The only difference is that, the insertion order is preserved in LinkedHashSet while it is not preserved in HashSet
// insertion order preserved
// Internal Data Structure - HashTable + Linked List
// initial size - 16,	Load factor - 0.75


public class LinkedHashSet_Demo {

	public static void main(String[] args) {

		HashSet <Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		System.out.println("Hash Set elements:"+hs);					// [50, 20, 40, 10, 30]
		
		LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
		lset.add(10);
		lset.add(20);
		lset.add(30);
		lset.add(40);
		lset.add(50);
		System.out.println("Linked Hash Set elements:"+lset);			// [10, 20, 30, 40, 50]
			
		
		
	}

}
