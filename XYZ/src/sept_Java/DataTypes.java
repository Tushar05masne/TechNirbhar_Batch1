package sept_Java;

public class DataTypes {

	public static void main(String[] args) {
		byte b = 103;
		short s = 200;
		int i = 25000;
		long l = 78126600L;
		float f =12.75f;
		double d = 5668.00;
		char c = 'A';
		boolean bool = true;
		String name = "Sharayu Masne";
		
		System.out.println("Byte value = "+b);
		System.out.println("Short value ="+s);
		System.out.println("Int value ="+i);
		System.out.println("Long value ="+l);
		System.out.println("Float value ="+f);
		System.out.println("Double value ="+d);
		System.out.println("Char value ="+c);
		System.out.println("Boolean value ="+bool);
		System.out.println("String value ="+name);
		
		//concatenation message
		// "\n" means start by living line
		System.out.println("\nCombined Message Using concatenation ");
		System.out.println("\nHello , my name is " + name + ".My grade is " + c + " and I scored "+ f + "marks.");
			
	}

}
