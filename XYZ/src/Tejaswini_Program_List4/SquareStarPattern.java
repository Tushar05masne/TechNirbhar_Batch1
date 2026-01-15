package Tejaswini_Program_List4;

public class SquareStarPattern {

	public static void main(String[] args) {
		int n = 5;   // size of square

        for (int i = 1; i <= n; i++) {          // rows
            for (int j = 1; j <= n; j++) {      // columns
                System.out.print("*");
            }
            System.out.println();               // new line after each row
        }
	}

}
