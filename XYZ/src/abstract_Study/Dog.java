package abstract_Study;

public class Dog extends Animal {

	public static void main(String[] args) {
		
		//Animal a=new Animal(); //not allowed
		//Dog d=new Dog(46);  //allowed
		
	
		
		Dog a=new Dog(22);
		
		int rs2 = a.getAge();
		
		System.out.println("initialize value through Animal class constructor "+rs2);
//		
//			
//		int rs3=a.age_of_animal;
//		
//		System.out.println("rs3 -----"+rs3);
	}
	
	public Dog(int age_of_animal) {
		
		super(age_of_animal);
		
		//int rs =super.age_of_animal;
		
		
		//System.out.println("make use of animal constructor"+rs);
		
		//System.out.println("the average age of animal is  "+age_of_animal);
		
		
	}
	

	@Override
	public void m1() {

		System.out.println("Hi m1 method from concrete class dog");
	}

	@Override
	public void m2() {

		System.out.println("Hi m2 method from concrete class dog");

	}

	@Override
	public void m3() {

		System.out.println("Hi m3 method from concrete class dog");

	}
//
//	@Override
//	public void m4() {
//
//		System.out.println("Hi overriden method of Animal abstract class");
//	}

}
