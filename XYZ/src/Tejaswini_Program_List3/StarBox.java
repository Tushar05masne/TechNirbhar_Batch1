package Tejaswini_Program_List3;

public class StarBox {

	public static void main(String[] args) {
		int n = 5;  // Size of the box (number of rows and columns)

        for (int i = 1; i <= n; i++) {           // Outer loop for rows
            for (int j = 1; j <= n; j++) {       // Inner loop for columns
                System.out.print(" * ");
            }
            System.out.println();  // Move to next line after each row
        }

	}

}
