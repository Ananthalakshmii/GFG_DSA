package com.accolite.arrays;

public class TrappingRainWaterEfficient {
	
	public static void main(String[] args) {
		int[] arr= {3,0,1,2,5};
		int res=getWater(arr);
		System.out.println(res);
	}

	private static int getWater(int[] arr) {
		int result=0;
		int[] lmax=new int[arr.length];
		int[] rmax=new int[arr.length];
		
		lmax[0]=arr[0];
		for(int i=1;i<arr.length;i++)
			lmax[i]=Math.max(lmax[0], arr[i]);
		
		rmax[arr.length-1]=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
			rmax[i]=Math.max(rmax[arr.length-1], arr[i]);
		
		for(int i=1;i<arr.length-1;i++)
			result+= Math.min(lmax[i], rmax[i]) - arr[i];
		
		return result;
	}

}

//theta(n)
//theta(n) aux space