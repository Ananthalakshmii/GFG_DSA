package com.accolite.arrays;

public class _Problem8_RotateArray {
	public static void main(String[] args) {
		int N = 5, D = 2;
		int arr[] = {1,2,3,4,5};
		rotateArr(arr,D,N);
		for(int i:arr)
			System.out.print(i+" ");
		
		System.out.println();
		int[] arr1= {40 ,13 ,27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93, 
				53, 57, 2, 81, 87, 42, 66, 90, 45, 20, 41, 30, 32, 18, 98, 72, 82, 76, 10, 28, 68, 57, 98, 54, 87, 66, 7, 84, 20, 
				25, 29, 72, 33, 30, 4, 20, 71, 69, 9, 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1, 35, 65, 25};
		rotateArr(arr1, 69, 77);
		for(int i:arr1)
			System.out.print(i+" ");
	}

	private static void rotateArr(int[] arr, int d, int n) {
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}

	private static void reverse(int[] arr, int low, int high) {
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}

}
