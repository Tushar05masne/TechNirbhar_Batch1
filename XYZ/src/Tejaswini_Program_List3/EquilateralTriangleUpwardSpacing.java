package Tejaswini_Program_List3;

public class EquilateralTriangleUpwardSpacing {

	public static void main(String[] args) {
		 int n = 4;  // Number of rows

	        for (int i = 1; i <= n; i++) {             // Outer loop for rows
	            // Print spaces before stars
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");             // Space for alignment
	            }
	            // Print stars with spaces
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");            // Star followed by space
	            }
	            System.out.println();                  // Move to next row
	        }

	}

}
