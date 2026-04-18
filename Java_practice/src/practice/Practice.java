package practice;

public class Practice {

	static int a = 10;
	static int b = 60;

	public static void main(String[] args) {

		print_name();
		System.out.println("");
		System.out.println("*********************************************************************");
		System.out.println("");

		basic_operator();
		System.out.println("");
		System.out.println("*********************************************************************");
		System.out.println("");

		datatypes();
		System.out.println("");
		System.out.println("*********************************************************************");
		System.out.println("");

		accept_two_datatypes(100,200L,15.32f,150.45,'A',true,"Ashish");
		System.out.println("");
		System.out.println("*********************************************************************");
		System.out.println("");
		
		ascii_Value();
		System.out.println("");
		System.out.println("*********************************************************************");
		System.out.println("");
	}

	public static void print_name() {
		
		System.out.println("**************Print Name**************");

		System.out.println("My name is ASHISH.");

	}

	public static void basic_operator() {
		
		System.out.println("**************Basic Operators**************");

		int c = 50;
		int d = 35;

		System.out.println("Addition of a and d is " + (a + d));

		System.out.println("Substraction of b and c is " + (b - c));

		System.out.println("Multiplication of a and b is " + (a * b));

		System.out.println("Division of c and d is " + ((float) c / b));

		System.out.println("Division of c and d is " + ((double) c / b));

	}

	public static void datatypes() {

		byte a = 100;
		short b = 200;
		int c = 12345;
		long d = 98765430L;
		float e = 12.34f;
		double f = 12345.6789;
		char g = 'A';
		boolean h = true;
		String i = "Ashish Masne";
		

		System.out.println("**************Different Data Types**************");
		System.out.println("Byte Value = " + a);
		System.out.println("Short Value = " + b);
		System.out.println("Integer Value = " + c);
		System.out.println("Long Value = " + d);
		System.out.println("Float Value = " + e);
		System.out.println("Double Value = " + f);
		System.out.println("Character Value = " + g);
		System.out.println("Boolean Value = " + h);
		System.out.println("String Value = " + i);

		// "\n" means start by living line

		System.out.println("\nCombined Message Using Concatenation");
		System.out.println("My name is " + i + ", Byte Value is " + a + ", Boolean Value is " + h + "!");
	}

	public static void accept_two_datatypes( int n, long o, float p, double q, char r, boolean s,
			String t) {

		System.out.println("**************Accept Two Data Types**************");
		System.out.println("Addition of l and m is " + (n + o));
		System.out.println("Subtraction of p and q is "+((float)p+q));
		System.out.println("My name is "+ t + " . I am "+ s +" friend"); 

	}
	
	private static void ascii_Value() {
		
		System.out.println("**************ASCII Values**************");
		System.out.println("ASCII stands for 'American Standard Code for Information Interchange' ");
		
		 System.out.println("\n**************ASCII Values for A to Z**************");
	        for (char ch = 'A'; ch <= 'Z'; ch++) {
	            System.out.println(ch + " = " + (int) ch);
	        }

	        System.out.println("\n**************ASCII Values for a to z**************");
	        for (char ch = 'a'; ch <= 'z'; ch++) {
	            System.out.println(ch + " = " + (int) ch);
	        }

	        System.out.println("\n**************ASCII Values for 1 to 9**************");
	        for (char ch = '1'; ch <= '9'; ch++) {
	            System.out.println(ch + " = " + (int) ch);
	        }
	    }
	
	
	}
	
