package codetest;

import java.util.Scanner;

public class IndicesSum {
	//Write a program to find the sum of elements at even indices in an integer array.
	public static void indicesSum() {
	System.out.println("Enter Array Size : ");
	Scanner scanner= new Scanner(System.in);
	int [] arr = new int [scanner.nextInt()];
	
	for(int i = 0 ; i < arr.length ; i++) {
		System.out.println(" please enter "+  i+1 +" element of inex : ");
		arr[i] = scanner.nextInt();
	}
	int sum = 0 ;
	
	for(int j = 0 ; j < arr.length ; j++) {
		sum = sum + arr[j];
	}
	System.out.println("Total sum of Indices is : "+ sum);
	}
	public static void main(String[] args) {
		indicesSum();
		
	}
	
}
