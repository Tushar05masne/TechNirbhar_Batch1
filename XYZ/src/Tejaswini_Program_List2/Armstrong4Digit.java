package Tejaswini_Program_List2;

public class Armstrong4Digit {

	public static void main(String[] args) {
		int num = 1634;     // 4-digit number to check
        int temp = num;
        int sum = 0;

        for ( ;num > 0; num = num / 10) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit * digit);
        }

        if (sum == temp) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
	}

}
