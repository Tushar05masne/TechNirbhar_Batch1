package Tejaswini_Program_List3;

public class EquilateralTriangleDownward {

	public static void main(String[] args) {
		int n = 5;  // Number of rows

        for (int i = n; i >= 1; i--) {             // Outer loop for rows
            // Print spaces before stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();                  // Move to next row
        }

	}

}
