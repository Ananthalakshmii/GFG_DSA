package com.accolite.mathematics;

public class _Problem4_FactorialOfANumber {
	public static void main(String[] args) {
		int num=4;
		long result=factorial(num);
		System.out.println(result);
	}

	private static long factorial(int num) {
		long result=1;
		for(int i=num;i>0;i--)
			result=result*i;
		return result;
	}

}
