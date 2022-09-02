package com.accolite.arrays;

public class PrefixSum_EquilibriumPoint {

	public static void main(String[] args) {
		int[] arr= {3,4,8,-9,20,6};
		boolean isEqui=isEquilibrium(arr);
		System.out.println(isEqui);
	}

	private static boolean isEquilibrium(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		
		int left_sum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(left_sum==(sum-arr[i]))
				return true;
			left_sum+=arr[i];
			sum-=arr[i];
		}
		return false;
	}
}


//o(n)
//o(1) aux space