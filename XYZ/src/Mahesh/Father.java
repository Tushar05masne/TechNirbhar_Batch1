package Mahesh;

//this keyword -> used to access the current class variables, methods and constructor
//super keyword -> used to access the parent class variables,methods and constructor


public class Father extends GrandFather {
	
	String name="Sumit";	// global variables
	int age=60;			
	
	Father(){
		super();		// we have to call parent's constructor first 
		System.out.println("Default constructor of Father");
	}
		
	 Father(String name,int age){			//parameterized constructor
		super(name,age);					// parent constructor calling. we have to have call this.
		this.name = name;
		this.age = age;
		System.out.println("Parameterized constructor of Father");
	}
		
	public void calculateAge() {	
		int age = 70;		// local variable
		System.out.println("The father's age in calculateAge() : "+age+"    "+name);	// if local variable available then takes that value, if parameterized constructor available then takes that value else takes global variable value
		System.out.println("The father's age from 'this' keyword: "+this.age+"    "+this.name);	// if parameterized constructor available then takes that value else takes global variable value
		System.out.println("The Grandfather's age: "+super.age+"   "+super.name);				// takes parent's value 
	}
	
	public static void main(String[] args) {
		
		Father f = new Father();
		System.out.println("The father's age in main: "+ f.age);	// takes global variable value	
		
		f.calculateAge();
		System.out.println("---------------");
		
		Father f1 = new Father("Amit",45);
		f1.calculateAge();
	}

}
