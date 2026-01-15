package Tejaswini_Program_List4;

public class FirstQuadrantStar {

	//1st Quadrant Star Pattern is also called Right Angle Triangle (Left Aligned)
	
	public static void main(String[] args) {
		 int n = 5;   // number of rows

	        for (int i = 1; i <= n; i++) {        // rows
	            for (int j = 1; j <= i; j++) {    // stars
	                System.out.print("*");
	            }
	            System.out.println();             // new line
	        }
	    }
	}


	


