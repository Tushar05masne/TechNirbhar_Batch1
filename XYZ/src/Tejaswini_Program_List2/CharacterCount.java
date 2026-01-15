package Tejaswini_Program_List2;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        int count = str.length();  // count of all characters including spaces

	        System.out.println("Character count: " + count);

	        sc.close();

	}

}
