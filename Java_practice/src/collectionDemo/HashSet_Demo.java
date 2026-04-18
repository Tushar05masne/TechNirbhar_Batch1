package collectionDemo;


// Collection of objects of different data types where duplicates are not allowed and insertion order does not preserved.
// internal data structure - HashTable
// Hashcode concept used at the time of inserting elements in the collection.
// initial size/default capacity - 16. 	
// fill-ratio/Load factor - 0.75 - i.e. if we want to add new element in the hashset, and if the hashset is filled with 75% then it will increase the size of the hashset.
// Inserting element at specific index - is not possible, as insertion order does not preserved. Only add element is possible. 

import java.util.ArrayList;

// HashSet - class which implements Set interface 
		// Collection of objects of heterogeneous/different data types. 
		// Insertion order does not preserved. Duplicates, multiple nulls are not allowed.
		//Use hashing technique to store the values

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSet_Demo {

	public static void main(String[] args) {

		// declaration
		HashSet myset = new HashSet();			// HashSet with collection of different data type
		
		//HashSet hs = new HashSet(100);			// HashSet with capacity 100.
		//HashSet hs = new HashSet(100, (float) 0.90);	// HashSet with capacity 100 and Load Factor 90%
		
		//Set myset1 = new HashSet();			// Set - parent class, HashSet - child class --> upcasting
		//HashSet <String> myset1 = new HashSet<String>();	// HashSet with collection of same(String) data type
		
		// adding elements into HashSet
		myset.add(750);
		myset.add(75.5);
		myset.add(true);
		myset.add("Mahesh");
		myset.add("More");
		myset.add(null);
		myset.add("Mahesh");
		myset.add('A');
		myset.add(null);
		
		//Printing HashSet
		System.out.println(myset);				//[null, More, A, 75.5, Mahesh, 750, true]		- insertion order does not preserved

		//Size of an HashSet
		System.out.println("The size of HashSet is: "+myset.size());	// 7
		
		//Removing specific value
		myset.remove(75.5);					// 75.5 is value here (not index)	
		System.out.println("After removing: "+myset);			// [null, More, A, Mahesh, 750, true]
			
		//myset.removeAll(myset);		// removes all the values
		
		// contains() will check the specific element is present or not
		System.out.println(myset.contains(null));	// true
		System.out.println(myset.contains(75.5));	// false
		
		System.out.println("Is HashSet Empty? "+myset.isEmpty());	// false
			
		
		// Accessing specific element - not possible directly. but with workaround it is possible.
									// we have to convert HashSet into ArrayList and then we can access the specific element with its index
		
		// 1. Convert HashSet--> ArrayList		2. Access the element with the index
		ArrayList al = new ArrayList(myset);
		System.out.println("Array List:"+al);
		System.out.println(al.get(3));			// Mahesh
		
		
		// Reading all the elements using for..each loop. With for loop, its not possible because we dont have indexing in the HashSet.
		System.out.println("Reading elements with for..each loop:");
		for(Object x:al) {
			System.out.println(x);
		}
		
		// Reading all elements by iterator
		System.out.println("Reading elements with iterator:");
		Iterator itr = myset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	System.out.println("====================================");	
		
		HashSet<Integer> evenNumbers = new HashSet<Integer>();
		
		evenNumbers.add(20);
		evenNumbers.add(40);
		evenNumbers.add(60);
		System.out.println("Even numbers are:"+evenNumbers);		//[20, 40, 60]
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		// addAll() - adds all the elements from 1 set to other 
		numbers.addAll(evenNumbers);
		System.out.println("Numbers are:"+numbers);		// [20, 40, 60]
		numbers.add(10);
		System.out.println(numbers);			// [20, 40, 10, 60]
		
		// removeAll()
		numbers.removeAll(evenNumbers);
		System.out.println(numbers);			//[10]
		
		System.out.println("====================================");	
		
		System.out.println("Union, Intersection, Difference");

		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		hs1.add(1);		
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		System.out.println("HashSet 1: "+hs1);				// [1, 2, 3, 4, 5]
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		System.out.println("HashSet 2:"+hs2);				// [3, 4, 5]
		
		// Union
		//hs1.addAll(hs2);
		//System.out.println("Union is:"+hs1);				// [1, 2, 3, 4, 5]
		
		//intersection
		//hs1.retainAll(hs2);
		//System.out.println("Intersection is:"+hs1);			// [3, 4, 5]
		
		// Difference
		//hs1.removeAll(hs2);
		//System.out.println("Difference is:"+hs1);			//[1, 2]
		
		// Subset
		System.out.println(hs1.containsAll(hs2));			// true --> is the hs2 subset of hs1?
		
		
		
		
		
	
	}

}
