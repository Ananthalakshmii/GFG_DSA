package com.accolite.arrays;

public class MoveAllZeroesToEndEfficient {

	public static void main(String[] args) {
		int[] arr= {8,5,0,10,0,20};
		moveZeroesToEnd(arr);
		for(int i:arr)
			System.out.print(i+" ");
	}

	private static void moveZeroesToEnd(int[] arr) {
		int countOfNonZeroElements=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				swap(arr, i, countOfNonZeroElements);
				countOfNonZeroElements++;
			}
		}
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}


//O(n)
// constant aux space- O(1)