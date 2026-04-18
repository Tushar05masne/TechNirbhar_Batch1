package collectionDemo;

import java.util.Iterator;
import java.util.PriorityQueue;

// Queue (I) - interface of collection framework - 3 more interfaces - Deque(I), BlockingQueue(I), BlockingDeque
			// Priority queue(IC) , LinkedList(IC) - implementation classes of Queue interface
			// follows FIFO-First In First Out concept. The element enters/In from the Tail part and exits/Out from Head part of the queue
	
			// If we have group of elements which are prior to processing then we can go for Queue

//Priority Queue(IC):
			// Only Homogeneous data allowed
			// Data Structure - Binary Heap
			// PriorityQueue only guarantees that the head element is the highest (or lowest) priority element. 
			//It does NOT guarantee:Sorted order, Insertion order
			// Smallest element is always at the head in Priority Queue and rest of the elements are in any order

//LinkedList (IC):
			// LinkedList is implementation class for 2 interfaces - List (I) and Queue (I)
			// Insertion Order preserved and duplicates are allowed in LinkedList
			// In LinkedList we have same methods as implemented by  Priority Queue. The only difference is that, 
								//Heterogeneous data is not allowed in Priority Queue but allowed in LL

public class Queue_Demo {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		
		// Adding elements
		
		pq.add(49);
		pq.add(20);
		pq.add(90);
		pq.add(40);
		pq.add(70);
		pq.add(50);
		pq.offer(75);
		pq.offer(35);
		
		System.out.println(pq);		// [20, 35, 50, 40, 70, 90, 75, 49] - only head is lowest, other elements are not sorted
		
		System.out.println("The size is: "+pq.size());		// 8
		
		System.out.println(pq.element());	// 20 - gives header element. If queue is empty then throws an exception NoSuchElementException	
		System.out.println(pq.peek()); 		// 20 - gives header element.  if the queue is empty, returns null.
		System.out.println(pq);				// [20, 35, 50, 40, 70, 90, 75, 49]
		
		// Return and remove elements from queue
		System.out.println(pq.poll());		// 20 - removes the header element. if the queue is empty, returns null.
		System.out.println(pq);				// [35, 40, 50, 49, 70, 90, 75]
		System.out.println(pq.remove());	// 35 - removes the head element.  If queue is empty then throws an exception NoSuchElementException
		System.out.println(pq);				// [40, 49, 50, 75, 70, 90]
		
		Iterator itr = pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//		Output:
				//		40
				//		49
				//		50
				//		75
				//		70
				//		90
		
		

	}

}
