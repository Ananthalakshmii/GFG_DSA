package com.accolite.mathematics;

//every number can be written as sum of powers of 2(set bits in binary representation)
//we can traverse thru all bits of a number from LSB to MSB in O(log n) time

public class ComputingPowerEfficientIterative {
	public static void main(String[] args) {
		int n=4,x=5; //n^x
		int result=powerEfficientIterative(n,x);
		System.out.println(result);
	}

	private static int powerEfficientIterative(int n, int x) {// bitwise for x=5 is 0101
		int result=1;
		while(x>0) {
			if(x%2!=0)
				result=result*n;
			n=n*n; // to multiply for the 0 bits and use if there is one ahead in MSB
			x=x/2;
		}
		
		return result;
	}
	

}

//O(logn)
//auxilary space: O(1) better than recursive soln