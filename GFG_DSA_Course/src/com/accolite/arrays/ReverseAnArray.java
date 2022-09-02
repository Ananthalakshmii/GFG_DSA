package com.accolite.arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
		int[] arr= {10,5,7,30};
		reverse(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		int[] arr1= {30,7,6,5,10};
		reverse(arr1);
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
	}

	private static void reverse(int[] arr) {
		int low=0;
		int high=arr.length-1;
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		
	}


}


//theta(n) - runs n/2 times
//aux space - theta(1)

//O(n)