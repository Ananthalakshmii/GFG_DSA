package com.accolite.searching;

public class BinarySearchIterative {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		int search=20;
		int index=search(arr,search);
		System.out.println(index);
	}

	private static int search(int[] arr, int search) {
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==search)
				return mid;
			else if(arr[mid]>search)
				high=mid-1;
			else
				low=low+1;
		}
		return -1;
	}

}


//O(logn)
//height of the tree- ceiling of log n to the base 2