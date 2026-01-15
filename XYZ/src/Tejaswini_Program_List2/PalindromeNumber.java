package Tejaswini_Program_List2;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		//A number is called a Palindrome if it reads the same forward and backward.
		
		int num = 12321;    // number to check
        int temp = num;
        int rev = 0;

//        while (num > 0) {
//            int digit = num % 10;
//            rev = rev * 10 + digit;     //[Reverse]
//            num = num / 10;
//        }
        
        for (; num > 0; num = num / 10) {
            int digit = num % 10;
            rev = rev * 10 + digit;
        }


        if (temp == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

	}

}
