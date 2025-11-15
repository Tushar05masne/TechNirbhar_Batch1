package inheritance;

public class D extends C {

	public static void main(String[] args) {
		
		D objD=new D();
		
		
		objD.f1();
		
		
		C ObjC=new C();
		
		ObjC.f1();

	}
	public void f1() {
		System.out.println("Hi I am f1 method from D class");
	}

}
