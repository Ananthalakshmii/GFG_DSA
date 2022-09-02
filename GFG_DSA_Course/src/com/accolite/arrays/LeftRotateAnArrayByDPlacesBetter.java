package com.accolite.arrays;

public class LeftRotateAnArrayByDPlacesBetter {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int d=2;
		leftRotateAnArrayByD(arr,d);
		for(int i:arr)
			System.out.print(i+" ");
	}

	private static void leftRotateAnArrayByD(int[] arr, int d) {
		int[] temp=new int[d];
		for(int i=0;i<d;i++)
			temp[i]=arr[i];
		
		for(int i=d;i<arr.length;i++)
			arr[i-d]=arr[i];
		
		for(int i=0;i<d;i++)
			arr[arr.length-d+i]=temp[i];
	}
	
}


//theta(n)
//theta(d) aux space