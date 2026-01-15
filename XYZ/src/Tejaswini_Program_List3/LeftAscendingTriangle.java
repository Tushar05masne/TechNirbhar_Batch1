package Tejaswini_Program_List3;

public class LeftAscendingTriangle {

	public static void main(String[] args) {
		int n = 5;  // Number of rows

        for (int i = 1; i <= n; i++) {         // Outer loop for rows
            for (int j = 1; j <= i; j++) {     // Inner loop for stars in each row
                System.out.print("* ");
            }
            System.out.println();               // Move to next line after each row
        }

	}

}
