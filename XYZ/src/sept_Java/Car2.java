package sept_Java;

public class Car2 {
	
	static int size_Of_engine=1500;
	int Wheels=5;
	int No_of_occupants=5;
	String Color="red";
	String CarName="Creta";
    String fuel="Petrol";
    
	
	
	public static void main(String[] args) {
		
		RTO_Registration_validity();
		
		 //class_Name obj_refenceName=new class_Name();
		
		Car2 creta=new Car2();
		
		 size_Of_engine=1800;
		 
		 System.out.println("size_Of_engine"+size_Of_engine);
		
		String MyCar = creta.CarName;
//		  creta.Durabilityand_Maintetance_cost();

	//	creta.Durabilityand_Maintetance_cost();
		creta.cost_creta();
		
		System.out.println("MyCar "+MyCar);
		

	}
	
	public void cost_creta() {
		
		System.out.println("Cost of creta=120000");
		
	}
	public static void RTO_Registration_validity() {
		
		System.out.println("creta car Registration is up to 2032");
		
	}


}
