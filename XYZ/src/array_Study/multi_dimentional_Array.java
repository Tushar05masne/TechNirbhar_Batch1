package array_Study;

public class multi_dimentional_Array {

	public static void main(String[] args) {
		
		
		int[][] matrix= {{3,5,7},{6,7,1},{8,1,4}};
		
		                          //c1,c2,c3
		
		//row and column ---row_0==> 3,5,7
		//row and column ---row_1==> 6,7,1
		//row and column ---row_2==> 8,1,4

		
		
		//System.out.println("my_matrix_is "+matrix[1][2]);
		
		
		for(int i=0;i<=2;i++) {
			
			for(int j=0;j<=2;j++) {
			
			System.out.println(matrix[i][j]+" ");
			
			
			}
			
			System.out.println();

		}

	}

}
