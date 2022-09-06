package com.accolite.searching;

public class Count1sSortedBinary {
	public static void main(String[] args) {
		int[] arr= {0,0,0,1,1,1};
		int count=count1sSortedBinary(arr);
		System.out.println(count);
	}

	private static int count1sSortedBinary(int[] arr) {
		int len=arr.length;
		int firstOcc=firstOccurrence(arr, 1);
		
		return len-firstOcc;
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
}

//O(logn)
//o(1)