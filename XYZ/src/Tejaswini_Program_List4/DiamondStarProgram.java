package Tejaswini_Program_List4;

public class DiamondStarProgram {
	
	//Diamond Star Pattern (Upper Pyramid + Lower Pyramid)

	public static void main(String[] args) {
		int n = 70;

        // Upper Pyramid
        for (int i = 1; i <= n; i++) {

            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // Lower Pyramid
        for (int i = n - 1; i >= 1; i--) {

            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }
	}
}
