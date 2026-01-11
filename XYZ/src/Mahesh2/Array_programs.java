package Mahesh2;

import java.util.Arrays;
import java.util.Scanner;

public class Array_programs {

	
	public void search_element() {
		
		int[] a = {10,20,30,40};
		int search_element = 20;
		boolean found = false;
		
		for(int i:a) {
			if(i==search_element) {
				System.out.println("Element found");
				found = true;
				break;
			}
		}
		
		if(found==false) {
			System.out.println("Element not found");
		}
	}
	
	
	public void find_repetation_of_element() {
		
		int[] a = {10,20,30,20,20,30,30,30,10,30};
		int rep_element = 30;
		int cnt=0;
		
		for(int i=0; i<=a.length-1;i++) {
			if(a[i]==rep_element) {
				cnt+=1;
			}
		}	
		System.out.println(rep_element+" is repeated "+cnt+" times.");		
	}
	
	public void sort_array() {
		
		int[] a = {100,500,20,57,900,27,30};
		
		System.out.println("Array before sorting: "+ Arrays.toString(a));		// it will print array as it is
		
		Arrays.sort(a);		// sort elements in ascending order
		
		System.out.println("Array after sorting: "+Arrays.toString(a));
	}
	
	public void reverse_array() {
		
		int[] a = {100,500,20,57,900,27,30};
		
		System.out.println("The reverse order is: ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
	
	public void taking_data_from_keyboard() {
		
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.println("Enter a number at position "+i+":");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Printing array elements: ");
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		
		Array_programs ap = new Array_programs();
		
	//	ap.search_element();
	//	ap.find_repetation_of_element();
	//	ap.sort_array();
	//	ap.reverse_array();
	
		ap.taking_data_from_keyboard();
	}

}
