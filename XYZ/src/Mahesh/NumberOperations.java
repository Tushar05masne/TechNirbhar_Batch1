package Mahesh;

import java.util.Scanner;

public class NumberOperations {

	int AddNumbers(int x,int y){
		return x+y;
	}

	int SubNumbers(int x,int y){
		int z;
		if(x<y){
			z=x;
			x=y;
			y=z;		
		}
		return x-y;
	}

	void MultNumbers(int x,int y){
		System.out.println("The Multiplication of "+x+" and "+y+" is: "+ x*y);
	}	

	void DivNumbers(int x,int y){
		System.out.println("The Division of "+x+" and "+y+" is: "+ x/y);
	}


	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the 1st number: ");
	int a = sc.nextInt();

	System.out.println("Enter the 2nd number: ");
	int b = sc.nextInt();


	NumberOperations nop = new NumberOperations();


	int addition = nop.AddNumbers(a,b);
	System.out.println("The Addition of "+a+" and "+b+" is: "+addition);


	int subtraction = nop.SubNumbers(a,b);
	System.out.println("The Subtraction of "+a+" and "+b+" is: "+subtraction);

	nop.MultNumbers(a,b);
	nop.DivNumbers(a,b);

	sc.close();

	}
	

}
