package Mahesh;

public class FindASCIICode {
	
	void ASCIIOfUppercaseLetters(){				
		for(char i='A'; i<='Z'; i++){
			System.out.println("The ASCII Value of "+i+" is "+ (int)i);
			}
		}


	void ASCIIOfLowercaseLetters(){
		for(char i='a';i<='z';i++){
			System.out.println("The ASCII Value of "+i+" is "+ (int)i);		
		}
	}


	void ASCIIOfDigits(){
		for(char i='0';i<='9';i++){
			System.out.println("The ASCII Value of "+i+" is "+ (int)i);

			}		
		}

	public static void main(String args[]){		

		FindASCIICode ascii = new FindASCIICode();

		ascii.ASCIIOfUppercaseLetters();

		System.out.println("####################################");

		ascii.ASCIIOfLowercaseLetters();

		System.out.println("####################################");
		
		ascii.ASCIIOfDigits();
	}

}
