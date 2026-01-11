package collectionDemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

// Cursor: Used to retrieve elements/objects of the collections one by one
// 3 types : --> 1. Enumeration	(Legacy cursor)		2. Iterator	(Universal cursor)		3. ListIterator (Best Cursor) 
	
// 1. Enumeration (I)--> 	2 methods -->  .hasMoreElements() - to check is there a next element, 	.nextElement() - go to the next element
						//  Forward direction only
						// used only with legacy(old) classes. Not a universal cursor
						// read only cursor. We can not update or remove the elements of the collection.
						//we can not use it for list/ArrayList.

// 2. Iterator 	(I)	-->		3 methods --> .hasNext() - to check is there a next element,	.next() - to go to next element,	.remove() - to remove element
					// Applicable to all the collection objects.
					//  Forward direction only.	
					// Universal cursor. - we can use it with any collection type(List, Set, TreeSet,)
					// we can use it for read,remove operations. We can not use it for replace/update and addition of new elements operations

// 3. ListIterator (I) -->	 Child interface of Iterator. all methods of Iterator are by default available in ListIterator

						// Only applicable for List implemented class objects. - ArrayList,LinkedList.

						//	9 methods -->	3 for Forward direction, 3 for Backward direction, 3 for add,update and remove operations
						// .hasNext() - to check is there a next element,	.next() - to go to next element,	.nextIndex() - for next index
						//.hasPrevious() - to check is there a previous element,	.previous() - to go to previous element,	.previousIndex() - for prev index
						//.remove() - to remove element,		.set(Object new)- to update,		.add(Object new) - to add new object/element 

						// to overcome the limitations of the iterator, we use ListIterator
						// Bidirectional - Forward as well as backward
						// read, remove, replace/update, addition of new elements operations  

public class Cursor_study {

	public static void main(String[] args) {
		
		Vector v = new Vector();		
		ArrayList al = new ArrayList();
				
		
		v.add(10);
		v.add("Amol");
		v.add('A');
		v.add(true);
		
		System.out.println("Elements in v: "+v);

		System.out.println("----------------");

		// With enumeration
		
		Enumeration e = v.elements();			// need to create an object of Enumeration.
												// we can not use it for list/ArrayList
		
		System.out.println("Elements with Enumeration:");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println("----------------");
	
		al.add(v);
		System.out.println("Arraylist elements: ");
		for(Object o:al) {
			System.out.println(o);
		}
		
		al.add(" ");
		al.add(null);
		al.add(45);
		al.add("Anil");
		System.out.println(al);

		System.out.println("----------------");
		
		// with iterator
		
		Iterator it = al.iterator();							// al - any collection object
		System.out.println("Arraylist Elements with Iterator:");
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}	
	
		ArrayList al2 = new ArrayList();
		for(int i=0;i<=10;i++) {
			al2.add(i);
		}
		System.out.println("ArrayList2 elements: "+al2);
				
		Iterator itr = al2.iterator();

		System.out.println("The even numbers in ArrayList2 are:");
		
		while(itr.hasNext()) {
			int i =  (int) itr.next();
			if(i%2==0) {
				System.out.println(i);
			}
			else {
				itr.remove();
			}
		}
		
			
		// with ListIterator
		
		LinkedList l = new LinkedList();
		
		l.add("Akshay");
		l.add("Salman");
		l.add("10");
		l.add("true");
		l.add("Mahesh");
		l.add("null");
		
		System.out.println("Linked list: "+l);
		
		ListIterator ltr = l.listIterator();
		
		
//		while(ltr.hasNext()) {
//			String s =  (String)ltr.next();
//			if(s.equals("true")) {
//				ltr.remove();
//			}
//			else if(s.equals("Salman")) {
//				ltr.add("Arbaj");
//			}
//			else if(s.equals("null")) {
//				ltr.set("null is replaced");
//			}
//		}
//		
//		System.out.println(l);
		
		
		System.out.println("ListIterator elements in forward direction: ");
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}

		System.out.println("ListIterator elements in backward direction: ");
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
				
		
	}

}
