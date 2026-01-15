package abstractionAndInterface;

abstract class Animal{	
	String name;
	
	Animal(String name){
		this.name = name;
		System.out.println("Animal constructor called");
	}

	abstract void sound();
}

class Dog extends Animal{

	Dog(String name) {
		super(name);
		System.out.println("Dog constructor called.");
	}
	
	void sound() {
		System.out.println("Dog barking");
	}	
	
}

public class AbstractionDemo {

	public static void main(String[] args) {
		
		Animal d = new Dog("Shaggy");
		d.sound();
	}

}
