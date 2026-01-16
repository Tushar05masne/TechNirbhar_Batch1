package this_super_keywords_Study;

public class Father extends Grandfather{
	
	int age=55;  //globally
	
	public static void main(String[] args) {
		
		Father f1=new Father();
		
		f1.calculateAge();
		f1.UpperGenAge();

	}
	public void calculateAge(){
		int age=84;  //local
		
		System.out.println("Age of father"+age);
		System.out.println("age of father -----"+this.age);
		System.out.println("age of grandfather-----"+super.age);
		
		
	}

}
