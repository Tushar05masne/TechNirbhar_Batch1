package exception_handling;

import java.io.IOException;

public class Use_Custom_exception extends Illegal_INPUT_exception  {

	
	public Use_Custom_exception(String Message) {
		super(Message);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException, Illegal_INPUT_exception {
		
		app1();
		
//		  String input = "";
//
//	        if (input.isEmpty()) {
//	            throw new Illegal_INPUT_exception("Input cannot be empty!");
//	        }
//
//	        System.out.println("Valid input: " + input);
//	    }

		
		
		

	}
	public void finalize() {
		
	}
	
	public  static void  app1() throws IOException {
		
		String UN="Gajanan";
		String captcha="xctpz";
		
		if(!UN.equals("Gajanan")) {
			
			InvalidUser("Used name entered is wrong");
		}
		else {
			System.out.println("please enter captcha");
		}
		if(!captcha.equals("xctpz1223")) {
			
			Wrong_Captcha("Wrong captcha used");
		}else {
			
			System.out.println("Login success");
		}
	}

	
}

