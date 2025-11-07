package sept_Java;

public class ASCIIvalue {

	public static void main(String[] args) {
		
		System.out.println("ASCII values for A to Z:");
		for (char ch = 'A'; ch <= 'Z';ch++) {
			System.out.println(ch + " = " + (int)ch);
           }
		
		System.out.println("\nASCII values for  a to z:");
		for (char ch ='a'; ch <='z'; ch++) {
			System.out.println(ch + " = " + (int)ch);
		}
		
		System.out.println("nASCII values for  1 to 9:");
		for (char ch ='1'; ch <='9'; ch++) {
			System.out.println(ch + " = " + (int)ch);
		}
	 }
	}
