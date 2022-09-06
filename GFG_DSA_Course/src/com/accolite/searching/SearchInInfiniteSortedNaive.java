package com.accolite.searching;

public class SearchInInfiniteSortedNaive {
	public static void main(String[] args) {
		int arr[]= {1,10,100,200,435,654}; //not considering the size of array.. arr={1,10,200,...}
		int x=10;
		int search=search(arr,x);
		System.out.println(search);
	}

	private static int search(int[] arr,int search) {
		int i=0;
		while(true) {
			if(arr[i]==search)
				return i;
			if(arr[i]>search)
				return -1;
			i++;
		}
	}

}

//o(position)
//o(1)