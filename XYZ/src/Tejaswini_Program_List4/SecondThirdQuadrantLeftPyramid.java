package Tejaswini_Program_List4;

public class SecondThirdQuadrantLeftPyramid {

	public static void main(String[] args) {
		 int n = 5;

	        // 2nd Quadrant (Decreasing)
	        for (int i = n; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // 3rd Quadrant (Increasing)
	        for (int i = 2; i <= n; i++) {   // start from 2 to avoid repetition
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	}

}
