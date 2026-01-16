package abstract_studypractice;

public class Dog extends Animal{
	private static final char[] age = null;

	public static void main (String[] args) {
		
		//Animal a=new Animal();  //not allowed
		Dog d =new Dog(46); //allowed
		d.showAge();
		//System.out.println(d.age);
		d.m1();
		d.m2();
		d.m3();
		d.m4();
		//Animal a= new Dog();
		//int av_age=a.age_of_animal;
		//System.out.println(av_age);
		}
	
	public Dog(int age) {
		super(age);
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

	@Override
	public void m4() {
		System.out.println("Hi m4 method from concrete class dog");
		}

}
