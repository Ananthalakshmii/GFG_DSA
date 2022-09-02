package com.accolite.arrays;

public class MoveAllZeroesToEndNaive {
	public static void main(String[] args) {
		int[] arr= {8,5,0,10,0,20};
		moveZeroesToEnd(arr);
		for(int i:arr)
			System.out.print(i+" ");
	}

	private static void moveZeroesToEnd(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=0) 
						swap(arr,i,j);
				}
			}
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}


//O(n^2)