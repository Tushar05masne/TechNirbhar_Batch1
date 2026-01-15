package Tejaswini_Program_List3;

public class RightDescendingTriangle {

	public static void main(String[] args) {
		int n = 5;  // Number of rows

        for (int i = n; i >= 1; i--) {           // Outer loop for rows
            for (int j = 1; j <= n - i; j++) {   // Print spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {       // Print stars
                System.out.print("* ");
            }
            System.out.println();                 // Move to next line
        }

	}

}
