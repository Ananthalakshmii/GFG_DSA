package com.accolite.arrays;

public class LeadersInAnArrayEfficient { // will print the leaders from right to left
	public static void main(String[] args) { 
		int[] arr= {7,10,4,3,6,5,2};
		printLeaders(arr);
	}

	private static void printLeaders(int[] arr) {
		
		int current_leader=arr[arr.length-1];
		System.out.print(current_leader+" ");
		
		for(int i=arr.length-2;i>=0;i--) {
			if(current_leader<arr[i]) {
				current_leader=arr[i];
				System.out.print(arr[i]+" ");
			}
		}
	}
}

//theta(n)