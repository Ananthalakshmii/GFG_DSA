package com.accolite.mathematics;

public class ComputingPower {
	public static void main(String[] args) {
		int x=3,n=3;
		int result=power(x,n);
		System.out.println(result);
	}

	private static int power(int x, int n) {
		int result=1;
		for(int i=0;i<n;i++) {
			result=result*x;
		}
		return result;
	}

}

//theta(n)