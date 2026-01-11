package Mahesh2;

import java.util.Arrays;

public class String_Programs {

	
	public void reverseString() {
		String str = "JAVA JAVA";
		String rev="";
		
		/*
		 * for(int i=str.length()-1;i>=0;i--) {
		 *  rev+=str.charAt(i);
		 *   }
		 * System.out.println("The reverse string of '"+str+"' is: "+rev);
		 */
		
		int i=str.length()-1;
		while(i>=0) {
			rev+=str.charAt(i);
			i--;
		}
		System.out.println("The reverse string of '"+str+"' is: "+rev);
	}
	
	public String checkPalindrome() {
		
		String str ="MADAM";
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.println(rev);
	
		if(str.equals(rev)) return "Yes, it's a Palindrome.";
		else return "No.Not a Palindrome.";
	}
	
	
	public void duplicateChar() {
	
		 String str = "Mahesh More Me";
		  
		 for(int i=0;i<=str.length()-1;i++) { 
			 int cnt=1;
		 
			 if (str.charAt(i) == '0') continue;
			 
			 for(int j=i+1;j<=str.length()-1;j++) {
				 if(str.charAt(i)==str.charAt(j)){  
					 cnt+=1; 
			  } 
			 } 
		 if (cnt>1){
		  System.out.println(str.charAt(i)+": occurs: "+cnt+" times."); 
		  } 
		 str = str.replace(str.charAt(i), '0'); 
		 }	
	}
	
	
	public void countVowelsConsonents() {
	
		String str = "Mahesh More Me";
		int v=0, c=0;
		str = str.toLowerCase();
		
		for(int i=0;i<=str.length()-1;i++) {
			char ch = str.charAt(i);
			
			if("aeiou".indexOf(ch)!=-1) v++;
			else if (ch >= 'a' && ch <= 'z')
                c++;
		}
	System.out.println("Vowels: "+v);
	System.out.println("Consonents: "+c);
	}
	
	
	public void split_content() {
		
		String y = "Java is intresting language.";
		String[] x = y.split(" ");
		System.out.println(x.toString());
		
		for(String a:x) {
			System.out.println(a);
		}
		
		String amount = "$1,59,38,20";
		amount = amount.replace("$","");
		System.out.println("Amount: "+amount);
		
		String[] b = amount.split(",");
		
		for(String c:b) {
			System.out.println(c);
		}
	
		String s ="abc,123@xyz";
		String[] s1 = s.split(",");
	
		for(String r:s1) {
			System.out.println(r);		//abc, 123@xyz
		}

		System.out.println(Arrays.toString(s1));	// converts s1 into array format [abc, 123@xyz]
		
		String[] s2 = s1[1].split("@");

		System.out.println(s1[0]);
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		
	}	
	
	public static void main(String[] args) {

		String_Programs sp = new String_Programs();
		//sp.reverseString();
		
		//String checkPal = sp.checkPalindrome();
		//System.out.println(checkPal);
		//sp.duplicateChar();
		//sp.countVowelsConsonents();
		
		sp.split_content();
	}

}
