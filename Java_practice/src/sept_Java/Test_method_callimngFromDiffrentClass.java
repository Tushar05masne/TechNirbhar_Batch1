package sept_Java;

public class Test_method_callimngFromDiffrentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m4();
		Test_method_callimngFromDiffrentClass o3=new Test_method_callimngFromDiffrentClass();
		o3.m5();
	}
	public static void m4() {
		System.out.println("Hi i am static m4 method from Test_method_callimngFromDiffrentClass class ");

	}
	public void m5() {
		System.out.println("Hi i am non-static m5 method from Test_method_callimngFromDiffrentClass class ");

	}

}
