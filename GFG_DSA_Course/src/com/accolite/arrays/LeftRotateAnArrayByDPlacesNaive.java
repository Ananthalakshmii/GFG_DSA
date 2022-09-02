package com.accolite.arrays;

public class LeftRotateAnArrayByDPlacesNaive {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int d=2;
		leftRotateAnArrayByD(arr,d);
		for(int i:arr)
			System.out.print(i+" ");
	}

	private static void leftRotateAnArrayByD(int[] arr,int d) {
		for(int i=0;i<d;i++)
			leftRotateByOne(arr);
	}

	private static void leftRotateByOne(int[] arr) {
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
			arr[i-1]=arr[i];
		arr[arr.length-1]=temp;
	}

}

//theta(nd)
//theta(1) aux space