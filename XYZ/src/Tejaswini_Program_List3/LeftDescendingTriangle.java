package Tejaswini_Program_List3;

public class LeftDescendingTriangle {

	public static void main(String[] args) {
		 int n = 5;

	        for (int i = n; i >= 1; i--) {         // Outer loop for rows
	            for (int j = 1; j <= i; j++) {     // Inner loop for stars
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	}

}
