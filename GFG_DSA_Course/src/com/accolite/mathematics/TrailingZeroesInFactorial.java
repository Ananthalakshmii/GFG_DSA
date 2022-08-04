package com.accolite.mathematics;

public class TrailingZeroesInFactorial {

	public static void main(String[] args) {
		int num=10;
		long result=factorial(num);
		System.out.println(result);
		int zeroes=trailingZeroes(result);
		System.out.println(zeroes);
	}

	private static int trailingZeroes(long result) {
		int count=0;
		while(result%10 == 0) {
			count++;
			result=result/10;
		}
		return count;
	}

	private static long factorial(int num) {
		if(num==0)
			return 1;
		long factorial=1;
		while(num>0) {
			factorial=factorial*num;
			num=num-1;
		}
		return factorial;
	}
}

//theta(n)
//causes overflow ->long