package com.accolite.arrays;

public class MaximumConsecutiveOnesEfficient {

	public static void main(String[] args) {
		int[] arr= {0,1,1,1,0,1,1};
		int max=maxConsecutive1(arr);
		System.out.println(max);
	}

	private static int maxConsecutive1(int[] arr) {
		int result=0;
		int current=0;
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==0)
				current=0;
			else {
				current++;
				result=Math.max(current, result);
			}
		}
		return result;
	}
}

//theta(n)
//theta(1) aux space