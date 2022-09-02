package com.accolite.arrays;

public class MaximumConsecutiveOnesNaive {

	public static void main(String[] args) {
		int[] arr= {0,1,1,1,0,1,1};
		int max=maxConsecutive1(arr);
		System.out.println(max);
	}

	private static int maxConsecutive1(int[] arr) {
		int result=0;
		
		for(int i=0;i<arr.length;i++) {
			int current=0;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]==1) 
					current++;
				else
					break;
			}
			result=Math.max(result, current);
		}
		return result;
	}
}

//O(n^2)