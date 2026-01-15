package Tejaswini_Program_List2;

public class LargestOfFour {

	public static void main(String[] args) {
		int a = 25;
        int b = 40;
        int c = 30;
        int d = 55;

        if (a >= b && a >= c && a >= d) {
            System.out.println("Largest Number = " + a);
        } else if (b >= a && b >= c && b >= d) {
            System.out.println("Largest Number = " + b);
        } else if (c >= a && c >= b && c >= d) {
            System.out.println("Largest Number = " + c);
        } else {
            System.out.println("Largest Number = " + d);
        }

        
//		Using Ternary Operator
//        int a = 10, b = 20, c = 5, d = 15;
//
//        int largest = (a > b) ? 
//                      ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d)) :
//                      ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d));
//
//        System.out.println("Largest Number = " + largest);

		
	
	}

}
