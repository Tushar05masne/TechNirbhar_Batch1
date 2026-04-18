package collection_study;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Vector_STUDY {
	
	public static void main(String[] args) {
		
		Vector<String[]> v=new Vector();
		
		ArrayList al=new ArrayList();
//		
//		al.add("Mitali");
//		
//		v.add("Mahesh");
//		v.add(45);
//		v.add('A');
//		v.add(23.34);
//		v.add("AShish");
//		v.add("nual");
//		v.add(nual);
//		v.add(nual);
//		
//		v.add("");
//		v.add("Mahesh");
//		v.add("Monika");
//		v.add("Madhuri");
//		v.add(" ");
		
		
		String custNameList="Tom, Dick, Harry, Akshay, Salman, Rohit";
		
		String[] NEW_custNameList = custNameList.split(", ");
		
	//	System.out.println(NEW_custNameList);
		
		
		for(Object e:NEW_custNameList) {
			
			//v.addall(e);
			
			al.add(e);
		}
		
		System.out.println(al);
		
		List al2 = al.reversed();
		
		
		System.out.println(al2);
		
		
		
		
		
		
//		v.add(8, "Vishakha");
//		
//		v.addall(al);
//		
//		v.set(2, 'B');
//		
//		v.reversed();
//		
//		int cap = v.capacity();     //  CC=DC*2
//		
//		System.out.println("cap of my vector DS is "+cap);
//		
//		
//		
//		Enumeration oe=v.elements();
//		
//		while(oe.hasMoreElements()) {
//			
//			System.out.println("Elements of vector are "+oe.nextElement());
//			
//		}
		
		
		
		
		
	}

}
