package Tejaswini_Program_List4;

public class FourthQuadrantStar {

	//4th Quadrant Star Pattern Right-angled triangle (Right aligned – Decreasing)
	
	public static void main(String[] args) {
		 int n = 5;   // number of rows

	        for (int i = n; i >= 1; i--) {

	            // Print spaces
	            for (int s = 1; s <= n - i; s++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }

	}

}
