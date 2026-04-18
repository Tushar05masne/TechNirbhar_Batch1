package polymorphism;

public class B extends A {

	public static void main(String[] args) {
		
//		B objb=new B();
//		
//		A obja=new A();
//		
//		//objb.z1();
//		
//		obja.z1();
		
		s1();

	}
	
	@Override
	public void z1() {
		
		System.out.println("z1 method from child class B");
	}
	
//	public void z1(int k) {
//		System.out.println("Hi this is z1 method from A parent class");
//	}

	
	public static void s1() {
		System.out.println("Hi s1 from child class");
	}
}
