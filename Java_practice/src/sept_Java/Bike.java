package sept_Java;

public class Bike {

	static String model;
	String color;

	public static void main(String[] tushar) {

		// class_Name obj_refenceName=new class_Name();

		Bike pulsar = new Bike("pulsar", "Black");
		Bike CBZ = new Bike("CBZ", "Red");

		pulsar.displayInfo();
		CBZ.displayInfo();

		Bike ob1 = new Bike();

		String color2 = ob1.color;

	}

	public Bike(String m, String c) {
		this.model = m;
		this.color = c;

	}

	public Bike() {

	}

	public void displayInfo() {
		System.out.println("Model: " + model + ", Color: " + color);
	}

	public  void main() {
		
	}
		
		
	

	public static void main(int i) {
		
	}

	}	

	

