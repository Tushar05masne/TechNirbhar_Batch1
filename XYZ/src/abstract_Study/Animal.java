package abstract_Study;

abstract public class Animal {

	int age_of_animal;

	

	public  Animal(int age) {
		
		age=34;

		this.age_of_animal = age;
		

		System.out.println("Animal class constructor with parameter int");

	}
	
	public int getAge() {
		
		return age_of_animal;
		
		
	}

	public abstract void m1();

	public abstract void m2();

	public abstract void m3();

	public void m4() {

		System.out.println("Hello m4 method from abstract class animal");
		
		
	}
	
	

}
