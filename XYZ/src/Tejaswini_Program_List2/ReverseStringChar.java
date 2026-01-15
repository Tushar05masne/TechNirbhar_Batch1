package Tejaswini_Program_List2;

public class ReverseStringChar {

	public static void main(String[] args) {
		
		 String str = "Sharayu";  // Given string
	      String reversed = " ";

	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed = reversed + str.charAt(i);
	        }

	        System.out.println("Reversed String: " + reversed);
	  

	}

}
