package com.accolite.mathematics;

public class _Problem6_GPTerm {
	public static void main(String[] args) {
		int a=84,b=87,n=3;
		double gp=termGP(a,b,n);
		System.out.println(gp);
	}

	private static double termGP(int a, int b, int n) {
		double ratio=(double)b/(double)a;
		double term=a*Math.pow(ratio, n-1);
		return term;
	}

}
