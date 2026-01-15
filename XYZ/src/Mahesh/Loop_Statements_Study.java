package Mahesh;

// if, if-else, if-else-if, nested if-else, switch case, while loop,do..while loop, for loop


// UN---MM1234
// PW---MM_893
// Captcha---asdher6293
// Login-success---logged in success


public class Loop_Statements_Study {

	static String name = "Ganesh";
	static int age = 60;
	int marks = 82;
	
	static String UN = "MM1234";
	static String PW = "MM_893";
	static String Captcha = "asdher6293";
	static String Login = "success";

	
	public void whileLoop() {	
		int i=50;						//initialization
		while(i<=100) {					// condition check
			System.out.println(i);
			i++;						//increment
		}			
	}
	
	// even if condition not matched/failed, do-while loop executes at least once
	public void dowhileLoop() {			
		int j=0;						// initialization
		do {
			j--;						//decrement
			System.out.println(j);		// it will print -1 and then checks the condition as j>0.
		}while(j>0);					// condition check
	}
	
	public void forLoop() {
		for(int i=10;i>=0;i--) {			//(initialization;condition check;increment/decrement)
			System.out.println(i);
		}
	}
	
	//print all the even numbers from 1 to 100 with do-while loop
	
	public void print_even_numbers() {	
		int a=1;
		do {
			if(a%2==0) {
				System.out.println(a);
			}
			a++;
		}while(a<=100);		
	}
			
	public void if_else_method() {
		
		if(name.equals("Mahesh")) {
			System.out.println("Hello,"+name);
		}
		else {
			System.out.println("Hi,how are you "+name+"?");
		}
	}	
	
	public void if_else_if_method() {
		
		if(marks>=90) {
			System.out.println("Excellent! A+ grade.");
		}else if(marks>=70) {
			System.out.println("Very good! A grade.");
		}else if(marks>=60) {
			System.out.println("Good! B grade.");
		}else if(marks>=40) {
			System.out.println("OK! C grade.");
		}else {
			
			System.out.println("You are failed!");
		}	
	}
			
	public void nested_ifelse_method() {
		
		if (UN.equals("MM1234")) {
			System.out.println("Username is correct. Please enter password");
			if(PW.equals("MM_893")) {
				System.out.println("Password is correct. Please enter given Captcha.");
				if(Captcha.equals("asdher6293")) {
					System.out.println("Captcha is correct. Please click on Login button");			
					if(Login.equalsIgnoreCase("success")) {
						System.out.println("Login Successful!");
						}
					else {
						System.out.println("Login failed!!! Please contact Administration.");
							}
						}	
				else {
					System.out.println("Captcha is incorrect. Please enter valid given Captcha.");
					}		
				}
			else {
				System.out.println("Password is incorrect. Please enter valid Password.");
				}		
			}
		else {
			System.out.println("UN is incorrect.Please enter valid username.");
			}
	}
	
	public void switch_case() {	
		int day = 5;
		
		switch(day) {
		case 1: System.out.println("Monday");
				break;
		case 2: System.out.println("Tuesday");
				break;
		case 3: System.out.println("Wednesday");
				break;
		case 4: System.out.println("Thursday");
				break;
		case 5: System.out.println("Friday");
		 		break;
		case 6: System.out.println("Saturday");
				break;
		case 7: System.out.println("Sunday");
				break;
		default:
				System.out.println("Invalid option.");
		}	
		
		String month = "July";
		
		switch(month) {
		case "January":	System.out.println("1st Month");
						break;
		case "February": System.out.println("2nd Month");
						break;
		case "March" :	System.out.println("3rd Month");
						break;
		case "April" : System.out.println("4th Month");
						break;							
		case "May" : System.out.println("5th Month");
						break;	
		case "June" : System.out.println("6th Month");
						break;							
		case "July" : System.out.println("7th Month");
						break;									
		case "August" : System.out.println("8th Month");
						break;									
		case "September" : System.out.println("9th Month");
						break;									
		case "October" : System.out.println("10th Month");
						break;									
		case "November" : System.out.println("11th Month");
						break;									
		case "December" : System.out.println("12th Month");
						break;									
		default : System.out.println("Invalid Month");											
		}
					
	}
	

	public static void main(String[] args) {

		Loop_Statements_Study lss = new Loop_Statements_Study();
		//lss.whileLoop();
		//lss.dowhileLoop();
		//lss.forLoop();
		//lss.print_even_numbers();
		//lss.if_else_method();
		//lss.if_else_if_method();
		//lss.nested_ifelse_method();
		lss.switch_case();
				
	}

}
