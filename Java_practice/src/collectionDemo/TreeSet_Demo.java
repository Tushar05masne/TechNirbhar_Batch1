package collectionDemo;

import java.util.Iterator;
import java.util.TreeSet;

// TreeSet (IC) - implementation class of Set interface
			// Duplicates are not allowed
			// insertion order - Ascending order of the elements
			// stores homogeneous elements/ same data type elements - if stored heterogeneous then it will not able to compare to other elements
				// eg. how we compare int data type element to String data type element and how it will sort the elements. that's why only homogeneous data
			// non-synchronized data structure. multiple threads can access the same data at the same time
			// null value is not allowed

public class TreeSet_Demo {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();	
		ts.add(100);
		ts.add(89);
		ts.add(10);
		ts.add(45);
		ts.add(100);			// duplicates not allowed
		ts.add(109);
		//ts.add(null);				// NullPointerException
		System.out.println(ts);		// [10, 45, 89, 100, 109]		--> Ascending order of the elements
		
	/*	TreeSet<String> ts1 = new TreeSet<String>();
		
		ts1.add("Pitter");
		ts1.add("Allen");
		ts1.add("Tom");
		ts1.add("Tom");
		ts1.add("Harry");
		ts1.add("Dick");
		
		Iterator itr = ts1.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	*/
		// Output:			Insertion order is Ascending order of alphabets 
		//		Allen
		//		Dick
		//		Harry
		//		Pitter
		//		Tom
				
		
		System.out.println(ts.size()); 		// 5
		
		//ts.addFirst(90);		// through UnsupportedOperationException - as TreeSet supports Ascending order insertion, we can not add element at First or last 
		System.out.println(ts.contains(109)); 	// true
		System.out.println(ts.isEmpty());		// false
		
		ts.remove(89);
		System.out.println(ts);			// [10, 45, 100, 109]
		
		System.out.println(ts.first());		// 10
		System.out.println(ts.floor(105));	// 100	-- it gives one least value from the provided value from the Treeset
		
		System.out.println(ts.pollLast());	// removes last element 
		System.out.println(ts); 			// [10, 45, 100]
		
		System.out.println(ts.getFirst()); // 10
		System.out.println(ts.getLast()); 	// 100
		
		ts.clear();					// deletes all the elements
		System.out.println(ts);		// []
		System.out.println(ts.isEmpty()); 	// true
		
	}

}
