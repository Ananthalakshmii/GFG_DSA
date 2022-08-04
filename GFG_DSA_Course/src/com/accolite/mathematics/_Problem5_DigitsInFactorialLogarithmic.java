package com.accolite.mathematics;

public class _Problem5_DigitsInFactorialLogarithmic {

	public static void main(String[] args) {
		int num=42;
		int result=digitsFactorial(num);
		System.out.println(result);
	}

	private static int digitsFactorial(int num) {
		if(num<0)
			return 0;
		if(num==1)
			return 1;
		double digits=0;
		for(int i=2;i<=num;i++)
			digits=digits+Math.log10(i);
		return (int) (Math.floor(digits)+1);
	}
}
