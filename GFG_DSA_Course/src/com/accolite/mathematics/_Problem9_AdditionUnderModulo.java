package com.accolite.mathematics;

public class _Problem9_AdditionUnderModulo {
	public static void main(String[] args) {
		long a =  9223372036854775807L;
		long b = 9223372036854775807L;
		long sum=sumUnderModulo(a,b);
		System.out.println(sum);
	}

	private static long sumUnderModulo(long a, long b) {
		long s1=a%(long)(Math.pow(10, 9)+7);
		long s2=b%(long)(Math.pow(10, 9)+7);
		return ((s1+s2)%(long)(Math.pow(10, 9)+7));
	}

}
