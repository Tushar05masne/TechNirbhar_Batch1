package collection_study;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class ArrayList_study {

	public static void main(String[] args) {
		
		
		
		//--------------------------------LIST
		
		ArrayList al=new ArrayList();
		
		LinkedList l=new LinkedList();
		
		Vector vl=new Vector();
		
		
		//-----------------------------------SET
		
		HashSet hs=new HashSet();
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		TreeSet ts=new TreeSet();
		
		ts.add(null);
		ts.add(null);
		ts.add(null);
		

		
		
		
		//---------------------------------------QUEUE
		
		
		PriorityQueue pq=new PriorityQueue();
		
		
		//----------------------------DEQUE
		
		ArrayDeque ad=new ArrayDeque();
		
		
		
		//-------------------------------------------MAP
		
		HashMap hm=new HashMap();
		
		EnumMap em=new EnumMap(Day.class);
		
		
		em.put(Day.MONDAY, "Work");
		em.put(Day.TUESDAY, "Gym");
		
		System.out.println(em);
		
		
		ConcurrentHashMap chm=new ConcurrentHashMap();

		chm.putAll(chm);
		
		Hashtable ht=new Hashtable();
		
		ht.put(ht, al);
		
		
	 //-------------------------------------------USES
		
		hm.put("Key", "value");
		hm.put("name1", "TOM");
		hm.put("name2", "Dik");
		hm.put("name3", "Harry");
		
		
		System.out.println(hm.get("name3"));



		
		
		al.add("Tom");
		al.add(120);
		al.add('A');
		al.add(23.24);
		al.add(34.454545d);
		al.add("Tom");
		al.add(null);
		al.add(null);
		al.add("Tom");
		al.add(0);
		
		System.out.println(al.get(1));
		
		System.out.println(al.size());
		
		int i = al.size()-1;
		
		System.out.println(i);


	}

}
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}
