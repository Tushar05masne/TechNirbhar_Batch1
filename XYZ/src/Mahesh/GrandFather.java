package Mahesh;

public class GrandFather {

	String name="Santosh";
	static int age= 90;
	
	GrandFather(){
		System.out.println("Default construcor of GrandFather");
	}
	
	GrandFather(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("Parameterized constructor of GrandFather");
	}
	
	public static void main(String args[]) {
		
		System.out.println("Grandfather age: "+age);	// global value -> 90
		GrandFather gf = new GrandFather("Alok",105); 
		System.out.println(gf.name+"   "+gf.age );		// instance's value of age -> 105
		System.out.println("Grandfather age: "+age);	// because of static, age changed from 90 to 105  ->105

		
	}
	
}
