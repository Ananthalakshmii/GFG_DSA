package com.accolite.searching;

public class _Problem4_SquareRootOfANumber {
	public static void main(String[] args) {
		int x=5;
		long sqrt=floorSqrt(x);
		System.out.println(sqrt);
		
	}

	private static long floorSqrt(int x) {
		long low=0;
		long high=x;
		long result=0;
		while(low<=high) {
			long mid=(low+high)/2;
			long sq=mid*mid;
			if(sq==x)
				return mid;
			if(sq<x) {
				result=mid;
				low++;
			}else {
				
				high--;
			}
		}
		return result;
	}

}
