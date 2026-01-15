package Tejaswini_Program_List4;

public class ThirdQuadrantStar {
	
	//3rd Quadrant Star Pattern Right-angled triangle (Right aligned – Increasing)

	public static void main(String[] args) {
		int n = 4;   // number of rows

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

	}

}
