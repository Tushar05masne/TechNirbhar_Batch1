package Mahesh2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// Checked exception can also be handled by 'throws' keyword
	// at the method level, it will add the 'throws' keyword and the exception name. so at the method level, we can handle the exception.

public class checkedExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		System.out.println("Program Started...");
		System.out.println("Program in progress...");
		 
		FileInputStream file = new FileInputStream("D:\\Text.txt");
			
		Thread.sleep(5000);  	
		
		/*
		 * try { 
		 * Thread.sleep(5000); 
		 * } 
		 * catch (InterruptedException e) {
		 * e.printStackTrace();
		 *  }
		 */
		
		
		System.out.println("Program finished...");
		System.out.println("Program exited...");

	}

}
