package sept_Java;

import java.util.ArrayList;

public class Varaibles_Study {
	
	static int s=48;
	static int s2=98; //global variable
	
	static char p;
	
	
	
	//ArrayList al=new ArrayList();

	public static void main(String[] args) {

		System.out.println("healo all");
		System.out.println(p);

		z1();
		
		//Varaibles_Study o1=new Varaibles_Study();
		
		System.out.println("my multiplication of two global variable is "+mult);
	}

	int s3=484;
	
	
	public static void z1() {
		
		
		int	sum =(s+s2);
		
		System.out.println("Sum of my global variable is " +sum);

		System.out.println("healo I am z1 method");

	}
	
	
	{	
		int q=123;
		int c=23;
		int rs = q+c;
		
		System.out.println("rs "+rs);
		System.out.println("healo 23");
	}
	
	
	public void z2() {
		
		int a=23;
		int s=48;  //local variable 
		
		System.out.println("healo I am z2 method");
		
		

	}
      static int mult=(s*s2);
  
}
