package com.accolite.arrays;

public class TrappingRainWaterNaive {
	
	public static void main(String[] args) {
		int[] arr= {3,0,1,2,5};
		int res=getWater(arr);
		System.out.println(res);
	}

	private static int getWater(int[] arr) {
		int result=0;
		
		for(int i=1;i<arr.length-1;i++) {
			
			int lmax=arr[i];
			for(int j=0;j<i;j++)
				lmax=Math.max(lmax, arr[j]);
			
			int rmax=arr[i];
			for(int j=i+1;j<arr.length;j++)
				rmax=Math.max(rmax, arr[j]);
			
			result+= Math.min(lmax, rmax)-arr[i];
		}
		
		return result;
	}

}


//theta(n^2)