package Mahesh;

// Type Casting -> converting variables from one data type to another

// 1. Implicit Type casting -> Widening -->  converts a smaller type to a larger type	--> done automatically
// 2. Explicit Type casting -> Narrowing -->  converts a larger type to a smaller type	--> need to done manually
//			--> in explicit, data loss can happen  
	

public class Explicit_Implicit_TypeCasting {

	public static void main(String[] args) {

		// implicit conversion	--> from lower to upper
		int a = 100;	
		long b = a;
		float c = b;
		double d = c;
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		char c1 = 'z';
		int i1 = c1;
		System.out.println("i1-->"+i1);		// gives the ASCII value of 'z' ->122
		
		System.out.println("##############");
				
		
		// Explicit conversion	--> from upper to lower	
		long ab=100000000;
		short ab1 = (short) ab;
		int ab2 = (int) ab;
		System.out.println("ab-->"+ab);			// ab-->100000000
		System.out.println("ab1-->"+ab1);		// ab1-->-7936	--> mismatch and data loss happening at the time of conversion
		System.out.println("ab2-->"+ab2);		// ab2-->100000000
		
		double d1 = 18967591.2919;
		System.out.println("d1-->"+d1);			// d1-->1.89675912919E7
		
		float d2 =(float) d1;
		System.out.println("d2-->"+d2);			// d2-->1.8967592E7		--> data loss
		
		double d3 = 3829.984;
		int i = (int) d3;
		System.out.println("i-->"+i);			// i-->3829 		--> data loss
		
		
		char ch = 'D';					// ASCII of 'D' is- 68
		int s = ch+2;					// s-->70
		char ch1 = (char) s;			// converts ASCII value 70 into char --> 'F'
		
		System.out.println("s-->"+s);		// s-->70
		System.out.println("ch1-->"+ch1);	// ch1-->F
		
		
		
	}

}
