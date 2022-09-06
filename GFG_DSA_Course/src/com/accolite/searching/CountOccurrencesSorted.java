package com.accolite.searching;

public class CountOccurrencesSorted {
	public static void main(String[] args) {
		int[] arr= {5,10,10,10,10,20,20};
		int search=10;
		int index=count(arr,search);
		System.out.println(index);
	}

	private static int count(int[] arr, int search) {
		int firstOccurrence=firstOccurrence(arr,search);
		if(firstOccurrence==-1)
			return 0;
		int lastOccurrence=lastOccurrence(arr,search);
		
		return lastOccurrence-firstOccurrence+1;
	}
	
	private static int firstOccurrence(int[] arr, int search) {
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
	
	private static int lastOccurrence(int[] arr, int search) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]<search)
				low=mid+1;
			else if(arr[mid]>search)
				high=mid-1;
			else {
				if(mid==arr.length-1 || arr[mid+1]!=search)
					return mid;
				else
					low=mid+1;
			}
		}
		return -1;
	}

}


//o(logn)