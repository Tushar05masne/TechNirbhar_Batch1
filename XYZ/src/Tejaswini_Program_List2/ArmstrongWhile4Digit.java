package Tejaswini_Program_List2;

public class ArmstrongWhile4Digit {

	public static void main(String[] args) {
		int num = 1634;     // 4-digit number
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit * digit);
            num = num / 10;
        }

        if (sum == temp) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
	}

}
