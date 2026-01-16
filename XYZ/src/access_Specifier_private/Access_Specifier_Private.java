package access_Specifier_private;

public class Access_Specifier_Private {
	
	private String name="Tejaswini";

	public static void main(String[] args) {
		Access_Specifier_Private obj1=new Access_Specifier_Private();
		
		obj1.v1();
		String x = obj1.name;
		
		System.out.println(x);
		
	}

	private void v1() {
		System.out.println("hi i am v1 method form Access_Specifier_Private class");
		
	}

}
