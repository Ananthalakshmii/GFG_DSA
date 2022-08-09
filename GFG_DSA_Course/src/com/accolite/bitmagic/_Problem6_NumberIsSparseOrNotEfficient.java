package com.accolite.bitmagic;


//Given a number N. The task is to check whether it is sparse or not. 
//A number is said to be a sparse number if no two or more consecutive bits are set in the binary representation.

public class _Problem6_NumberIsSparseOrNotEfficient {
	public static void main(String[] args) {
		int N=12;
		boolean sparse=isSparse(N);
		System.out.println(sparse?"is a sparse number":"not a sparse number");
	}

	private static boolean isSparse(int n) {
		if((n & (n>>1)) ==0)
			return true;
		else
			return false;
	}

}
