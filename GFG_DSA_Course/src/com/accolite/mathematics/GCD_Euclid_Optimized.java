package com.accolite.mathematics;

//Optimized Euclidean algorithm
public class GCD_Euclid_Optimized {
	
	public static void main(String[] args) {
		int a=12,b=15;
		int gcd=euclid_gcd_optimized(a,b);
		System.out.println(gcd);
		
	}

	private static int euclid_gcd_optimized(int a, int b) {
		if(b==0)
			return a;
		return euclid_gcd_optimized(b, a%b);
	}
	

}

//O(log(min(a,b))