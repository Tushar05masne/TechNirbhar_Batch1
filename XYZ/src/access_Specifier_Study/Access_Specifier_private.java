package access_Specifier_Study;

public class Access_Specifier_private {
	
	public static  String name="Mayur";

	public static void main(String[] args) {
		
		Access_Specifier_private obj1=new Access_Specifier_private();
		
		obj1.v1();
		
		String x = obj1.name;
		
		System.out.println(x);

	}
	   public static void v1() {
		System.out.println("Check if we can acess in other class ");
	}

}
