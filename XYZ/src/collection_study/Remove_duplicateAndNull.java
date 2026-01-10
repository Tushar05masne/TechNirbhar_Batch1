package collection_study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class Remove_duplicateAndNull {

	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();


		al.add("Tom");
		al.add("Tom");
		al.add(null);
		al.add(null);
		al.add("Tom");
		al.add("Dick");
		al.add("Harry");     //5
		
		//al.add(5, "Akshay");
		
		al.add("A");
		al.add("B");
		
		System.out.println(al);
		
		TreeSet ts=new TreeSet();
		
		
		Iterator<String> itr = al.iterator(); // ---- Forward only

		
		while (itr.hasNext()) {

		    String  rs = itr.next();

			if  (!Objects.isNull(rs))  {

				ts.add(rs);
				
			}

	}
		System.out.println(ts);


}
}
