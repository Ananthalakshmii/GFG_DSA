package com.accolite.searching;

public class IndexOfFirstOccurrenceSortedIterative {

	public static void main(String[] args) {
		int[] arr= {5,10,10,15,20,20,20};
		int search=20;
		int index=search(arr,search);
		System.out.println(index);
	}

	private static int search(int[] arr, int search) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]<search)
				low=mid+1;
			else if(arr[mid]>search)
				high=mid-1;
			else {
				if(mid==0 || arr[mid-1]!=search)
					return mid;
				else
					high=mid-1;
			}
		}
		return -1;
	}
	
}


//o(logn)