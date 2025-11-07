package sept_Java;

public class Operators {
	
	//Global variables
	int x = 20;
	int y = 10;
	
	public void performOperations(){
		//local variables
		int a =15;
		int b =7;
		
		System.out.println("-----Local Variables-----");
		System.out.println(" a + b = " +(a + b));
		System.out.println(" a - b = " +(a - b));
		System.out.println(" a * b = " +(a * b));
		System.out.println(" a / b = " +((double)a / b));
		
		System.out.println("------Global  Variables-----");
		System.out.println(" x + y = " +(x + y));
		System.out.println(" x - y = " +(x - y));
		System.out.println(" x * y = " +(x * y));
		System.out.println(" x / y = " +((double)x / y));
		
		
	}
	public static void main(String[] args) {
		Operators obj = new Operators();
		obj.performOperations();
		
	}
	}
