package com.accolite.recursion;

public class _Problem10_PowerOfNumbers {
	public static void main(String[] args) {
		long n=12, r=21;
		long pow=power(n,r);
		System.out.println(pow);
		System.out.println(power(39907139, 93170993)); //752962679
	}

	private static long power(long n, long r) {
			
		if(r==0)
			return 1;
		
		long temp=power(n, r/2);
		temp=(temp*temp)%(long) (Math.pow(10, 9)+7);
		
		if(r%2==0)
			return temp;
		else
			return (temp*n)%(long) (Math.pow(10, 9)+7);
	}

}
