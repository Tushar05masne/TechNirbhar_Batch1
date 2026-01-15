package Mahesh2;

import java.util.ArrayList;

public class Array_Study {

	public static void main(String[] args) {

		
		//### creating array with new keyword
		int[] num = new int[5];		// when we know the size of an array in advance then we can go with this approach
	
		// Adding values into array
		num[0] = 10;					
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		
		// printing elements 1 by 1
		System.out.println(num[0]);			
		System.out.println(num[1]);	
		System.out.println(num[2]);	
		System.out.println(num[3]);	
		System.out.println(num[4]);			// if we dont have value in this position then it will give us default value as 0

		
		// creating array directly
		int[] arr = {1,2,3,4};			// when we dont know the size of an array then we can go with this approach

		System.out.println("The length of an array is: "+arr.length);		// find the length of array
		
		//printing elements by for loop
		System.out.println("Printing array By for loop:");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		// printing elements by for..each loop
		System.out.println("Printing array By foreach loop:");
		for(int i:arr) {
			System.out.println(i);
		}
	
		System.out.println("#### 2 dimensional array:");
		
		//#### 2 dimensional array
		int[][]	a = new int[3][2];
		
		a[0][0] = 100;
		a[0][1] = 200;		
		a[1][0] = 300;
		a[1][1] = 400;
		a[2][0] = 500;
		a[2][1] = 600;
		
		// creating array directly/dynamically we can add or remove elements whenever we want 
		
		int[][] a1 = {
						{673,982},
						{390,834},
						{512,649}
		}; 
		
		System.out.println("Length of rows: "+a1.length);
		System.out.println("Length of coloumns: "+a1[0].length);
		
		//printing elements by for loop
		System.out.println("Printing array By for loop:");
		for(int r=0; r<=a1.length-1;r++) {
			for(int c=0; c<=a1[r].length-1;c++) {
				System.out.print(a1[r][c]+"  ");
			}
			System.out.println();
		}

		System.out.println("Printing array By foreach loop:");
		for(int r[]:a1) {
			for(int c:r) {
				System.out.println(c);
			}
			
		}
		
		//#### Object type array 
		
		System.out.println("Array with different data type/ Object type: ");
		
		// With new keyword
		Object[] obj = new Object[10];
		
		obj[0] = 109;
		obj[1] = "Amit";
		obj[2] = 10.28f;
		obj[3] = 101002;
		
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		System.out.println(obj[3]);
		System.out.println(obj[4]);		//# if we dont provide value, by default it will give 'null' value because it is object type array 		
		
		// creating array directly 
		Object[] arr1 = {10,"Mahesh",57.90,'A',false};
		
		// printing object array by for loop
		for(int i=0;i<=arr1.length-1;i++) {		
			System.out.println(arr1[i]);
		}
		
		System.out.println("------");
		
		// printing object array by for..each loop
		for(Object x:arr1) {
			System.out.println(x);
		}
		
	System.out.println("++++++++++++++++++++++++++++++++++");
		
// # Program1 - Find sum of elements in an array
		
	int[] s= {1,2,3,4,5};
	int sum = 0;
	for(int i:s) {								// by for..each loop
		sum+=i;
	}
	System.out.println("The sum is: "+sum);
	
	int sm=0;
	for(int i=0;i<=s.length-1;i++) {			// by for loop
		sm+=s[i];
	}
	System.out.println("The sum is: "+sm);
	

// # Program2 - Print even and odd number in an array
	
	int[] eo = {1,2,3,4,5,6};
	int e = 0;
	int o = 0;
	for(int i:eo) {
		if(i%2==0) {
			e+=1;
		}
		else {
			o+=1;
		}	
	}
	System.out.println("The number of Even numbers in an array are: "+e);	
	System.out.println("The number of Odd numbers in an array are: "+o);
	
		
		
	ArrayList<Integer> lst1 = new ArrayList<>();
	ArrayList<Integer> lst2 = new ArrayList<>();
	
	for(int i:eo) {
		if(i%2==0) {
			lst1.add(i);
		}
		else {
			lst2.add(i);
		}
	}
	
	System.out.println("The Even numbers in the array are: "+lst1);
	System.out.println("The Odd numbers in the array are: "+lst2);		
		
		
		
		
	}

}
