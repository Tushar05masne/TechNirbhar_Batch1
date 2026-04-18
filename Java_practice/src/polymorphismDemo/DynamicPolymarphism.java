package polymorphismDemo;

class Animal{
	public void makeSound(){
		System.out.println("The animal makes sound.");
	}
	
	public void color() {
		System.out.println("The color of Animal is brown.");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("The dog barks.");
	}
	
	public void countLegs() {
		System.out.println("Dog has 4 legs.");
	}
}

class Cat extends Animal{
	@Override
	public void makeSound() {
		System.out.println("The cat makes meawww.");
	}
	
	public void color() {
		System.out.println("The color of cat is black.");
	}
	
}

public class DynamicPolymarphism {

	public static void main(String[] args) {
		
		Animal anml;
		String Animal_name = "dog";
		
		if(Animal_name.equalsIgnoreCase("Cat")) {		
			anml = new Cat();
			anml.makeSound();
		}
		else if(Animal_name.equalsIgnoreCase("Dog")) {
			anml = new Dog();
			anml.color();			//  Executes color() from Animal class
			
			//anml.countLegs();		// it will give an error as this method is not present in Animal class
			
			Dog d = (Dog) anml;		// down-casting. 
			d.countLegs();			// Executes countLegs() from Dog class
		}
		else {
			System.out.println("Please check animal name.");
		}				
	}

}
