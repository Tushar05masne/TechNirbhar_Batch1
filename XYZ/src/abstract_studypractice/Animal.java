package abstract_studypractice;

public abstract class Animal {
	
	 int age_of_animal;
	

	public Animal() {
		
		System.out.println("Animal class constructor without parameter");
		
	}
    public Animal(int age) {
    	age=34;
    	this.age_of_animal=age;
    	System.out.println("Animal class constructor with parameter int");;
		
	}
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
	
	public  void m4()
	{
		System.out.println("Hi m4 method from concrete method in abstract class");
			
	}	
	public void showAge() {
		System.out.println("Age = "+ age_of_animal);
	}
	

}
