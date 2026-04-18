package Mahesh;

// static variable: 
//The same value of the static variable is used by all the objects of the class.
// Static means we are making something as a class member and not an object member, and we can access it with the class name.
// Static variables are accessed by the class name in other class, and only by name in the same class.
//If we change the value of the static variable many times, it will take the last/latest value which is assigned.

//static method --> we have to assign a 'static' keyword to the method
// Static methods have to called by it's Class name into the main().	--> className.methodName();
// If static method inside the class which is having main() method then only with the method name it will be called.
// we can use static variables inside static methods but we can not use non static variables inside static method,
//but if we pass an object reference to the method then we can access non static variables inside static method with that object reference.	

// static block -->
// static block is a block where we can declare static variables.
// whenever we create an object, constructor will be called. In constructor we have to assign the default values to the static as well as non static variables.
// but there is no use of assigning the same value to the static variable every time when we create an object.
// so, for the declaring and assigning/initializing static variables, we have to write a static block.
// static block will be loaded at the time of class loading and will be loaded and executed only once.
// If we don't assign the value to the static variable in the object, it will take a default value from the static block.



class Laptop{
	
	// global variables
	static String brand;			//static variable
	int price=45000;
	String name;
	
	static 							// static block
	{
		brand="Asus";				// static variable initialization
	}	
	
	public Laptop()					// constructor - when we create an object, it will be called
	{
		price=10000;
		name="";
	}

	public void show()								// instance method - it will be called with the help of object.
	{
		String hardDrive = "1TB";
		System.out.println("Hard drive from Laptop class: "+hardDrive);
		
		System.out.println("Brand:"+brand+"  Price:"+price+"  Name:"+name);
	}
	
	public static void show1(Laptop lp)				// static method - it will be called with the help of class name.
	{
		System.out.println("Brand:"+brand+"  Price:"+lp.price+"  Name:"+lp.name);
	}
	
}

public class TypeOfVariablesAndMethods {
	
	static String hardDrive = "4TB";
	
	public static void show2()
	{
		System.out.println("Static method from the same class of main.");
	}
	

	public static void main(String[] args) {
				
		Laptop lp1 = new Laptop();					// object/instance created
		//Laptop.brand = "Apple";
		lp1.price = 89020;							// instance variable 
		lp1.name = "MacBook ";		
		
		Laptop lp2 = new Laptop();
		//Laptop.brand = "HP";						// value assigned to static variable with class name.
		lp2.price = 50421;
		lp2.name = "HP Spectre";

		
		System.out.println("Hard drive(static variable) from main class: "+hardDrive);
		lp1.show();
		lp2.show();

		show2();									//  calling of static method directly of the same class 
		Laptop.show1(lp1);							// calling of static method with class name from different class
		
	}

}
