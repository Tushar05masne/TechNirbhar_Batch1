package collection_practice;

import java.util.ArrayList;

public class ArrayList_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList a1=new ArrayList();
        
        a1.add("Tom");
        a1.add(130);
        a1.add('T');
        a1.add(48.355);
        a1.add("Tom");
        a1.add(null);
        a1.add(null);
        a1.add("Tom");
        a1.add(0);
        
        System.out.println(a1.get(1));
        
        System.out.println(a1.size());
	}

}
