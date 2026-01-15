package Tejaswini_Program_List2;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 2, 4, 3};

        System.out.println("Duplicate numbers are:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
//        int i = 0;
//        while (i < arr.length) {
//            int j = i + 1;
//            while (j < arr.length) {
//                if (arr[i] == arr[j]) {
//                    System.out.println(arr[i]);
//                }
//                j++;
//            }
//            i++;
//        }

	}
	}
