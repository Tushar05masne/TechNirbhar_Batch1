package this_super_keywords_Study;

public class Father extends Grandfather{
	
	
	int age=65;  //globally 
	
	int  age2=4578438;

	public static void main(String[] args) {
		
		Father f1=new Father();
		f1.calculteAge();
	}
	
	public void calculteAge() {
		
		int age=76;  //local
		
		
		System.out.println("Age of father " +age);
		
		System.out.println("Age of father --- "+this.age);
		
		
		System.out.println("Age of Grandfather --- "+super.age);
		
		
		
	}
	
	public  void t1() {
		
	int age=76;  //local
		
		
		System.out.println("Age of father " +age);
		
		System.out.println("Age of father --- "+this.age);
		
		
		System.out.println("Age of Grandfather --- "+super.age);
		
		
	}
		
		
		
	

}
