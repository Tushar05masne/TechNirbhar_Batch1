package interface_study;

public interface I_study {

	String name = "Tom";
	
	
	//=========================== default public and abstract methods,i.e  having no body===========
	

	void im1();

	void im2();
	
	
	//===========================private method having body================================

	private static void im3() {
		
		im4();
		System.out.println("Hello im3 implemented method of I_Study interface ");
	
	}
	
	//===========================private and static , method having body===================


	private static void im4() {
		System.out.println("Hello im4 implemented method of I_Study interface ");
	}
	
	
	//===========================static , method having body===================


	public static void im5() {
		
		im3();
		
		System.out.println("Hi im2 method from I_study inteface");

	}

}
