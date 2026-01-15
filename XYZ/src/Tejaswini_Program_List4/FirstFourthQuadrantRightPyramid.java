package Tejaswini_Program_List4;

public class FirstFourthQuadrantRightPyramid {

	public static void main(String[] args) {
		 int n = 5;

	        // 1st Quadrant (Increasing)
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // 4th Quadrant (Decreasing)
	        for (int i = n - 1; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	}

}
