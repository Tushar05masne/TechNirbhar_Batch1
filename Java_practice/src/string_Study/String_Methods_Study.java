package string_Study;

public class String_Methods_Study {

	public static void main(String[] args) {
		
		String myStatus="I am busy today";
		
		String EngineCapacity="2000 CCCC";
		//0123456
		
		String Due_value = "$20.19";
		String Upfront_Cost = "$60.19";

		
		
		String New_DueValue = Due_value.replace("$", "");
		
		//String NewUpfront_Cost = Upfront_Cost.replace("$", "");
		
		float fDue_value = Float.parseFloat(New_DueValue);
		
//		Integer.parseInt(Upfront_Cost);
//		Long.parseLong(Upfront_Cost)
		
		float fUpfront_Cost = Float.parseFloat(Upfront_Cost);

		
		float Actual_total_Cost = fDue_value+fUpfront_Cost;
		
		System.out.println(Actual_total_Cost);

		String expected_total_Cost="80.38";
		
		

		
		
		String message="Tata Motors Sierra SUV Features, Engine Options-"+EngineCapacity+"And Confirmed Launch Date Explainer";
		
		
		System.out.println(message);
		
		
		
		
		
		String name="Gajanan";
		
		System.out.println("-------------toUpperCase----------");
		
		System.out.println(myStatus.toUpperCase());
		
		System.out.println("-------------toLowerCase----------");
		
		System.out.println(myStatus.toLowerCase());
		
		
		System.out.println("===================contains===============");
		
		System.out.println(message.contains("Engine Options"));
		
		
		System.out.println("***************EndsWith and StartsWith****************");
		
		System.out.println(name.endsWith("janan"));
		
		System.out.println(message.endsWith("Date Explainer"));
		
		System.out.println(message.startsWith("Tata"));
		
		System.out.println("_________________________________Concat________________");
		
		System.out.println(name+" "+message+" "+myStatus);
		
		
		System.out.println("_________LastIndexof____________");
		
		System.out.println(message.lastIndexOf("e"));
		
		System.out.println(message.length());
		
		
		System.out.println("^^^^^^^^^^^^^^Replace^^^^^^^^^^^^^^^^^^^^^^");
		
		//System.out.println(Due_value.replace('$', ''));
		
	//	String New_DueValue = Due_value.replace("$", "");
		
	//	System.out.println(New_DueValue);
		
		System.out.println(message.replace("SUV", "Sedan"));
		

	}

}
