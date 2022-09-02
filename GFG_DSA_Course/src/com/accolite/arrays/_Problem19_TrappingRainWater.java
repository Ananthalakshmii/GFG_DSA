package com.accolite.arrays;

public class _Problem19_TrappingRainWater {
	public static void main(String[] args) {
		int N=6;
		int[] arr= {3,0,0,2,0,4};
		long result=trappingWater(arr,N);
		System.out.println(result);
	}

	private static long trappingWater(int[] arr, int n) {
		long result=0;
		int[] lmax=new int[n];
		lmax[0]=arr[0];
		for(int i=1;i<n;i++)
			lmax[i]=Math.max(lmax[i-1], arr[i]);
		
		int[] rmax=new int[n];
		rmax[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--)
			rmax[i]=Math.max(rmax[i+1], arr[i]);
			
		
		for(int i=1;i<n-1;i++) {
			result=result+Math.min(rmax[i], lmax[i])-arr[i];
		}
		
		
		
		return result;
	}

}
