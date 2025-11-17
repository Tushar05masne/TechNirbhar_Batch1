package Mahesh;

public class BasicNumberOperations {

	int addition(int a, int b){
		return a+b;
	}

	float substraction(float a, float b){
		return a-b;
	}
	
	long multiplication(int a, int b){
		return a*b;
	}

	float divide(float a,int b){
		return a/b;
	}

	public static void main(String args[]){

	BasicNumberOperations bno = new BasicNumberOperations();

	int add = bno.addition(100,20);
	float sub = bno.substraction(10.5f,5.2f);
	long mult = bno.multiplication(210,310);
	float div = bno.divide(25f,3);

	System.out.println("The addition is: "+add);
	System.out.println("The substraction is: "+sub);
	System.out.println("The multiplication is: "+mult);
	System.out.println("The division is: "+div);

	}

}
