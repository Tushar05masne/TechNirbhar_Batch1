package Mahesh2;


// There is a problem in multiple catch blocks.
	// 1. If the exception is thrown other than we mentioned in the catch blocks, then that exception can not be handled.
	// 2. Due to multiple catch blocks, the length of the code gets increased.

// We can solve this problem by writing only a single catch(Exception e) block.
// "Exception" is the parent class of all other classes like ArithmeticException, NullPointerException, NumberFormatException etc.
// If we don't know which kind of exception will raise, we can write one single block of Exception. this block will handle all type of exceptions.

// finally{} block - finally{} block is the block which will be executed every time, whether the exception is occurred or not.
	// finally{} is an optional block. we can or we can't write a finally block. depends on the situation.
	// If we want to work with the files, or with the database etc then there might be possibility that we forgot to close the files, database connection etc. 
			// In finally block we have to write the code for closing files, closing database connections etc.


public class multipleCatchBlocks {

	public static void main(String[] args) {

		System.out.println("Program is started..");
		String s = null;
		
		try
		{
			System.out.println(s.length());
		}
		
		/*
		catch(ArithmeticException e)
		{
			System.out.println("Handled exception..");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Handled exception..");
			System.out.println(e.getMessage());				// Cannot invoke "String.length()" because "s" is null
		}
		catch(NumberFormatException e)
		{
			System.out.println("Handled exception..");
			System.out.println(e.getMessage());
		}
		*/
		
		catch(Exception e) 
		{
			System.out.println("Handled exception with one catch block..");
			e.printStackTrace();
			
		}
		finally{
			System.out.println("In Finally block..");
		}
		
		System.out.println("Program is completed");
		System.out.println("Program is exited.");
	}

}
