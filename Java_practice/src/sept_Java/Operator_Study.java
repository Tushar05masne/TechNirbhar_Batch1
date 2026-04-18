package sept_Java;

public class Operator_Study {
	
	static int z=459;
	static int x=459;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=z+x;
		
		System.out.println("Sum of two number is "+sum);

		int substaction=z-x;
		
		System.out.println("substaction of two number is "+substaction);
		
		//----/
		
		float  div=z/x;
		
		System.out.println(div);
		
		int mult=z*x;
		
		System.out.println("mult of two numb "+mult);
		
		//----------   >,<,<=,>=
		
		
		if(z!=x) {
			
			System.out.println("z and x are not equal");
			
		}else {
			System.out.println("z and x are equal");

		}

	}

}
