package Tejaswini_Program_List2;

public class LargestOfThree {

	public static void main(String[] args) {
		int a = 25;
        int b = 40;
        int c = 30;

        if (a >= b && a >= c) {
            System.out.println("Largest Number = " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest Number = " + b);
        } else {
            System.out.println("Largest Number = " + c);
        }
       
        //Using Ternary Operator
//        
//        int a = 10, b = 50, c = 30;
//
//        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
//
//        System.out.println("Largest Number = " + largest);
//    

	}

}
