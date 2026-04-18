package inheritance;

public class C extends B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C objC=new C();
		
		objC.f1();

	}
	public void f1() {
		System.out.println("Hi I am f1 method from c class");
	}
	public void f2() {
		System.out.println("Hi I am f2 method from c class");
	}

}
