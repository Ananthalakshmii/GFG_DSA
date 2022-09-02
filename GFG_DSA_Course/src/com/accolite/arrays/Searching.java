package com.accolite.arrays;

public class Searching { //Unsorted array

	public static void main(String[] args) {
		int[] arr= {20,5,7,25};
		int search=5;
		int result=search(arr,search);
		System.out.println(result);
	}

	private static int search(int[] arr, int search) {
		for(int i=0;i<arr.length;i++)
			if(arr[i]==search)
				return i;
		return -1;
		
	}
}

//O(n)
//if it is sorted-can do in binary search - O(log n)