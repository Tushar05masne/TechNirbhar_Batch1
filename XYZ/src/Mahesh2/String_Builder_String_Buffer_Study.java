package Mahesh2;

// String	-->		Immutable in nature. when we change the string it will create a new object in the memory.

//String Buffer --> Slower as compared to StringBuilder, synchronized, thread safe, used for multi-threaded applications
		// String Buffer is slower because all of its methods are synchronized -> one thread at a time -> safety but less speed.

// String Builder --> Faster but Not synchronized, Not thread safe, used for single threaded applications.
		// String Builder is faster because it has no synchronization, so multiple threads can access without blocking -> more speed.


public class String_Builder_String_Buffer_Study {

	
	public static void main(String[] args) {

	String a = "Ab tak cchappan ";
	System.out.println(a);
	
	System.out.println("Memory address of a: "+System.identityHashCode(a)); //1528902577 
	a = "Don ";
	System.out.println(a);
	System.out.println("Memory address of a: "+System.identityHashCode(a));	// 1159190947 - memory address got changed. new abject created and stored in this location
	
	String b = new String("Aahatt ");
	String c = new String("Hero ");
	
	System.out.println(b);
	System.out.println(c);
	
	StringBuilder sb = new StringBuilder();
	StringBuffer sbf = new StringBuffer();

	System.out.println("Memory address of sb: "+System.identityHashCode(sb));	//1927950199
	
	sb.append("The fav movies are: ");
	System.out.println(sb);
	System.out.println("Memory address of sb: "+System.identityHashCode(sb));	//1927950199

	
	sbf.append("The fav fav movies are: ");
	System.out.println(sbf);
	
	
	sbf.ensureCapacity(10);
	System.out.println(sbf+"---Capacity");
	
	sbf.delete(8, 20);
	System.out.println(sbf);
	
	sb.append(a).append(b).append(c);	
	System.out.println(sb);
	System.out.println("Memory address of sb: "+System.identityHashCode(sb));	// 1927950199
	
	System.out.println(sb.indexOf("A"));
	
	sb.reverse();
	System.out.println(sb);		
	sb.reverse();
	System.out.println(sb);

	sb.delete(3, 7);
	System.out.println(sb);
	
	//System.out.println(sb.chars());
	//System.out.println(sb.repeat(7, 5));
	
	System.out.println(sb.substring(8,20));
	System.out.println(sb);
	System.out.println("Memory address of sb: "+System.identityHashCode(sb));	// 1927950199 --> same memory address for all the StringBuilder/StringBuffer objects
																				// New object does not created and all the changes happened in the same object. mutable.
	}

}
