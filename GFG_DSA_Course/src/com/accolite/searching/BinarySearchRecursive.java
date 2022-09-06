package com.accolite.searching;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		int search=20;
		int index=search(arr,search,0,arr.length-1);
		System.out.println(index);
	}

	private static int search(int[] arr, int search, int low, int high) {
		if(low>high)
			return -1;
		
		int mid=(low+high)/2;
		if(arr[mid]==search)
			return mid;
		else if(arr[mid]>search)
			return search(arr, search, low, mid-1);
		else
			return search(arr, search, mid+1, high);
		
	}
}


//O(logn)
//aux space - //O(logn)