package casting_Study;

public class Animal_caller {

	public static void main(String[] args) {
		
	    Animal prop;
		
		String Animal_name="elephant";
		
		
		if(Animal_name.equalsIgnoreCase("dog")) {
			
			prop=new Dog();
		    prop.makes_sound();
			
		}
		else if(Animal_name.equalsIgnoreCase("elephant")) {
			
			 prop=new Elephant();
			prop.makes_sound();
			
			prop.makes_sound2();


		}
		else if(Animal_name.equals("lion")) {
			
			 prop=new Lion();
			 prop.makes_sound();


		}
		else {
			System.out.println("please check animal name is right");
		}
		
		
		
		System.out.println("_____________________Downcasdting_____________________");
		
		
	   
		//---
	Dog  d1	=(Dog) new Animal();
	
	d1.makes_sound();
		
		
		
//		Animal ani=new Dog();
//		//ani.makes_sound();  //up-casting done here
//		
//		Dog ani2=(Dog) ani;
//		
//		ani2.makes_sound();
//		
//		Dog ani2= (Dog) new Animal();  //down-casting done here but throw a class cast exception
//		
//     	ani2.makes_sound();
		
		
     	// java.lang.ClassCastException: class casting_Study.Animal cannot be cast to class casting_Study.Dog (casting_Study.Animal and casting_Study.Dog are in unnamed module of loader 'app')

		//Note---Casting an object to an incompatible type will result in a ClassCastException at runtime.

	}

}
