package com.accolite.arrays;

public class _Problem12_FrequenciesOfLimitedRangeArrayElements {
	public static void main(String[] args) {
		
		int N=5,P=5;
		int[] arr= {2,3,2,3,5};
		frequencyCount(arr,N,P);
		System.out.println();
		int[] arr1= {2,4,5,6,8};
		frequencyCount(arr1, 5, 10);
	}

	private static void frequencyCount(int[] arr, int N, int P) {

		for(int i=0;i<N;i++) 
			arr[i]--;
		
		for(int i=0;i<N;i++) {
			if(arr[i]%P < N)
				arr[arr[i]%P]+=P;
		}
		
		for(int i=0;i<N;i++)
			arr[i]=arr[i]/P;
		
		for(int i:arr)
			System.out.print(i+" ");
		
	}

}
