package interface_study;

public class Son implements Mother{

	public static void main(String[] args) {
		
		Son obj_s=new Son();
		
		obj_s.land();
		obj_s.flat();
		obj_s.money();
		
		Father.gold();

	}

	@Override
	public void land() {
		
		System.out.println("land inherited property from mother");
		
		
	}

	@Override
	public void car() {
		
		System.out.println("land inherited property from father");

	}

	@Override
	public void plot() {
		
		System.out.println("land inherited property from father");

		
		
	}

	

}
