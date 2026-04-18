package polymorphism;

public class CompileTime_P {

	public static void main(String[] args) {
		
		
		CompileTime_P obj=new CompileTime_P();
		
		//obj.t1(234);
		
		obj.t1(34465754L);
		

	}
	
	public void t1() {
		
		System.out.println("Hi this is t1 method without parameter/argument from CompileTime_P class");
		
	}
   
   public void t1(String name) {
	
	System.out.println("Hi this is t1 method with one String parameter from CompileTime_P class");
	
   }
   public void t1(long k) {
		
		System.out.println("Hi this is t1 method with one long parameter from CompileTime_P class");
		
	}
   public void t1(int i) {
		
		System.out.println("Hi this is t1 method with one int parameter from CompileTime_P class");
		
	}

}
