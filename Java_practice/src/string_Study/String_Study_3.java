package string_Study;

public class String_Study_3 {

	public static void main(String[] args) {
		
		String bike_Launch_Banner="Yamaha FZ-Rave launched in India at ₹1.17L GUFYiydg grfhghd jrwjgfhfd";
		
		String expected_bike_Launch_Banner="₹1.17L";
		
		//int lengthOfMyString = bike_Launch_Banner.length()-1;
		
		//System.out.println(lengthOfMyString);
		
		int myRequiredStringinex = bike_Launch_Banner.indexOf("L");
		
		
		String subString_bike_Launch_Banner = bike_Launch_Banner.substring(36, 41);
		
		String rs = bike_Launch_Banner.substring(36,45);
		
		System.out.println(rs);
		

	}

}
