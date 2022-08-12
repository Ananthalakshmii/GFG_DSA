package com.accolite.recursion;

public class SubsetSumProblem {
	public static void main(String[] args) {
		int[] arr= {10,20,15};
		int sum=25;
		int count=countSubsetSum(arr,sum,arr.length);
		System.out.println(count);
		int[] arr1= {10,5,2,3,6};
		int sum1=8;
		int count1=countSubsetSum(arr1, sum1, arr1.length);
		System.out.println(count1);
	}

	private static int countSubsetSum(int[] arr, int sum, int length) { // without maintaining arraylist, we are reducing sum till we
		//reach the leaf and check if the leaf node has sum =0
		if(length==0)
			return (sum==0)?1:0;
		return countSubsetSum(arr, sum, length-1)+ 
				countSubsetSum(arr, sum-arr[length-1], length-1);
	}

}

//theta(2^n)+theta(2^n -1) // leaf nodes+ intermediate nodes
//-> theta(2^n)
