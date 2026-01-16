package string_Study;

public class String_Method_Study {

	public static void main(String[] args) {

		String myStatus = "I am doing some Work";

		String message = "To design smart helmet to decrease the death rate due to accident";

		String name = "Sharayu";
		String helmet = "20000 CCCC";

		String Due_value = "$15.50";
		String Upfront_Cost = "23.16";

		String New_DueValue = Due_value.replace("$", "");

		String NewUpfront_Cost = Upfront_Cost.replace("$", "");

		float fDue_value = Float.parseFloat(New_DueValue);

		Integer.parseInt(Upfront_Cost);
		Long.parseLong(Upfront_Cost);

		float fUpfront_Cost = Float.parseFloat(Upfront_Cost);

		float Actual_total_cost = fDue_value + fUpfront_Cost;

		System.out.println(Actual_total_cost);

		String expected_total_cost = "99.33";

		System.out.println("-----------------------toUpperCase-------------------------");

		System.out.println(myStatus.toUpperCase());

		System.out.println("-----------------------toLowerCase-------------------------");

		System.out.println(myStatus.toLowerCase());

		System.out.println("========================contains==========================");

		System.out.println(message.contains("death rate"));

		System.out.println("++++++++++++++++EndsWith and StartsWith+++++++++++++++++++++");

		System.out.println(name.endsWith("u"));
		System.out.println(name.endsWith("rayu"));

		System.out.println(message.startsWith("To design"));
		System.out.println(message.startsWith("helmet to decrease"));

		System.out.println("______________________Concat__________________________");

		System.out.println(name + " " + message + " " + myStatus);

		System.out.println("_______________________LastIndexof_____________________");

		System.out.println(message.lastIndexOf("e"));

		System.out.println(message.length());

		System.out.println("_______________________Replace_________________________");

		// System.out.println(Due_value.replace('$',''));

		String New_Duevalue = (Due_value.replace("$", ""));
		System.out.println(New_Duevalue);

		System.out.println(message.replace("design", "Create"));
	}

}
