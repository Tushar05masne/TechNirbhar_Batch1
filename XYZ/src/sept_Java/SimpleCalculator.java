package sept_Java;

public class SimpleCalculator {
	
	 //Addition methods
	 int add(int a, int b) {
		return a + b;
	}
	  float add(float a, float b) {
		 return a + b;
    }
	  double add(double a, double b) {
		return a + b;
	}
	 
	  //Multiplication methods
	  int multiply(int a, int b) {
		 return a * b;
	 } 
	  float multiply(float a,float b) {
		 return a * b;
	 }
	  double multiply(double a,double b) {
		 return a * b;
	 }

	public static void main(String[] args) {
		SimpleCalculator calc = new SimpleCalculator();
		
		//Integer operator
		System.out.println("Addition (int): " + calc.add(10, 20));
		System.out.println("Multiplication (int): " +calc.multiply(10,20));
		
		//float operator
		System.out.println("Addition (float):" +calc.add(10.5f, 20.3f));
		System.out.println("Multiplication (float):" +calc.multiply(10.5f, 20.3f));
		
		//double operator
		System.out.println("Addition (double):" +calc.add(12.75, 5.25));
		System.out.println("Multiplication (double):" +calc.multiply(12.75, 5.25)); 
		
	}
}
