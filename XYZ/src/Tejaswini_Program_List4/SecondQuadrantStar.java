package Tejaswini_Program_List4;

public class SecondQuadrantStar {
	
	//2nd Quadrant Star Pattern Right Angle Triangle (Left Aligned – Reverse)

	public static void main(String[] args) {
		int n = 5;   // number of rows

        for (int i = n; i >= 1; i--) {        // rows
            for (int j = 1; j <= i; j++) {    // stars
                System.out.print("*");
            }
            System.out.println();             // new line
        }

	}

}
