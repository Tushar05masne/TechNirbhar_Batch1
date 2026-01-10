package exception_handling;

public class Throw_Study {

	public static void main(String[] args) {

		int age = 19;

		if (age < 18) {
			
			
			throw new IllegalArgumentException("Age must be 18 or above!");
			
		}

		System.out.println("Access granted!");
	}
}
