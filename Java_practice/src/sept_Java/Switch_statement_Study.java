package sept_Java;

public class Switch_statement_Study {
	
	//static int id=34;
	
	static String name="Mahesh";


	public static void main(String[] args) {
		
		
		switch(name) {
		
		case "Tushar":{
			System.out.println("Name provided matched " +name);
			break;
		}case "AShish":{
			System.out.println("Name provided matched " +name);
			break;

		}case "Mahesh":{
			System.out.println("Name provided matched " +name);
			break;

		}
		default:
		{
			System.out.println("Plz pass right name");
		}
		
		
		}

	}

}
