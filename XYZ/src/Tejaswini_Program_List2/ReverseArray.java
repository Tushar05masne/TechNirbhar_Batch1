package Tejaswini_Program_List2;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};  // Original array

        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Reversing the array
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.println("\nReversed Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

	}

}
