package collection_study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.TreeSet;

public class Set_Study {

	public static void main(String[] args) {
		
		
		
		  TreeSet<Object> ts=new TreeSet();
	        
	        
	        
		
		
		ArrayList al=new ArrayList();
		
		al.add("Ashish");
		al.add("Ashish");
		al.add("Monika");
		al.add("Mahesh");
		al.add("Mitali");
		al.add("Bhushan");
		al.add("Tejshwini");
		al.add("Madhuri");
		al.add("Madhuri");
		al.add("Gajanan");
		al.add("TOM");
		al.add("DICK");
		al.add("Harry");
		al.add(null);
		al.add(null);
		al.add(23.44);
		
		//set-->
		
		HashSet hs=new HashSet();
		
		
		hs.add("Ashish");
		hs.add("Ashish");
		hs.add("Monika");
		hs.add("Mahesh");
		hs.add("Mitali");
		hs.add("Bhushan");
		hs.add("Tejshwini");
		hs.add("Madhuri");
		hs.add("Madhuri");
		hs.add("Gajanan");
		hs.add("TOM");
		hs.add("DICK");
		hs.add("Harry");
		
		hs.add(null);
		hs.add("Neel");
		hs.add(null);
		
		
		hs.remove(null);
		
		System.out.println(hs);
		
		Iterator it=hs.iterator();
		
		hs.add("Sachin");

        System.out.println(hs);
		
        
        System.out.println("_____________________________________________________");
        
        
        LinkedHashSet lhs=new LinkedHashSet();
        
        lhs.add("Ashish");
        lhs.add("Ashish");
        lhs.add("Monika");
        lhs.add("Mahesh");
        lhs.add("Mitali");
        
        
        lhs.add("Bhushan");
        lhs.add("Tejshwini");
        lhs.add("Madhuri");
        lhs.add("Madhuri");
        lhs.add("Gajanan");
        lhs.add("TOM");
        lhs.add("DICK");
        lhs.add("Harry");
		
        lhs.add(null);
        lhs.add("Neel");
        lhs.add(null);
		
		
        lhs.remove(null);
        
		Iterator i2t=lhs.iterator();
		
        LinkedHashSet lhs2=new LinkedHashSet();

		
		while(i2t.hasNext()) {

			Object x = i2t.next();
			
			
			lhs2.add(x);
			ts.add(x);
			
        if(x.equals("Mitali")) {
        	
        	lhs2.add("Sachin");
        	
        	
        
        }
		}
        
        System.out.println(lhs2);
        
        
        System.out.println("==================================================");
        
      
       
		
       
     
      System.out.println(ts);

	}
	


}
