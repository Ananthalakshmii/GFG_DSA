package com.accolite.arrays;

public class _Problem11_WaveArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int n=5;
		convertToWave(n,arr);
	}

	private static void convertToWave(int n, int[] arr) {

		for(int i=0;i<n-1;i+=2) {
			swap(arr,i,i+1);
		}
		for(int i:arr)
			System.out.print(i+" ");
	}

	private static void swap(int[] arr,int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}
