package Tejaswini_Program_List2;

public class LargestNumber {

	public static void main(String[] args) {
		int[] arr = {10, 25, 7, 90, 45};

        int max = arr[0];   // assume first element is largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            
//         while (i < arr.length) {
//             if (arr[i] > max) {
//            max = arr[i];
//         }
//          i++;
//           }
        
        }
        
        System.out.println("Largest Number = " + max);

	}

}
