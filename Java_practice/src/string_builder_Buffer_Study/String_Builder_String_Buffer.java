package string_builder_Buffer_Study;

public class String_Builder_String_Buffer {

	public static void main(String[] args) {
		
		String name="Shri Gajanana";
		
		name="Gajanan m";
		
		//System.out.println(name);
		
		
		StringBuffer sb=new StringBuffer("My name is ");
		
		//m Gajanan is name My
		
		sb.append(name);
		
		sb.reverse();

		
		System.out.println(sb);
		
		
//		StringBuilder sbuilder=new StringBuilder();
//		
//		sbuilder.append(sb).append(name).append(120).append('A');
//		
//		
//		System.out.println(sbuilder);

	}

}
