package collection_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class List_Study {

	public static void main(String[] args) {
		
		
		
		LinkedList<Object> ll=new LinkedList();
		
		LinkedList<Integer> ll2=new LinkedList();
		
		
		ll2.add(40);
		ll2.add(20);
		ll2.add(30);
		ll2.add(70);
		ll2.add(32);

		

		
		//ArrayList al=new ArrayList();
		
		//al.set(0, al)
		
		ll.add("Tom1");
		ll.add("Tom2");
		ll.add(null);
		ll.add(null);
		ll.add("Tom3");
		ll.add("Dick");
		ll.add("Harry");
		ll.add("Harry");     
		ll.add("Harry");     
		ll.add("A");
		ll.add("B");
		
		
		//System.out.println(ll.get(6));
		
		//System.out.println(ll.poll());   //Retrieves and removes the head (first element) of this list.
		
		//System.out.println(ll.pollLast());
		
		//ll.push("TOM_0");

		ll.remove("Harry");
		
		ll.set(7, "Ashish");
		
		
		//System.out.println(ll);
		
		
	//	Collections.sort(ll2);
		
		ll.sort(Collections.reverseOrder());
		
		System.out.println(ll);

		
//		System.out.println(ll2);
//		
//		
//		Iterator ie=ll.iterator();
//		
//		while(ie.hasNext()) {
//			
//			
//			 Object myList = ie.next();
//			 
//			 
//			 
//			 System.out.println(myList);
//			
//			
//		}
//		

	}

}
