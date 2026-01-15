package polymorphismDemo;

// Polymorphism - one name , many forms
// Static/compile time polymorphism - method overloading - same method name but different parameters(different signature) in the same class
// Dynamic/ run time polymorphism - method overriding 	- same name, same parameters(same signature) but in the different class--> parent, child class



public class StaticPolymorphism {

	public int add (int a,int b) {
		return a+b;
	}

	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {

		StaticPolymorphism stp = new StaticPolymorphism();
		
		int a = stp.add(10,20);
		int b = stp.add(10,20,30);
		double c = stp.add(10000, 5000);
		
		System.out.println("Method with 2 int parameters addition is: "+a);
		System.out.println("Method with 3 int parameters addition is: "+b);
		System.out.println("Method with 2 double params addition is: "+c);
	}

}
