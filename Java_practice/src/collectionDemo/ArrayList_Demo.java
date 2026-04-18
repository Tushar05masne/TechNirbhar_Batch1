package collectionDemo;

// Array - collection of data of same data type
// ArrayList - collection of objects of heterogeneous data type. Duplicates, Multiple null are allowed. Insertion order is preserved.
				//If we want to create an ArrayList of the same data type, then we have to mention it specifically with wrapper class.. 

				// if we need to do operations like retrieval operation of an object, then we have to go with the ArrayList. -> best choice
				// if we want to do insertion/ deletion then don't use ArrayList. because at the time of insertion/deletion we need to shift the elements of ArrayList to left or right


// iterator() - method in the ArrayList. when we call the method, it will return 'Iterator' type of object. 
			// whenever we use iterator, we prefer while loop to iterate through it's elements. 1st we need to check is there an element in the ArrayList.
			//  itr.hasNext() - method to check 1st/next element present or not in arrayList.  itr- 'Iterator' type of object
			// itr.next() - method to get the next element in the arrayList.

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo {

	public static void main(String[] args) {

		// Creating ArrayList
		ArrayList mylist = new ArrayList();		// collection of objects of different data type
	
		//ArrayList<Integer> mylist1 = new ArrayList<Integer>();	// collection of objects of Integer data type
		//ArrayList<String> mylist1 = new ArrayList<String>();	// collection of objects of String data type
		//ArrayList<Employee> mylist1 = new ArrayList<Employee>();	// collection of objects of Employee data type
	
		
		//Adding elements in ArrayList
		mylist.add(100);
		mylist.add(20.34);
		mylist.add("Mahesh");
		mylist.add('A');
		mylist.add(true);
		mylist.add(20.34);
		mylist.add(null);
		mylist.add(null);
		
		// Printing ArrayList
		System.out.println("Elements in arraylist: "+mylist);		// [100, 20.34, Mahesh, A, true, 20.34, null, null]
		
		//Size of an ArrayList
		System.out.println("The size of arraylist: "+ mylist.size());	// 8
		
		// Remove elements from ArrayList - give index number
		mylist.remove(5);						// for removing element, we have to know the index number of the element.
		System.out.println("After removal: "+mylist);					// [100, 20.34, Mahesh, A, true, null, null]
		
		// Insert element in ArrayList
		mylist.add(3, "Java");
		System.out.println("After inserion: "+mylist);	//[100, 20.34, Mahesh, Java, A, true, null, null]

		// Update element in ArrayList
		mylist.set(3, "Python");
		System.out.println("After replacing/updating: "+mylist); //[100, 20.34, Mahesh, Python, A, true, null, null]
		
		//Accessing specific element
		mylist.get(2);
		System.out.println(mylist.get(2));		//Mahesh
		
		//Reading data from ArrayList
		System.out.println("Elements in ArrayList are: ");
		//using normal for loop
		for(int i=0;i<=mylist.size()-1;i++) {
			System.out.println(mylist.get(i));
		}
		
		//using for..each loop
		for(Object i:mylist) {
			System.out.println(i);
		}
		
		//using iterator
		Iterator itr = mylist.iterator();		
		
		//System.out.println("---"+itr.next());	 //it will return only the 1st element from the ArrayList - 100
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Check arrayList empty or not
		System.out.println("Is arrayList empty? "+ mylist.isEmpty());
		
		// Remove elements from arrayList
		// 1. Remove specific element - .remove(index)
		// 2. Remove all the elements-	.clear() 
		// 3. Remove multiple elements - need to create other ArrayList for those elements which want to remove. Then call .removeAll(other_list) method
										// remove multiple elements randomly
		
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add(20.34);

		
		mylist.removeAll(mylist2);
		System.out.println("After removing multiple elements: "+mylist);	// [Mahesh, Python, A, true, null, null]
		
		mylist.addAll(mylist2);
		System.out.println("After adding multiple elements:"+mylist);		// [Mahesh, Python, A, true, null, null, 100, 20.34]
				
		 
		mylist.clear();
		System.out.println("Is ArrayList empty? "+mylist.isEmpty());	// true
		
		
		
	}

}
