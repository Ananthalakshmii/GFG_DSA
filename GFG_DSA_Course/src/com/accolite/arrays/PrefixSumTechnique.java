package com.accolite.arrays;

//given a fixed array and multiple queries of following types on the array, how to efficiently perform these queries
//queries getsum(0,2)
//getsum(1,4)
//getsum(2,5)
public class PrefixSumTechnique {

	public static void main(String[] args) {
		int arr[]= {2,8,3,9,6,5,4};
		int leftIndex=1;
		int rightIndex=4;
		int sum=prefixSum(arr,leftIndex,rightIndex);
		System.out.println(sum);
	}

	private static int prefixSum(int[] arr, int leftIndex, int rightIndex) {
		// pre processing - o(n) and o(n)
		int prefix_sum[]=new int[arr.length];
		prefix_sum[0]=arr[0];
		for(int i=1;i<arr.length;i++)
			prefix_sum[i]=prefix_sum[i-1]+arr[i];
		
		//answering query in order of 1 time
		if(leftIndex!=0)
			return prefix_sum[rightIndex]-prefix_sum[leftIndex-1];
		else 
			return prefix_sum[rightIndex];
		
	}
}


//o(n)+o(1)
//o(n) aux space