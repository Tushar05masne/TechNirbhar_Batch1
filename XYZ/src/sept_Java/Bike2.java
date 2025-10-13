package sept_Java;

public class Bike2 {

	static String model;
	String color;

	public static void main(String[] tushar) {

		// class_Name obj_refenceName=new class_Name();

		Bike2 pulsar = new Bike2("pulsar", "Black");
		Bike2 CBZ = new Bike2("CBZ", "Red");

		pulsar.displayInfo();
		CBZ.displayInfo();

		Bike2 ob1 = new Bike2();

		String color2 = ob1.color;

	}

	public Bike2(String m, String c) {
		this.model = m;
		this.color = c;

	}

	public Bike2() {

	}

	public void displayInfo() {
		System.out.println("Model: " + model + ", Color: " + color);
	}

	public  void main() {
		
	}
		
		
	

	public static void main(int i) {
		
	}

	}	

	

