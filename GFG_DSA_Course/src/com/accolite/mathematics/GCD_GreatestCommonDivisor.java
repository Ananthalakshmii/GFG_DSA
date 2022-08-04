package com.accolite.mathematics;

// finding the larger size square tile that fills the entire rectangle tile of size a*b = gcd of 2 numbers
public class GCD_GreatestCommonDivisor {

	public static void main(String[] args) {
		int a=10,b=15;
		int result=gcd(a,b);
		System.out.println(result);
	}

	private static int gcd(int a, int b) { // gcd- can start with maximum of min of 2 numbers
		int result=Math.min(a, b);
		while(result>0) {
			if(a%result==0 && b%result==0)
				return result;
			else
				result--;
		}
		return 1;
	}
}

//O(min(a,b))