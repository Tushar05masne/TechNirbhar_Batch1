package abstractionAndInterface;


// Interface - blueprint of a class having abstract, default and static methods. variables - by default they are final and static
//			- abstract methods are the methods which don't have a body.
//			- we must implement all the abstract methods into the child class of an interface. and access those by creating object of the child class
//			- methods in interface are public by default while the methods in class are having default access modifier by default
//			- class extends class, interface extends interface but a class implements interface
//			- we can not create an object of an interface. we can instantiate it.- create a reference variable and after creating object of child class we can refer it with reference.
//

interface Shape{
	
	int length = 10;		// final - means constant and static - common to all the classes
	int width = 20;			
	
	void circle();
	
	default void square() {
		System.out.println("This is sqaure. - default method");
	}
	
	static void rectangle() {
		System.out.println("This is rectangle. - static method");
	}
	
}

public class InterfaceDemo implements Shape {

	public void circle() {
		System.out.println("This is circle. - abstract method");
	}
	
	public static void main(String[] args) {

		// Scenario 1
		InterfaceDemo ifd = new InterfaceDemo();
		
		ifd.circle();			//	abstract
		ifd.square();			// default
		
		Shape.rectangle();		// we have to access static method 'rectangle' from other class. so we have to provide 'classname.methodname' to access it.
								// if the static method is in the same class then we can access it by the 'method_name()' only.
		
		// Scenario 2
		Shape sh = new InterfaceDemo();		// create an object of implementing class and assign it to the reference variable of the interface.
		sh.circle();		// abstract method
		sh.square();		// default method
		
		Shape.rectangle();	// static method
	
	
	}

}
