package com.accolite.searching;

public class IndexOfLastOccurrenceSortedRecursive {
	public static void main(String[] args) {
		int[] arr= {5,10,10,10,10,20,20};
		int search=10;
		int index=search(arr,search,0,arr.length-1);
		System.out.println(index);
	}

	private static int search(int[] arr, int search, int low, int high) {
		if(low>high)
			return -1;
		int mid=(low+high)/2;
		if(arr[mid]>search)
			return search(arr, search, low, mid-1);
		else if(arr[mid]<search)
			return search(arr, search, mid+1, high);
		else {
			if(mid==arr.length-1 || arr[mid+1]!=search)
				return mid;
			else
				return search(arr, search, mid+1, high);
						
		}
	}

}


//o(logn)
//o(logn)