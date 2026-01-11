package abstractionAndInterface;

public class C1 extends C2 implements I1,I2 {				//  Hybrid inheritance --> hierarchical + multiple inheritance
															// class C1 implements I1,I2	--> multiple inheritance	class C2 implements I1,I2--> hierarchical

	public void m1() {
		System.out.println(x);
	}
	public void m2() {
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		C1 c1obj = new C1();
		c1obj.m1();
		c1obj.m2();
		
		c1obj.m3();
		
	}

}
