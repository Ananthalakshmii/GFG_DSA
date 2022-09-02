package com.accolite.arrays;

public class _Problem2_ArrayInsertAtIndex {

	public static void main(String[] args) {
		int sizeOfArray = 6;
		int arr[] = new int[6];
			arr[0]=1;
			arr[1]=2;
			arr[2]=3;
			arr[3]=4;
			arr[4]=5;
			int index=2;
		int element = 90;
		insertAtIndex(arr, sizeOfArray,index, element);
		for(int i:arr)
			System.out.print(i+" ");
	}

	private static void insertAtIndex(int[] arr, int sizeOfArray, int index,int element) {
		for(int i=sizeOfArray-1;i>index;i--)
			arr[i]=arr[i-1];
		arr[index]=element;
		
	}
}
