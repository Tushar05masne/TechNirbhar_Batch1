package Tejaswini_Program_List4;

public class UpperPyramid {
	
	//Upper Pyramid Star Pattern (Also called Full Pyramid / Center Pyramid)

	public static void main(String[] args) {
		 int n = 5;   // number of rows

	        for (int i = 1; i <= n; i++) {

	            // Print spaces
	            for (int s = 1; s <= n - i; s++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }

	            // Move to next line
	            System.out.println();
	        }

	}

}
