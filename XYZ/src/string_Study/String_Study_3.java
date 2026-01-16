package string_Study;

public class String_Study_3 {

	public static void main(String[] args) {
		String bike_Launch_Banner="Yamaha MT 15 Version 2.0: This naked sport bike is praised for its sharp feel and performance, with prices starting from ₹1,56,445 (ex-showroom).";
		
		String expected_bike_Launch_Banner="₹1.17L";
		
		int lengthOfMyString = bike_Launch_Banner.length()-1;
		System.out.println(lengthOfMyString);
		
		int myRequiredStringinex = bike_Launch_Banner.indexOf("L");
		String subString_bike_Launch_Banner = bike_Launch_Banner.substring(85,85);
		System.out.println(subString_bike_Launch_Banner);
		
		

	}

}
