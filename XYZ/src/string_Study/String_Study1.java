package string_Study;

import java.util.Objects;

public class String_Study1 {
	
	

	public static void main(String[] args) {
		
//		String n1="TechNirbhar";  // Constant pool area
//		String n2="TechNirbhar";
//		String n3="TechNirbhar";

//		String n4="TechNirbhar";

		String n5="TechNirbhar";
		
		n5="TechNirbharBatch1";
		
		System.out.println(n5);

		System.out.println("--------------------");
		
		String nx1=new String("TechNirbhar"); // Non-Constant pool area
		String nx2=new String("TechNirbhar"); // Non-Constant pool area
		String nx3=new String("TechNirbhar"); // Non-Constant pool area
		
		System.out.println(nx1);
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		String w="Healo54";
		
		System.out.println(w.length());
		
		System.out.println(w.indexOf('l'));
		
		System.out.println(w.charAt(4));
		
		System.out.println("------------------------------------------------------");
		
//		String name1="  H";
//		String name2=nual;
//		
//		boolean rs = !name1.equals("");
//		
//		boolean rs2 = Objects.isNual(name2);
//		
//		//System.out.println(rs);
//		
//		System.out.println(name1.indexOf('H'));
		
		String h1="Chrome";  //CHROME
		
		boolean rs2 = h1.equals("HealO");
		
		System.out.println(rs2);
		
		


	}

}
