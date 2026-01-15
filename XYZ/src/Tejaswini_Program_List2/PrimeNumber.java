package Tejaswini_Program_List2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 7;   // number to check
        int flag = 0;

        if (num <= 1) {
            flag = 1;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

	}

}
