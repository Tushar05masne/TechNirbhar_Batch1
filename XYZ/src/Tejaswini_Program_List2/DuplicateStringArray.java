package Tejaswini_Program_List2;

public class DuplicateStringArray {

	public static void main(String[] args) {
		 String[] arr = {"Java", "Python", "C", "Java", "Python", "C++"};

	        System.out.println("Duplicate strings are:");

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i].equals(arr[j])) {
	                    System.out.println(arr[i]);
	                }
	            }
	        }

	}

}
