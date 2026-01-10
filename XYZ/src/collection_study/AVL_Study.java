package collection_study;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Vector;

public class AVL_Study {

	public static void main(String[] args) {

//		String[] a=new String[2];     //Array created using new keyword and index		
//		a[0]="Gajanan";
//		a[1]="M";
//		
//		String [] b= {"Gajanan","M"};   //Array created --using array literal

		ArrayList al = new ArrayList();

		LinkedList ll = new LinkedList();

		Vector vl = new Vector();

		// ----------------arraylist study--------

		al.add("Tom");
//		al.add(120);
//		al.add('A');
//		al.add(23.24);
//		al.add(34.454545d);
		al.add("Tom");
		al.add(null);
		al.add(null);
		al.add("Tom");
//		al.add(0);
		al.add("Dick");
		al.add("Harry");     //5
		
		//al.add(5, "Akshay");
		
		al.add("A");
		al.add("B");

		ArrayList al2 = new ArrayList();

		al2.add("Dick");
		al2.add("Harry");
		al2.add("A");
		al2.add("B");
		
		
		System.out.println(al.get(5));

		if (al.containsAll(al2)) {

			System.out.println("Pass TC1");
		} else {
			System.out.println("Fail TC1");
		}

		 Enumeration<String> e = vl.elements(); //not for list //----- Forward only

		System.out.println("-------------Iterator use-------------");

		Iterator<String> itr = al.iterator(); // ---- Forward only

		String rs = null;
		rs="";
		rs=" ";
		
		
		
		while (itr.hasNext()) {

		     rs = itr.next();

			if  (!Objects.isNull(rs) && rs.contains("Tom")  && !rs.equals(""))  {

				itr.remove();
				// System.out.println(al);

			}

		}
		System.out.println(al);

		System.out.println("-------------ListIterator use-------------");

		ListIterator<String> l_itr = al.listIterator(); // ---bidirectional retrieval

		while (l_itr.hasNext()) {

			System.out.println(l_itr.next());

		}
		while (l_itr.hasPrevious()) {
			System.out.println(l_itr.previous());
		}

	}

}
