package Tejaswini_Program_List3;

public class RightAscendingTriangle {

	public static void main(String[] args) {
		 int n = 5;

	        for (int i = 1; i <= n; i++) {           // Outer loop for rows
	            for (int j = 1; j <= n - i; j++) {   // Print spaces
	                System.out.print("  ");
	            }
	            for (int j = 1; j <= i; j++) {       // Print stars
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	}

}
