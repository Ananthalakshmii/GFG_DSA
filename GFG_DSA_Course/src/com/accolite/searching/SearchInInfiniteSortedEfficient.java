package com.accolite.searching;

public class SearchInInfiniteSortedEfficient { //Unbounded binary search
	public static void main(String[] args) {
		int arr[]= {1,10,100,200,435,654}; //not considering the size of array.. arr={1,10,200,...}
		int x=10;
		int search=search(arr,x);
		System.out.println(search);
	}

	private static int search(int[] arr, int x) {
		if(arr[0]==x)
			return 0;
		int index=1;
		while(arr[index]<x)
			index=index*2;
		if(arr[index]==x)
			return index;
		else
			return binarySearch(arr,x,index/2+1,index-1);
	}

	private static int binarySearch(int[] arr, int x, int low, int high) {
		if(low>high)
			return -1;
		int mid=(low+high)/2;
		if(arr[mid]==x)
			return mid;
		else if(arr[mid]<x)
			return binarySearch(arr, x, mid+1, high);
		else
			return binarySearch(arr, x, low, mid-1);
		}
	}


//o(log(position))
