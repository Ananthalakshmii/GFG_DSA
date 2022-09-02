package com.accolite.arrays;

public class _Problem1_ArrayInsertAtEnd {
	public static void main(String[] args) {
		int sizeOfArray = 6;
		int arr[] = new int[6];
			arr[0]=1;
			arr[1]=2;
			arr[2]=3;
			arr[3]=4;
			arr[4]=5;
		int element = 90;
		insertAtEnd(arr, sizeOfArray, element);
		for(int i:arr)
			System.out.print(i+" ");
	}
	
	public static void insertAtEnd(int arr[],int sizeOfArray,int element)
    {
       arr[sizeOfArray-1]=element;
    }

}
