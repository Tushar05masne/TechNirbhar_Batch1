package exception_handling;

import java.io.IOException;

public class Throws_study {
	
	

	// Method declares it may throw ArithmeticException
	
	public  int divide(int a, int b) throws  ArithmeticException {
		
		if(b==0) {
			throw new ArithmeticException();
		}
		return a / b; // may throw ArithmeticException if b = 0
	
	}

	public static void main(String[] args)   {
		
//		try {
//			int result = divide(10, 0); // risky call
//			System.out.println("Result: " + result);
//		} catch (ArithmeticException e) {
//			System.out.println("Exception caught: " + e.getMessage());
//		}
		
		Throws_study o1=new Throws_study();
		
		
		o1.divide(34,2);
		try {
			o1.fileRead();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	
	}
	
	public static int multi(int a, int b) throws ArithmeticException {
		return a * b; // may throw ArithmeticException if b = 3.33f
	
	}
	
    public void fileRead() throws IOException  {
    	
    	String filePath="";

		if (filePath.equals("")) {
			
			
			throw new IOException("file path cant be empty");
			
		}

		System.out.println("File found");
	}
    	
    
}
