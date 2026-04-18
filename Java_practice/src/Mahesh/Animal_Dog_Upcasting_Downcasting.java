package Mahesh;

public class Animal_Dog_Upcasting_Downcasting {

	public static void main(String[] args) {

		Animal anml = new Dog();	// Upcasting --> implicit
		anml.makeSound();			// it calls makeSound() of Dog class as it is present in that class
		anml.countLegs();			// it calls countLegs() of Animal class as it is not present in Dog class but present in Animal class. 
		
		//anml.color();				// it gives error because color() is not present in Animal class
		
		Dog d =(Dog) anml;			// Downcasting --> Explicit -->	Converts Parent type(anml) reference variable to Child type(d) reference variable
		d.color();					// with the help of child type reference variable, calling method from child class
		
	}

}
