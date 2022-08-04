package com.accolite.mathematics;

public class _Problem10_MultiplicationUnderModulo {
	public static void main(String[] args) {
		long a = 92233720368547758L, b = 92233720368547758L;
		long multiply=multiplicationUnderModulo(a,b);
		System.out.println(multiply);
	}

	private static long multiplicationUnderModulo(long a, long b) {
		long s1=a%(long)(Math.pow(10, 9)+7);
		long s2=b%(long)(Math.pow(10, 9)+7);
		return (s1*s2)%(long)(Math.pow(10, 9)+7);
	}

}
