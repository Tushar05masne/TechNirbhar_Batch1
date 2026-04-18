package Monika;

public class notepad_practice1 {
	
		
		static int a = 10;
		static int b = 20;
		static int c,d;
		static long l;
		static double g;
		
		public static void main(String[] args) {
			name();
			addition(20, 50);
			multiply();
			subtract(87654322, 76543234);
			divide(12.5, 2.5);
			message();
			
		}

		public static void name(){
		System.out.println("Healo...!! My Name is Monika");

		}

		public static void addition(int x, int y) {
			c=x+y;
			System.out.println("Addition of two number is " +c);	
		}
		
		public static void multiply(){
			d=a*b;
			System.out.println("Multiplication of two number is " +d);
		}

		public static void subtract(long j, long k){
			l=j-k;
			System.out.println("Subtraction of two number is " +l);
		}
		
		public static void divide(double e, double f){
			g=e/f;
			System.out.println("Dividation of two number is " +g);
		}

		public static void message(){
		byte m = 125;
		short n = -3456;
		boolean r = true;
		char s = 'A';
		String p = " Maximum recorded temperature was ";
		String v = " while deepest underwater trench measurement relative to sea level reached ";
		
		System.out.println("Weather:" +s +p +m +" degrees" +v +n +" feet");
		}

	}


