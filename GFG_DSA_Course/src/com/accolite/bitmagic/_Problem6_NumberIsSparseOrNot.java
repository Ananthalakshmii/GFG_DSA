package com.accolite.bitmagic;


//Given a number N. The task is to check whether it is sparse or not. 
//A number is said to be a sparse number if no two or more consecutive bits are set in the binary representation.

public class _Problem6_NumberIsSparseOrNot {
	public static void main(String[] args) {
		int N=12;
		boolean sparse=isSparse(N);
		System.out.println(sparse?"is a sparse number":"not a sparse number");
	}

	private static boolean isSparse(int n) {
		if(n<=2)
			return true;
		int temp=n;
		for(int i=0;Math.pow(2, i)<=temp;i++) {
			int temp1=(n%2==0)?0:1;
			int temp2=((n>>1)%2==0)?0:1;
			if(temp1==1 && temp2==1)
				return false;
			n=n>>1;
		}
		
		return true;
	}

}
