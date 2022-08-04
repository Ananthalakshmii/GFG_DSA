package com.accolite.mathematics;

/*
 EUCLID ALGORITHM:
 Let b be greater than a, then GCD(a,b)=GCD(a-b)
 */
public class GCD_Euclid_Efficient {
	public static void main(String[] args) {
		int a=12,b=15;
		int gcd=euclid_gcd(a,b);
		System.out.println(gcd);
	}

	private static int euclid_gcd(int a, int b) {
		while(a!=b) {
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		return a; //or b.. both are same
	}

}
