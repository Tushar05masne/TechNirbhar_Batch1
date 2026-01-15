package Mahesh2;

import java.util.Scanner;

// Exception - Event which cause program termination. - Exception comes because of user's mistake
		// whenever we pass an invalid input to the program, we have chance to get an exception.	
		// 2 types of exceptions - 1. Checked exception - Exception which are identified by Java compiler.	-InterruptedException, FileNotFound, IOException etc.
					//2. Unchecked exception - Exceptions which are not identified by java compiler. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc.

	
// Errors : 
	//1. Syntax error - If we are not following any Java syntax at the time of writing a program and it will give an error, it is called syntax error.
	//2. Logical Errors - The program gets executed, there is no syntax error but the output which we are expecting is not correct.
						// The logic which we have written is not correct and gives wrong output. That is called logical error.
	// Errors come because of programmer's mistake

// Handling Exception - Checked exception can be handled in 2 ways.-->	1. using try{} catch{} block,	2. using throws keyword

		//we can handle exceptions with the help of try(){} catch(){} block.
		// In try block we have to write a code which provides an exception while in catch block we have to write a code to handle that exception
		// we avoid program termination and also we can execute the rest of the code successfully.
		// one try block can have any number of catch blocks. 
		//If we don't know what type of exception gets occurred then we can write multiple catch block also.the matching catch block gets executed. But we have a problem in this approach 

public class exception_Demo {

	public static void main(String[] args) {

		System.out.println("Program started...");
	
		Scanner sc = new Scanner(System.in);

		/*	Example 1
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println(100/num);		// if we enter 0 as num then ArithmeticException: / by zero

		*/
	
		
	/*	Example 2
	 * int[] a = new int[5];
		
		System.out.println("Enter a position(0-4)");
		int pos = sc.nextInt();
		
		System.out.println("Enter a value:");
		int value = sc.nextInt();
		
		a[pos] = value;					// ArrayIndexOutOfBoundsException - if entered position more than the length of an array 
		System.out.println("The value entered in position "+pos+" is "+a[pos]);
		*/
		
		// Example3
		/*
		String s = "welcome";
		int num = Integer.parseInt(s);		// NumberFormatException
		System.out.println(num);
		*/
		
		// Example 4
		/*
		String s = null;
		System.out.println(s.length());		// NullPointerException
		*/
		
		System.out.println("Program is completed");
		System.out.println("Program is exited.");

		
		
		
		
		
		
		
		
		
	}
	
}
