package exception_handling;

import java.util.Objects;

public class Try_catch {

	public static void main(String[] args) {
		
		try {
			
			int i=10;
			int div=i/0;
			
			System.out.println(div);
			
			String name1="Monika";
			String name2="Monika";

			
			if(!Objects.isNull(name2) &&  name2 .equalsIgnoreCase(name1)) {
				
				System.out.println("NAME MATCHING");
			}
			
			
		}
				
		catch(ArithmeticException e) {
			
			System.out.println("we cant divide any number by zero");
			
			e.printStackTrace();
		
			
		}catch(NullPointerException e2) {
			
			System.out.println("Null string cant we comapre with string ");
			
			e2.printStackTrace();
		
			
		}
		finally {
			
			System.out.println("Finally block executed");
			
		}
		
		m1();
		
		
	}
	
	
	public static void m1() {
		System.out.println("m1 method from Try_catch class");
	}

}
