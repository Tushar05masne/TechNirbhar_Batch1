package sept_Java;

import access_Specifier_Study.Access_Specifier_private;

public class Calling_diffrent_Access_Specifier   {

	public static void main(String[] args) {
		
		
		Access_Specifier_private.v1();
		
		
		//private---withing same class
		//default---> withing same package in any class -----not applicable---inheritance
		//protected-->withing same package in any class ---> inheritance
		//public --->within any package--->within project

	}

}
