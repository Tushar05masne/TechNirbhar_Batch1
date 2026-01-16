package string_Study;

import java.util.Objects;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class String_Study1 {

	public static void main(String[] args) {
		String n1="Tejaswini";  //constant pool area
		String n2="Tejaswini";
		String n3="Tejaswini";
		
		String n4="Tejaswini";
		
		String n5="Tejaswini";
		n5="sharayu";
		System.out.println(n5);
		
		System.out.println("---------------------------------");
		
		String m1=new String("Tejaswini"); //non-constant pool area
		String m2=new String("Tejaswini");
		String m3=new String("Tejaswini");
		String m4=new String("Tejaswini");
		System.out.println(m1);
		
		System.out.println("--------");
		String w="HELLO45";
		System.out.println(w.length());
		System.out.println(w.indexOf('l'));
		System.out.println(w.charAt(5));
		
		System.out.println("--------------------------");
		String name1="H";
		String name2=null;
		boolean rs = !name1.equals("");
		boolean rs2=Objects.isNull(name2);
        System.out.println(rs);
		System.out.println(name1.indent('H'));
		
		
		
		

}
}