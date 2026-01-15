package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

// Legacy classes - The classes which are introduces in JDK 1.0 version and when JDK 1.2 version came, those classes are modified and placed in JDK 1.2 version.
					// In JDK1.2 Version, Collection framework gets introduced.
					// All legacy classes are synchronized 

// Vector (IC) - Legacy class introduced in JDK 1.0 version and modified in JDK 1.2
		//	implementation class of List interface present in java.utils package
		// Data Structure - Re-sizable Array
		// Default Capacity - 10	if we insert more than it's capacity then new_capacity = old_capacity*2
		// index based data structure and store heterogeneous data type values
		// duplicates and multiple null values are allowed
		// follows the insertion order and does not follow sorting
		// synchronized collection

public class Vector_Demo {

	public static void main(String[] args) {

		Vector v = new Vector();	
		
		// Adding elements
		v.add(10);
		v.add("Mahesh");
		v.add("Ganesh");
		v.add(null);
		v.add(10);
		
		v.addElement(null);			// it is also used to add an element in Vector  
		v.addElement('A');
		v.addElement(29.34);
				
		System.out.println("Vector:"+v);	// [10, Mahesh, Ganesh, null, 10, null, A, 29.34]
		
//		Iterator itr = v.iterator();	
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		ArrayList al = new ArrayList();
		al.add(30);
		al.add("Aarya");
		al.add('Z');
		System.out.println("ArrayList"+al);		//[30, Aarya, Z]
		
		// Adding collection (arraylist)
		v.addAll(al);
		System.out.println("The vector after adding arraylist:"+v);		// [10, Mahesh, Ganesh, null, 10, null, A, 29.34, 30, Aarya, Z]
		
		// Adding at first and last
		v.addFirst("Jignesss");
		v.addLast("Mukessss");
		System.out.println(v);			// [Jignesss, 10, Mahesh, Ganesh, null, 10, null, A, 29.34, 30, Aarya, Z, Mukessss]
		
		System.out.println("The capacity: "+v.capacity());	// 20
		System.out.println("The size is:"+v.size());		// 13
		
		System.out.println(v.contains(30));		// true
		
		System.out.println(v.elementAt(7));		// A
		System.out.println(v.get(7));			// A
		System.out.println(v.getFirst());		// Jignesss
		System.out.println(v.getLast());		// Mukessss
		System.out.println(v.firstElement());	// Jignesss
		System.out.println(v.lastElement());	// Mukessss
		
		System.out.println(v.indexOf("Aarya"));	// 10
		System.out.println(v.lastIndexOf(null));	// 6
		
		v.remove(4);				// removes element at index 4
		System.out.println(v);					// [Jignesss, 10, Mahesh, Ganesh, 10, null, A, 29.34, 30, Aarya, Z, Mukessss]
		
		//update the value at specific index
		v.set(5, "Pritesssss");
		System.out.println("Pritesssss updated at index 5: "+v); 	// [Jignesss, 10, Mahesh, Ganesh, 10, Pritesssss, A, 29.34, 30, Aarya, Z, Mukessss]
		
//		v.removeAllElements();		// removes all the elements
//		System.out.println(v);		// []

		System.out.println(v.isEmpty()); // false
		
		v.removeFirst();		// removes first element
		v.removeLast();			// removes last element
		System.out.println(v);		// 	[10, Mahesh, Ganesh, 10, Pritesssss, A, 29.34, 30, Aarya, Z]
		
		
		v.clear();				// clears/removes all the elements
		System.out.println(v);	// []
		
		System.out.println(v.isEmpty());	// true
		
		
		
	}

}
