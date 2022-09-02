package com.accolite.arrays;

public class _Problem17_RearangeAnArrayOof1Space {

	public static void main(String[] args) {
		int N = 5;
		long arr[] = {4,0,2,1,3};
		arrange(arr,N);
		for(long i:arr)
			System.out.print(i+" ");
	}

	private static void arrange(long[] arr, int n) {
		long max=n;
		for(int i=0;i<n;i++) {
			arr[i]=arr[i]+(arr[(int) arr[i]]%max)*max;
		}
		for(int i=0;i<n;i++)
			arr[i]=arr[i]/max;
	}
}
