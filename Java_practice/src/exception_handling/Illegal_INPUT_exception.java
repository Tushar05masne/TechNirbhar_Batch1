package exception_handling;

import java.io.IOException;

public class Illegal_INPUT_exception extends Exception {


	
	
	public  Illegal_INPUT_exception(String Message) {
		
		super(Message);
		
	}
	
	public static void InvalidUser(String message) throws IOException {
		
		throw new IOException(message);
	}
    public static void Wrong_Captcha(String message1) throws IOException {
		
		throw new IOException(message1);
	}
	

}
