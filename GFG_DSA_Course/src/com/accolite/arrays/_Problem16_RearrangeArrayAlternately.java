package com.accolite.arrays;

public class _Problem16_RearrangeArrayAlternately {
	public static void main(String[] args) {
		int N = 6;
		long arr[] = {1,2,3,4,5,6};
		rearrange(arr,N);
		
		for(long i:arr)
			System.out.print(i+" ");
	}

	private static void rearrange(long[] arr, int n) {
		
		int min=0,max=n-1;
		long maxEle=arr[n-1]+1;
		
		for(int i=0;i<n;i++) {
			if(i%2==0)
				arr[i]=arr[i]+(arr[max--]%maxEle)*maxEle;
			else
				arr[i]=arr[i]+(arr[min++]%maxEle)*maxEle;
		}
		
		for(int i=0;i<n;i++)
			arr[i]=arr[i]/maxEle;
		/*int start=0;
		int end=n-1;
		long[] arr1=new long[n];
		for(int i=0;i<n;i++) {
			if(i%2==0) {//even index
				arr1[i]=arr[end--];
			}else {//odd index
				arr1[i]=arr[start++];
			}
		}
		for(long i:arr1)
			System.out.print(i+" ");*/
		
	}
}
