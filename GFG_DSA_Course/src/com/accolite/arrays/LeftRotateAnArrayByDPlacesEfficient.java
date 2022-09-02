package com.accolite.arrays;

public class LeftRotateAnArrayByDPlacesEfficient { //reversal algorithm
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int d=2;
		leftRotateAnArrayByD(arr,d);
		for(int i:arr)
			System.out.print(i+" ");
	}

	private static void leftRotateAnArrayByD(int[] arr, int d) {
		reverse(arr,0,d-1);
		reverse(arr,d,arr.length-1);
		reverse(arr,0,arr.length-1);
			
	}

	private static void reverse(int[] arr, int low, int high) {
		while(low<high) {
			swap(arr,low,high);
			low++;
			high--;
		}
	}

	private static void swap(int[] arr, int low, int high) {
		int temp=arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		
	}
}


//theta(n)
//theta(1) aux space