package com.accolite.mathematics;

import java.math.BigInteger;

public class _Problem5_DigitsInFactorial {
	public static void main(String[] args) {
		int num=42;
		int result=digitsFactorial(num);
		System.out.println(result);
	}

	private static int digitsFactorial(int num) {
		BigInteger result=factorial(num);
		int digits=0;
		while(result.compareTo(BigInteger.ZERO)>0) {
			digits++;
			result=result.divide(BigInteger.TEN);
		}
		return digits;
	}

	private static BigInteger factorial(int num) {
		BigInteger result=BigInteger.ONE;
		for(int i=num;i>0;i--)
			result=result.multiply(BigInteger.valueOf(i));
		System.out.println(result);
		return result;
	}

}
