package com.accolite.searching;

public class _Problem12_MaxWaterBetween2Buildings {
	public static void main(String[] args) {
		int height[] = {2,1,3,4,6,5};
		int max=maxWater(height,6);
		System.out.println(max);
		int[] arr= {2,1};
		System.out.println(maxWater(arr, 2));
	}

	private static int maxWater(int[] height, int n) {
		int result=0;
		int low=0;
		int high=n-1;
		while(low<=high) {
			if(height[low]<height[high]) {
				result=Math.max(result, height[low]*(high-low-1));
				low++;
			}else {
				result=Math.max(result, height[high]*(high-low-1));
				high--;
			}
		}
		return result;
	}

}
