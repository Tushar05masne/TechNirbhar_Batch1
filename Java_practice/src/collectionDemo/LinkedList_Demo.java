package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


// Collection (I)	--> root interface in the Collection Framework that represents a group of objects as a single entity. --> Data structure / container
			// List -> ArrayList, LinkedList, Vector				Set -> HashSet, LinkedHashSet, TreeSet	
			//Queue -> PriorityQueue, LinkedList, Deque				Map-> HashMap, LinkedHashMap,  TreeMap, HashTable  


// Collections (C) --> It is a utility class that contains static methods to operate on collection objects. --> Helper / utility methods
				// Key operations:	Sorting, Searching, Synchronization, Finding max/min, Making collections unmodifiable
				// Private constructor , we can not create an object of Collections class.
				// All the methods are static
				// Commonly Used methods of Collections class:
					//	.sort() -> Sort elements,		.reverse() -> Reverse order,	 .shuffle()	-> Random order, 	max() -> Maximum element
					//  .min() ->	Minimum element,	.synchronizedList()	-> Thread-safe list,		.unmodifiableList()	->	Read-only list


//	Collections.sort(al)
// Collections.sort(al, Collections.reverseOrder());

public class LinkedList_Demo {

	public static void main(String[] args) {

		// Declaring Linked List
		LinkedList lst = new LinkedList();			// for heterogeneous data
		
		// LinkedList<Integer> lst = new LinkedList<Integer>();			// if we want Integer objects only in Linked List
		// LinkedList<String> lst = new LinkedList<String>();			// if we want String objects only in Linked List

		
		// Add elements in LL
		lst.add("Mahesh");
		lst.add(10);
		lst.add('X');
		lst.add(null);
		lst.add(true);
		lst.add(" ");
		lst.add("Ajit");
		
		System.out.println("Direct printing: "+lst);		// [Mahesh, 10, X, null, true,  , Ajit]

		System.out.println("Printing with iterator: ");
		Iterator it = lst.iterator();
		
		while(it.hasNext()) {
			Object	ele = it.next();
			System.out.println(ele);
		}
		
		System.out.println("The size of Linked List is: "+lst.size());	// 7
		
		// remove element at specific index
		lst.remove(5);		// 5-index
		System.out.println("Linked List after removing 5th index value: "+lst);		// [Mahesh, 10, X, null, true, Ajit]
		
		// adding/inserting element at specific index
		lst.add(2, "Abhiraj");
		System.out.println("After adding element at 2nd index: "+lst);			//  [Mahesh, 10, Abhiraj, X, null, true, Ajit]
		
		// retrieving value
		System.out.println("Value at 0th index: "+lst.get(0));			// Mahesh
		
		//update the value at specific index
		lst.set(4,45.57);
		System.out.println("After updating value at 4th index:"+lst);			// [Mahesh, 10, Abhiraj, X, 45.57, true, Ajit]
	
		// contains
		System.out.println(lst.contains("Ajit"));			// true
		System.out.println(lst.contains("Python"));			// false
		
		// Add First and Add Last elements
		lst.addFirst(90);
		lst.addLast("Python");
		
		System.out.println("After adding elements at 1st and last index: "+lst);		// [90, Mahesh, 10, Abhiraj, X, 45.57, true, Ajit, Python]
	
		// 1st and last element of LL
		System.out.println("1st element of LL: "+lst.getFirst());		// 90
		System.out.println("Last element of LL: "+lst.getLast());		// Python
			
		
		ArrayList al = new ArrayList();
		al.add(700);
		al.add(200);
		al.add(500);
		al.add(400);
		al.add(10);
		
		lst.addAll(al);		// by default it will add at last
		System.out.println("After adding all elements from ArrayList 'al': "+lst);		// [90, Mahesh, 10, Abhiraj, X, 45.57, true, Ajit, Python, 700, 200, 500, 400, 10]
		
		// Adding all elements at specific index
		lst.addAll(7, al);
		System.out.println(lst);			// [90, Mahesh, 10, Abhiraj, X, 45.57, true, 700, 200, 500, 400, 10, Ajit, Python, 700, 200, 500, 400, 10]
		
		
		// removing all the elements of ArrayList from LinkedList 
		lst.removeAll(al);
		System.out.println("After removing all the elements of 'al' from the 'lst': "+lst);		// [90, Mahesh, Abhiraj, X, 45.57, true, Ajit, Python]
		
	// Sorting of data happened with the same type of data
		// Sorting of elements in ascending order
		System.out.println("Before sorting:"+al);		//[700, 200, 500, 400, 10]
		Collections.sort(al);
		System.out.println("After sorting:"+al);		//[10, 200, 400, 500, 700]
		

			
		// reverse order
		Collections.reverse(al);
		System.out.println("Reversed:"+al);		// [700, 500, 400, 200, 10]
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Reverse Order:"+al);  		//[700, 500, 400, 200, 10]
		
		
		// removing 1st and last element of LL
		lst.removeFirst();
		lst.removeLast();
		System.out.println("After removing 1st and last element: "+lst);		// [Mahesh, Abhiraj, X, 45.57, true, Ajit]
		
	}

}
