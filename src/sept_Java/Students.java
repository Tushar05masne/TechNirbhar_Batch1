package sept_Java;

public class Students {
	
	int id;
	String name;
	String college_name;
	

	public static void main(String[] args) {

		Students s1=new Students();  //default constructor
		
		Students s2=new Students();  //No arg constructor
		
		Students s3=new Students(23333,"John","IIT");
	
	}
	
	public Students() {		
		System.out.println("No parameter constructor");		
	}
	
	public Students(int id,String name,String c) {
		
//		id=12345;
//		name="Asha";
//		c="COEP";
		
		System.out.println("Student name is "+name+" Id is "+id+" college name is "+c);
	}

}
